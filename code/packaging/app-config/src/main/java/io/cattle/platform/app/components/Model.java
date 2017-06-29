package io.cattle.platform.app.components;

import io.cattle.platform.api.auth.Identity;
import io.cattle.platform.api.pubsub.model.Publish;
import io.cattle.platform.core.addon.ActiveSetting;
import io.cattle.platform.core.addon.BlkioDeviceOption;
import io.cattle.platform.core.addon.CatalogTemplate;
import io.cattle.platform.core.addon.ComposeConfig;
import io.cattle.platform.core.addon.ContainerUpgrade;
import io.cattle.platform.core.addon.HaproxyConfig;
import io.cattle.platform.core.addon.InServiceUpgradeStrategy;
import io.cattle.platform.core.addon.InstanceHealthCheck;
import io.cattle.platform.core.addon.LoadBalancerCookieStickinessPolicy;
import io.cattle.platform.core.addon.LogConfig;
import io.cattle.platform.core.addon.MountEntry;
import io.cattle.platform.core.addon.NetworkPolicyRule;
import io.cattle.platform.core.addon.NetworkPolicyRule.NetworkPolicyRuleAction;
import io.cattle.platform.core.addon.NetworkPolicyRule.NetworkPolicyRuleWithin;
import io.cattle.platform.core.addon.NetworkPolicyRuleBetween;
import io.cattle.platform.core.addon.NetworkPolicyRuleMember;
import io.cattle.platform.core.addon.PortBinding;
import io.cattle.platform.core.addon.PortRule;
import io.cattle.platform.core.addon.ProcessPool;
import io.cattle.platform.core.addon.ProcessSummary;
import io.cattle.platform.core.addon.RestartPolicy;
import io.cattle.platform.core.addon.ScalePolicy;
import io.cattle.platform.core.addon.SecretReference;
import io.cattle.platform.core.addon.ServiceLink;
import io.cattle.platform.core.addon.ServiceRollback;
import io.cattle.platform.core.addon.ServiceUpgrade;
import io.cattle.platform.core.addon.ServiceUpgradeStrategy;
import io.cattle.platform.core.addon.ServicesPortRange;
import io.cattle.platform.core.addon.TargetPortRule;
import io.cattle.platform.core.addon.Ulimit;
import io.cattle.platform.core.addon.VirtualMachineDisk;
import io.cattle.platform.core.addon.VolumeActivateInput;
import io.cattle.platform.core.model.CattleTable;
import io.cattle.platform.db.jooq.utils.SchemaRecordTypeListGenerator;
import io.cattle.platform.docker.api.model.ContainerExec;
import io.cattle.platform.docker.api.model.ContainerLogs;
import io.cattle.platform.docker.api.model.ContainerProxy;
import io.cattle.platform.docker.api.model.DockerBuild;
import io.cattle.platform.docker.api.model.HostAccess;
import io.cattle.platform.docker.api.model.ServiceProxy;
import io.cattle.platform.docker.machine.api.addon.BaseMachineConfig;
import io.cattle.platform.engine.process.StateTransition;
import io.cattle.platform.extension.api.model.ProcessDefinitionApi;
import io.cattle.platform.extension.api.model.ResourceDefinition;
import io.cattle.platform.host.api.HostApiProxyTokenImpl;
import io.cattle.platform.host.stats.api.StatsAccess;
import io.cattle.platform.iaas.api.auth.identity.Token;
import io.cattle.platform.iaas.api.auth.integration.azure.AzureConfig;
import io.cattle.platform.iaas.api.auth.integration.ldap.OpenLDAP.OpenLDAPConfig;
import io.cattle.platform.iaas.api.auth.integration.ldap.ad.ADConfig;
import io.cattle.platform.iaas.api.auth.integration.local.LocalAuthConfig;
import io.cattle.platform.iaas.api.auth.projects.Member;
import io.cattle.platform.object.meta.TypeSet;
import io.cattle.platform.process.builder.ResourceProcessBuilder;
import io.github.ibuildthecloud.gdapi.doc.FieldDocumentation;
import io.github.ibuildthecloud.gdapi.doc.TypeDocumentation;

