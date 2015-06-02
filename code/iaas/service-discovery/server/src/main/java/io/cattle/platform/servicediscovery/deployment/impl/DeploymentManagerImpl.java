package io.cattle.platform.servicediscovery.deployment.impl;

import io.cattle.iaas.lb.service.LoadBalancerService;
import io.cattle.platform.allocator.service.AllocatorService;
import io.cattle.platform.configitem.events.ConfigUpdate;
import io.cattle.platform.configitem.model.Client;
import io.cattle.platform.configitem.model.ItemVersion;
import io.cattle.platform.configitem.request.ConfigUpdateRequest;
import io.cattle.platform.configitem.version.ConfigItemStatusManager;
import io.cattle.platform.core.constants.CommonStatesConstants;
import io.cattle.platform.core.model.Environment;
import io.cattle.platform.core.model.Service;
import io.cattle.platform.eventing.EventService;
import io.cattle.platform.eventing.model.EventVO;
import io.cattle.platform.lb.instance.service.LoadBalancerInstanceManager;
import io.cattle.platform.lock.LockCallbackNoReturn;
import io.cattle.platform.lock.LockManager;
import io.cattle.platform.lock.definition.LockDefinition;
import io.cattle.platform.object.ObjectManager;
import io.cattle.platform.object.process.ObjectProcessManager;
import io.cattle.platform.object.resource.ResourceMonitor;
import io.cattle.platform.servicediscovery.api.constants.ServiceDiscoveryConstants;
import io.cattle.platform.servicediscovery.api.dao.ServiceExposeMapDao;
import io.cattle.platform.servicediscovery.deployment.DeploymentManager;
import io.cattle.platform.servicediscovery.deployment.DeploymentUnitInstanceFactory;
import io.cattle.platform.servicediscovery.deployment.DeploymentUnitInstanceIdGenerator;
import io.cattle.platform.servicediscovery.deployment.ServiceDeploymentPlanner;
import io.cattle.platform.servicediscovery.deployment.ServiceDeploymentPlannerFactory;
import io.cattle.platform.servicediscovery.service.ServiceDiscoveryService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

public class DeploymentManagerImpl implements DeploymentManager {

    private static final String RECONCILE = "reconcile";

    @Inject
    LockManager lockManager;
    @Inject
    DeploymentUnitInstanceFactory unitInstanceFactory;
    @Inject
    ObjectProcessManager objectProcessMgr;
    @Inject
    ServiceDiscoveryService sdSvc;
    @Inject
    LoadBalancerService lbSvc;
    @Inject
    LoadBalancerInstanceManager lbMgr;
    @Inject
    ObjectManager objectMgr;
    @Inject
    ResourceMonitor resourceMntr;
    @Inject
    ServiceExposeMapDao expMapDao;
    @Inject
    ServiceDeploymentPlannerFactory deploymentPlannerFactory;
    @Inject
    AllocatorService allocatorSvc;
    @Inject
    ConfigItemStatusManager itemManager;
    @Inject
    EventService eventService;

    @Override
    public void activate(final Service service) {
        if (service == null) {
            return;
        }

        lockManager.lock(createLock(service), new LockCallbackNoReturn() {
            @Override
            public void doWithLockNoResult() {
                if (service.getState().equals(CommonStatesConstants.INACTIVE)) {
                    return;
                }
                
                // get existing deployment units
                List<DeploymentUnit> units = unitInstanceFactory.collectDeploymentUnits(service,
                        new DeploymentServiceContext());
                ServiceDeploymentPlanner planner = deploymentPlannerFactory.createServiceDeploymentPlanner(service,
                        units, new DeploymentServiceContext());

                // don't process if there is no need to reconcile
                boolean needToReconcile = needToReconcile(units, planner, service);

                if (!needToReconcile) {
                    return;
                }

                activateDeploymentUnits(service, units, planner);
            }
        });
    }

    private boolean needToReconcile(final List<DeploymentUnit> units, final ServiceDeploymentPlanner planner,
            Service service) {
        if (!(service.getState().equals(CommonStatesConstants.ACTIVE) || service.getState().equals(
                CommonStatesConstants.UPDATING_ACTIVE) || service.getState().equals(CommonStatesConstants.ACTIVATING))) {
            return false;
        }

        boolean needToReconcile = false;
        if (!planner.needToReconcileDeployment()) {
            for (DeploymentUnit unit : units) {
                if (unit.isError()) {
                    needToReconcile = true;
                    break;
                }
                if (!unit.isComplete()) {
                    needToReconcile = true;
                    break;
                }
                if (!unit.isStarted()) {
                    needToReconcile = true;
                    break;
                }
                if (unit.isUnhealthy()) {
                    needToReconcile = true;
                    break;
                }
            }
        } else {
            needToReconcile = true;
        }
        return needToReconcile;
    }

    protected LockDefinition createLock(Service service) {
        return new ServiceReconcileLock(service);
    }

    protected void activateDeploymentUnits(Service service, List<DeploymentUnit> units,
            ServiceDeploymentPlanner planner) {
        /*
         * Delete invalid units
         */
        units = deleteBadUnits(units);

        /*
         * Ask the planner to deploy more units/ remove extra units
         */
        units = planner.deploy();

        /*
         * Activate all the units
         */
        startUnits(service, units);

        /*
         * Delete the units that have a bad health
         */

        cleanupUnhealthyUnits(units);
    }

    private Map<String, DeploymentUnitInstanceIdGenerator> populateUsedNames(
            Service service) {
        Map<String, DeploymentUnitInstanceIdGenerator> generator = new HashMap<>();
        for (String launchConfigName : sdSvc.getServiceLaunchConfigNames(service)) {
            List<Integer> usedNames = sdSvc.getServiceInstanceUsedOrderIds(service, launchConfigName);
            generator.put(launchConfigName,
                    new DeploymentUnitInstanceIdGeneratorImpl(objectMgr.loadResource(
                            Environment.class, service.getEnvironmentId()), usedNames, launchConfigName));
        }

        return generator;
    }

    protected void cleanupUnhealthyUnits(List<DeploymentUnit> units) {
        for (DeploymentUnit unit : units) {
            if (unit.isUnhealthy()) {
                unit.remove();
            }
        }
    }

    protected void startUnits(Service service, List<DeploymentUnit> units) {
        Map<String, DeploymentUnitInstanceIdGenerator> svcInstanceIdGenerator = populateUsedNames(service);
        for (DeploymentUnit unit : units) {
            unit.start(svcInstanceIdGenerator);
        }

        for (DeploymentUnit unit : units) {
            unit.waitForStart();
        }
    }

    protected List<DeploymentUnit> deleteBadUnits(List<DeploymentUnit> units) {
        List<DeploymentUnit> result = new ArrayList<>(units.size());

        for (DeploymentUnit unit : units) {
            if (unit.isError()) {
                unit.remove();
            } else {
                result.add(unit);
            }
        }

        return result;
    }


    @Override
    public void deactivate(final Service service) {
        // do with lock to prevent intervention to sidekick service activate
        lockManager.lock(createLock(service), new LockCallbackNoReturn() {
            @Override
            public void doWithLockNoResult() {
                // in deactivate, we don't care about the sidekicks, and deactivate only requested service
                List<DeploymentUnit> units = unitInstanceFactory.collectDeploymentUnits(
                        service, new DeploymentServiceContext());
                for (DeploymentUnit unit : units) {
                    unit.stop();
                }
            }
        });
    }

    @Override
    public void remove(final Service service) {
        // do with lock to prevent intervention to sidekick service activate
        lockManager.lock(createLock(service), new LockCallbackNoReturn() {
            @Override
            public void doWithLockNoResult() {
                // in remove, we don't care about the sidekicks, and remove only requested service
                List<DeploymentUnit> units = unitInstanceFactory.collectDeploymentUnits(
                        service, new DeploymentServiceContext());
                for (DeploymentUnit unit : units) {
                    unit.remove();
                }
                sdSvc.removeServiceMaps(service);
            }
        });
    }

    @Override
    public void activateGlobalServicesForHost(long accountId, long hostId) {
        List<? extends Service> services = expMapDao.getActiveServices(accountId);
        List<Service> activeGlobalServices = new ArrayList<Service>();
        for (Service service: services) {
            Map<String, String> serviceLabels = sdSvc.getServiceLabels(service);
            if (serviceLabels.containsKey(ServiceDiscoveryConstants.LABEL_SERVICE_GLOBAL) &&
                    allocatorSvc.hostSatisfiesHostAffinity(hostId, serviceLabels)) {
                activeGlobalServices.add(service);
            }
        }
        reconcileServices(activeGlobalServices);
    }

    public void reconcileServicesFor(Object obj) {
        reconcileServices(sdSvc.getServicesFor(obj));
    }

    private void reconcileServices(List<Service> services) {
        for (Service service : services) {
            ConfigUpdateRequest request = ConfigUpdateRequest.forResource(Service.class, service.getId());
            request.addItem("reconcile");

            itemManager.updateConfig(request);
        }
    }

    @Override
    public void serviceUpdate(ConfigUpdate update) {
        final Client client = new Client(Service.class, new Long(update.getResourceId()));
        reconcileForClient(update, client, new Runnable() {
            @Override
            public void run() {
                Service service = objectMgr.loadResource(Service.class, client.getResourceId());
                if (service != null) {
                    activate(service);
                }
            }
        });
    }

    protected void reconcileForClient(ConfigUpdate update, Client client, Runnable run) {
        ItemVersion itemVersion = itemManager.getRequestedVersion(client, RECONCILE);
        run.run();
        itemManager.setApplied(client, RECONCILE, itemVersion);
        eventService.publish(EventVO.reply(update));
    }

    public final class DeploymentServiceContext {
        final public ObjectManager objectManager = objectMgr;
        final public ResourceMonitor resourceMonitor = resourceMntr;
        final public ObjectProcessManager objectProcessManager = objectProcessMgr;
        final public ServiceDiscoveryService sdService = sdSvc;
        final public ServiceExposeMapDao exposeMapDao = expMapDao;
        final public LoadBalancerInstanceManager lbInstanceMgr = lbMgr;
        final public LoadBalancerService lbService = lbSvc;
        final public DeploymentUnitInstanceFactory deploymentUnitInstanceFactory = unitInstanceFactory;
        final public AllocatorService allocatorService = allocatorSvc;
    }
}