import java.util.Arrays;

import com.google.common.eventbus.Subscribe;

public class Model {

    Framework f;

    public Model(Framework framework) {
        this.f = framework;
        init();
    }

    private void init() {
        setupTypes();
        setupProcessDefinitions();
        f.wireUpTypes();
    }

    private void setupProcessDefinitions() {
        defaultProcesses("accountLink");
        defaultProcesses("credential");
        defaultProcesses("network");
        defaultProcesses("projectMember");
        defaultProcesses("storagePool");
        defaultProcesses("subnet");
        defaultProcesses("volumeTemplate");

        // GenericObject
        process("genericobject.create").resourceType("genericObject").start("requested").transitioning("activating").done("active").build();
        process("genericobject.create").resourceType("genericObject").start("requested,active,activating").transitioning("removing").done("removed").build();

        // Account
        defaultProcesses("account");
        process("account.purge").resourceType("account").start("removed").transitioning("purging").done("purged").build();
        process("account.upgrade").resourceType("account").start("active").transitioning("upgrading").done("active").build();

        // Host
        defaultProcesses("host");
        process("host.activate").resourceType("host").start("inactive,registering,provisioned").transitioning("activating").done("active").build();
        process("host.provision").resourceType("host").start("inactive").transitioning("provisioning").done("provisioned").build();
        process("host.error").resourceType("host").start("provisioning").transitioning("erroring").done("error").build();
        process("host.remove").resourceType("host").start("erroring,error,requested,inactive,activating,deactivating,registering,updating-active,updating-inactive,provisioning").transitioning("removing").done("removed").build();

        // Agent
        defaultProcesses("agent");
        process("agent.remove").resourceType("agent").start("active,disconnecting,disconnected,requested,inactive,registering,updating-active,updating-inactive,reconnected,finishing-reconnect").transitioning("removing").done("removed").build();
        process("agent.deactivate").resourceType("agent").start("disconnecting,disconnected,active,activating,reconnecting,updating-active,updating-inactive,reconnected,finishing-reconnect").transitioning("deactivating").done("inactive").build();
        process("agent.reconnect").resourceType("agent").start("disconnecting,disconnected,active,activating").transitioning("reconnecting").done("reconnected").build();
        process("agent.finishreconnect").resourceType("agent").start("reconnected,reconnecting").transitioning("finishing-reconnect").done("active").build();
        process("agent.disconnect").resourceType("agent").start("reconnecting,active,reconnected,finishing-reconnect").transitioning("disconnecting").done("disconnected").build();

        // Instance
        process("instance.create").resourceType("instance").start("requested").transitioning("creating").done("stopped").build();
        process("instance.start").resourceType("instance").start("stopped,creating").transitioning("starting").done("active").build();
        process("instance.update").resourceType("instance").start("stopped,active").transitioning("stopped=updating-stopped,active=updating-active").done("updating-stopped=stopped,updating-active=active").build();
        process("instance.restart").resourceType("instance").start("running").transitioning("restarting").done("running").build();
        process("instance.updatehealthy").resourceType("instance").stateField("healthState").start("healthy,unhealthy,initializing,reinitializing").transitioning("updating-healthy").done("healthy").build();
        process("instance.updateunhealthy").resourceType("instance").stateField("healthState").start("healthy,unhealthy").transitioning("updating-unhealthy").done("unhealthy").build();
        process("instance.updatereinitializing").resourceType("instance").stateField("healthState").start("healthy").transitioning("updating-reinitializing").done("reinitializing").build();
        process("instance.error").resourceType("instance").start("creating,stopped").transitioning("erroring").done("error").build();
        process("instance.remove").resourceType("instance").start("requested,creating,updating-running,updating-stopped,stopped,erroring,error").transitioning("removing").done("removed").build();
        process("instance.stop").resourceType("instance").start("creating,running,starting,restarting,updating-running,updating-stopped").transitioning("stopping").done("stopped");

        // Volume
        defaultProcesses("volume");
        process("volume.activate").resourceType("volume").start("inactive,registering,detached").transitioning("activating").done("active").build();
        process("volume.deactivate").resourceType("volume").start("registering,creating,active,activating,updating-active,updating-inactive").transitioning("deactivating").done("deactivating=detached,activating=inactive").build();
        process("volume.remove").resourceType("volume").start("requested,inactive,detached,deactivating,registering,updating-active,updating-inactive").transitioning("removing").done("removed").build();

        // NetworkDriver
        process("networkdriver.create").resourceType("networkDriver").start("requested").transitioning("creating").done("active").build();
        process("networkdriver.activate").resourceType("networkDriver").start("requested,inactive").transitioning("activating").done("active").build();
        process("networkdriver.deactivate").resourceType("networkDriver").start("activating,active").transitioning("deactivating").done("inactive").build();
        process("networkdriver.remove").resourceType("networkDriver").start("requested,creating,inactive,active").transitioning("removing").done("removed").build();
        process("networkdriver.update").resourceType("networkDriver").start("active,inactive").transitioning("updating").done("active").build();

        // StorageDriver
        process("storagedriver.create").resourceType("storageDriver").start("requested").transitioning("creating").done("active").build();
        process("storagedriver.activate").resourceType("storageDriver").start("requested,inactive").transitioning("activating").done("active").build();
        process("storagedriver.deactivate").resourceType("storageDriver").start("activating,active").transitioning("deactivating").done("inactive").build();
        process("storagedriver.remove").resourceType("storageDriver").start("requested,creating,inactive,active").transitioning("removing").done("removed").build();
        process("storagedriver.update").resourceType("storageDriver").start("active,inactive").transitioning("updating").done("active").build();

        // Mount
        process("mount.create").resourceType("mount").start("requested").transitioning("activating").done("active").build();
        process("mount.deactivate").resourceType("mount").start("requested,active,activating").transitioning("deactivating").done("inactive").build();
        process("mount.remove").resourceType("mount").start("inactive,deactivating").transitioning("removing").done("removed").build();

        // ProjectTemplate
        process("projecttemplate.create").resourceType("projectTemplate").start("requested").transitioning("activating").done("active").build();
        process("projecttemplate.remove").resourceType("projectTemplate").start("requested,activating,active").transitioning("removing").done("removed").build();

        // Physical Host
        process("physicalhost.create").resourceType("physicalHost").start("requested").transitioning("creating").done("created").build();
        process("physicalhost.bootstrap").resourceType("physicalHost").start("created,creating").transitioning("bootstrapping").done("active").build();
        process("physicalhost.remove").resourceType("physicalHost").start("created,active,requested,bootstrapping,creating,updating,error,erroring").transitioning("removing").done("removed").build();
        process("physicalhost.update").resourceType("physicalHost").start("active").transitioning("updating").done("active").build();
        process("physicalhost.error").resourceType("physicalHost").start("creating, bootstrapping, updating").transitioning("erroring").done("error").build();

        // Stack
        process("stack.create").resourceType("stack").start("requested").transitioning("activating").done("active").build();
        process("stack.update").resourceType("stack").start("active").transitioning("updating-active").done("active").build();
        process("stack.remove").resourceType("stack").start("requested, active, activating, updating-active, error, erroring, upgrading, canceling-upgrade, rolling-back, finishing-upgrade, upgraded, canceled-upgrade").transitioning("removing").done("removed").build();
        process("stack.error").resourceType("stack").start("activating").transitioning("erroring").done("error").build();
        process("stack.upgrade").resourceType("stack").start("active,canceled-upgrade").transitioning("upgrading").done("upgraded").build();
        process("stack.cancelupgrade").resourceType("stack").start("upgrading,finishing-upgrade").transitioning("canceling-upgrade").done("canceled-upgrade").build();
        process("stack.rollback").resourceType("stack").start("upgrading,upgraded,canceled-upgrade").transitioning("rolling-back").done("active").build();
        process("stack.finishupgrade").resourceType("stack").start("upgraded").transitioning("finishing-upgrade").done("active").build();

        // Service Discovery Service
        process("service.create").resourceType("service").start("requested").transitioning("registering").done("inactive").build();
        process("service.activate").resourceType("service").start("inactive,restarting,paused,error").transitioning("activating").done("active").build();
        process("service.update").resourceType("service").start("error,inactive,active,updating-active,finishing-upgrade,activating,upgrading,rolling-back").transitioning("error=updating-active,inactive=updating-inactive,active=updating-active,updating-active=updating-active,finishing-upgrade=finishing-upgrade,activating=activating,upgrading=upgrading,rolling-back=rolling-back").done("updating-inactive=inactive,updating-active=active,finishing-upgrade=active,activating=active,upgrading=upgraded,rolling-back=active").build();
        process("service.deactivate").resourceType("service").start("restarting,active,activating,updating-inactive,updating-active,paused,error").transitioning("deactivating").done("inactive").build();
        process("service.remove").resourceType("service").start("requested,inactive,registering,active,activating,updating-inactive,updating-active,upgrading,upgraded,rolling-back,deactivating,pausing,paused,finishing-upgrade,restarting,erroring,error").transitioning("removing").done("removed").build();
        process("service.upgrade").resourceType("service").start("active,activating,inactive,updating-active").transitioning("upgrading").done("upgraded").build();
        process("service.pause").resourceType("service").start("requested,inactive,registering,active,activating,updating-inactive,updating-active,upgrading,upgraded,rolling-back,deactivating,pausing,finishing-upgrade,restarting,erroring,error").transitioning("pausing").done("paused").build();
        process("service.cancelupgrade").resourceType("service").start("upgrading,upgraded,finishing-upgrade,active").transitioning("pausing").done("paused").build();
        process("service.error").resourceType("service").start("requested,inactive,registering,active,activating,updating-inactive,updating-active,upgrading,upgraded,rolling-back,deactivating,pausing,finishing-upgrade,restarting").transitioning("erroring").done("error").build();
        process("service.rollback").resourceType("service").start("upgrading,upgraded,paused,active,error").transitioning("rolling-back").done("active").build();
        process("service.finishupgrade").resourceType("service").start("upgraded").transitioning("finishing-upgrade").done("active").build();
        process("service.restart").resourceType("service").start("active").transitioning("restarting").done("active").build();

        // Container Event
        process("containerevent.create").resourceType("containerEvent").start("requested").transitioning("creating").done("created").build();
        process("containerevent.remove").resourceType("containerEvent").start("created,creating").transitioning("removing").done("removed").build();

        // External Event
        process("externalevent.create").resourceType("externalEvent").start("requested").transitioning("creating").done("created").build();
        process("externalevent.remove").resourceType("externalEvent").start("created,creating").transitioning("removing").done("removed").build();

        //  Secrets
        process("secret.create").resourceType("secret").start("requested").transitioning("creating").done("active").build();
        process("secret.remove").resourceType("secret").start("active,creating").transitioning("removing").done("removed").build();

        // Service Event
        process("serviceevent.create").resourceType("serviceEvent").start("requested").transitioning("creating").done("created").build();
        process("serviceevent.remove").resourceType("serviceEvent").start("created,creating").transitioning("removing").done("removed").build();

        // User Preference
        defaultProcesses("userPreference");
        process("userpreference.remove").resourceType("userPreference").start("inactive,active").transitioning("removing").done("removed").build();

        // Certificate
        process("certificate.create").resourceType("certificate").start("requested").transitioning("activating").done("active").build();
        process("certificate.remove").resourceType("certificate").start("requested,active,activating").transitioning("removing").done("removed").build();
        process("certificate.update").resourceType("certificate").start("active").transitioning("updating-active").done("active").build();

        // Storage Pool Host Map
        process("storagepoolhostmap.create").resourceType("storagePoolHostMap").start("requested").transitioning("activating").done("active").build();
        process("storagepoolhostmap.remove").resourceType("storagePoolHostMap").start("requested,active,activating").transitioning("removing").done("removed").build();

        // Machine driver
        process("machinedriver.create").resourceType("machineDriver").start("requested").transitioning("registering").done("inactive").build();
        process("machinedriver.activate").resourceType("machineDriver").start("inactive,registering").transitioning("activating").done("active").build();
        process("machinedriver.reactivate").resourceType("machineDriver").start("active,error").transitioning("activating").done("active").build();
        process("machinedriver.error").resourceType("machineDriver").start("active,activating,updating-active,updating-inactive").transitioning("erroring").done("error").build();
        process("machinedriver.deactivate").resourceType("machineDriver").start("active,activating,updating-active,updating-inactive").transitioning("deactivating").done("inactive").build();
        process("machinedriver.remove").resourceType("machineDriver").start("requested,inactive,activating,deactivating,registering,updating-active,updating-inactive,active,error").transitioning("removing").done("removed").build();
        process("machinedriver.update").resourceType("machineDriver").start("error,inactive,active").transitioning("error=updating-inactive,inactive=updating-inactive,active=updating-active").done("updating-inactive=inactive,updating-active=active").build();

        // Dynamic Schema
        process("dynamicschema.create").resourceType("dynamicSchema").start("requested").transitioning("creating").done("active").build();
        process("dynamicschema.remove").resourceType("dynamicSchema").start("active").transitioning("removing").done("removed").build();

        // Host Template
        process("hosttemplate.create").resourceType("hostTemplate").start("requested").transitioning("activating").done("active").build();
        process("hosttemplate.remove").resourceType("hostTemplate").start("activating,active").transitioning("removing").done("removed").build();

        // Scheduled Update
        process("scheduledupgrade.create").resourceType("scheduledUpgrade").start("requested").transitioning("scheduling").done("scheduled").build();
        process("scheduledupgrade.start").resourceType("scheduledUpgrade").start("scheduled").transitioning("running").done("done").build();
        process("scheduledupgrade.remove").resourceType("scheduledUpgrade").start("scheduled,running,done").transitioning("removing").done("removed").build();

        // Deployment Unit
        process("deploymentunit.create").resourceType("deploymentUnit").start("requested").transitioning("registering").done("inactive").build();
        process("deploymentunit.activate").resourceType("deploymentUnit").start("inactive,error,erroring,pausing,paused").transitioning("activating").done("active").build();
        process("deploymentunit.update").resourceType("deploymentUnit").start("active,activating,pausing,paused").transitioning("activating").done("active").build();
        process("deploymentunit.deactivate").resourceType("deploymentUnit").start("active, activating,error,erroring,pausing,paused").transitioning("deactivating").done("inactive").build();
        process("deploymentunit.remove").resourceType("deploymentUnit").start("requested,registering,activating,active,deactivating,inactive,error,erroring,pausing,paused").transitioning("removing").done("removed").build();
        process("deploymentunit.error").resourceType("deploymentUnit").start("active,activating,pausing,paused").transitioning("erroring").done("error").build();
        process("deploymentunit.pause").resourceType("deploymentUnit").start("requested,registering,activating,active,deactivating,inactive,error,erroring").transitioning("pausing").done("paused").build();

        f.metaDataManager.getProcessDefinitions().addAll(f.processDefinitions.values());
    }

    private void setupTypes() {
        f.metaDataManager.setTypeSets(Arrays.asList(
                databaseObjects(),
                addons(),
                named()));;
    }

    private void defaultProcesses(String type) {
        defaultProcess(type, "create").resourceType(type).start("requested").transitioning("registering").done("inactive").build();
        defaultProcess(type, "activate").resourceType(type).start("inactive,registering").transitioning("activating").done("active").build();
        defaultProcess(type, "deactivate").resourceType(type).start("requested,registering,active,activating,updating-active,updating-inactive").transitioning("deactivating").done("inactive").build();
        defaultProcess(type, "remove").resourceType(type).start("requested,inactive,registering,updating-active,updating-inactive").transitioning("removing").done("removed").build();
        defaultProcess(type, "update").resourceType(type).start("inactive,active").transitioning("inactive=updating-inactive,active=updating-active").done("updating-inactive=inactive,updating-active=active").build();
    }

    private ResourceProcessBuilder defaultProcess(String type, String suffix) {
        return process((type + "." + suffix).toLowerCase());
    }

    private ResourceProcessBuilder process(String name) {
        ResourceProcessBuilder builder = new ResourceProcessBuilder(f.processDefinitions, f.objectManager,
                f.jsonMapper, f.processRecordDao, f.processRegistry);
        return builder.name(name);
    }

    private TypeSet databaseObjects() {
        SchemaRecordTypeListGenerator generator = new SchemaRecordTypeListGenerator();
        generator.setSchemaClass(CattleTable.class);

        return TypeSet.ofClasses(generator.getRecordTypes());
    }

    private TypeSet addons() {
        return TypeSet.ofClasses(
                ActiveSetting.class,
                ADConfig.class,
                AzureConfig.class,
                BaseMachineConfig.class,
                BlkioDeviceOption.class,
                CatalogTemplate.class,
                ComposeConfig.class,
                ContainerExec.class,
                ContainerLogs.class,
                ContainerProxy.class,
                ContainerUpgrade.class,
                DockerBuild.class,
                FieldDocumentation.class,
                HaproxyConfig.class,
                HostAccess.class,
                HostApiProxyTokenImpl.class,
                Identity.class,
                InServiceUpgradeStrategy.class,
                InstanceHealthCheck.class,
                LoadBalancerCookieStickinessPolicy.class,
                LocalAuthConfig.class,
                LogConfig.class,
                Member.class,
                MountEntry.class,
                NetworkPolicyRuleAction.class,
                NetworkPolicyRuleBetween.class,
                NetworkPolicyRule.class,
                NetworkPolicyRuleMember.class,
                NetworkPolicyRuleWithin.class,
                OpenLDAPConfig.class,
                PortRule.class,
                ProcessDefinitionApi.class,
                ProcessPool.class,
                ProcessSummary.class,
                PortBinding.class,
                Publish.class,
                ResourceDefinition.class,
                RestartPolicy.class,
                ScalePolicy.class,
                SecretReference.class,
                ServiceLink.class,
                ServiceProxy.class,
                ServiceRollback.class,
                ServicesPortRange.class,
                ServiceUpgrade.class,
                ServiceUpgradeStrategy.class,
                StateTransition.class,
                StatsAccess.class,
                Subscribe.class,
                TargetPortRule.class,
                Token.class,
                TypeDocumentation.class,
                Ulimit.class,
                VirtualMachineDisk.class,
                VolumeActivateInput.class);
    }

    private TypeSet named() {
        return TypeSet.ofNames(
                "addOutputsInput",
                "addRemoveServiceLinkInput",
                "changeSecretInput",
                "apiKey,parent=credential",
                "composeConfigInput",
                "container,parent=instance",
                "instanceConsole",
                "instanceConsoleInput",
                "instanceStop",
                "instanceRemove",
                "project,parent=account",
                "password,parent=credential",
                "registry,parent=storagePool",
                "registryCredential,parent=credential",
                "setProjectMembersInput",
                "setServiceLinksInput",
                "virtualMachine,parent=container",
                "storageDriverService,parent=service",
                "networkDriverService,parent=service",
                "loadBalancerService,parent=service",
                "externalService,parent=service",
                "dnsService,parent=service",
                "kubernetesService,parent=service",
                "containerConfig,parent=container",
                "launchConfig,parent=container",
                "secondaryLaunchConfig,parent=launchConfig",
                "pullTask,parent=genericObject",
                "externalVolumeEvent,parent=externalEvent",
                "externalStoragePoolEvent,parent=externalEvent",
                "externalServiceEvent,parent=externalEvent",
                "stackUpgrade",
                "kubernetesStackUpgrade",
                "externalDnsEvent,parent=externalEvent",
                "externalHostEvent,parent=externalEvent",
                "loadBalancerConfig",
                "kubernetesStack,parent=stack",
                "machine,parent=physicalHost",
                "nfsConfig",
                "binding",
                "serviceBinding",
                "lbConfig",
                "lbTargetConfig",
                "balancerServiceConfig",
                "balancerTargetConfig",
                "defaultNetwork,parent=network",
                "register,parent=genericObject",
                "registrationToken,parent=credential",
                "hostOnlyNetwork,parent=network",
                "selectorService,parent=service",
                "scalingGroup,parent=service");
    }

}