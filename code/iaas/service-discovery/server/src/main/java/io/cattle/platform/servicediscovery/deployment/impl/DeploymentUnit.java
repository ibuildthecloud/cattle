package io.cattle.platform.servicediscovery.deployment.impl;

import io.cattle.platform.allocator.constraint.AffinityConstraintDefinition.AffinityOps;
import io.cattle.platform.allocator.constraint.ContainerLabelAffinityConstraint;
import io.cattle.platform.core.constants.InstanceConstants;
import io.cattle.platform.core.model.Environment;
import io.cattle.platform.core.model.Service;
import io.cattle.platform.docker.constants.DockerInstanceConstants;
import io.cattle.platform.servicediscovery.api.constants.ServiceDiscoveryConstants;
import io.cattle.platform.servicediscovery.deployment.DeploymentUnitInstance;
import io.cattle.platform.servicediscovery.deployment.DeploymentUnitInstanceIdGenerator;
import io.cattle.platform.servicediscovery.deployment.InstanceUnit;
import io.cattle.platform.servicediscovery.deployment.impl.DeploymentManagerImpl.DeploymentServiceContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class DeploymentUnit {

    String uuid;
    Map<String, DeploymentUnitInstance> launchConfigToInstance = new HashMap<>();
    List<String> launchConfigNames = new ArrayList<>();
    DeploymentServiceContext context;
    Map<String, String> unitLabels = new HashMap<>();
    Service service;

    private static List<String> supportedUnitLabels = Arrays
            .asList(ServiceDiscoveryConstants.LABEL_SERVICE_REQUESTED_HOST_ID);

    public DeploymentUnit() {
    }

    /*
     * This constructor is called to add existing unit
     */
    public DeploymentUnit(DeploymentServiceContext context, String uuid,
            Service service, List<DeploymentUnitInstance> deploymentUnitInstances, Map<String, String> labels) {
        this(context, uuid, service);
        for (DeploymentUnitInstance instance : deploymentUnitInstances) {
            launchConfigToInstance.put(instance.getLaunchConfigName(), instance);
        }
        setLabels(labels);
    }

    protected DeploymentUnit(DeploymentServiceContext context, String uuid, Service service) {
        this.context = context;
        this.uuid = uuid;
        this.service = service;
        this.launchConfigNames.addAll(this.context.sdService.getServiceLaunchConfigNames(service));
    }
    
    /*
     * this constructor is called to create a new unit
     */
    public DeploymentUnit(DeploymentServiceContext context, Service service, Map<String, String> labels) {
        this(context, UUID.randomUUID().toString(), service);
        setLabels(labels);
    }

    protected void setLabels(Map<String, String> labels) {
        if (labels != null) {
            for (String label : labels.keySet()) {
                if (supportedUnitLabels.contains(label)) {
                    this.unitLabels.put(label, labels.get(label));
                }
            }
        }
    }

    private void createMissingUnitInstances(Map<String, DeploymentUnitInstanceIdGenerator> svcInstanceIdGenerator) {
        Integer order = null;
        for (String launchConfigName : launchConfigNames) {
            if (!launchConfigToInstance.containsKey(launchConfigName)) {
                if (order == null) {
                    order = svcInstanceIdGenerator.get(launchConfigName).getNextAvailableId();
                }
                String instanceName = context.sdService.generateServiceInstanceName(service,
                        launchConfigName, order);
                DeploymentUnitInstance deploymentUnitInstance = context.deploymentUnitInstanceFactory
                        .createDeploymentUnitInstance(context, uuid, service, instanceName, null, null, launchConfigName);
                launchConfigToInstance.put(launchConfigName, deploymentUnitInstance);
            }
        }
    }

    public boolean isError() {
        /*
         * This should check for instances with an error transitioning state
         */
        for (DeploymentUnitInstance instance : launchConfigToInstance.values()) {
            if (instance.isError()) {
                return true;
            }
        }
        return false;
    }

    public void remove() {
        /*
         * Delete all instances. This should be non-blocking (don't wait)
         */
        for (DeploymentUnitInstance instance : launchConfigToInstance.values()) {
            instance.remove();
        }
    }

    public void stop() {
        /*
         * stops all instances. This should be non-blocking (don't wait)
         */
        for (DeploymentUnitInstance instance : launchConfigToInstance.values()) {
            instance.stop();
        }
    }

    public void start(Map<String, DeploymentUnitInstanceIdGenerator> svcInstanceIdGenerator) {
        /*
         * Start the instances in the correct order depending on the volumes from.
         * Attempt to start things in parallel, but if not possible (like volumes-from) then start each service
         * sequentially.
         * 
         * If there are three services but only two containers, create the third
         * 
         * If one of the containers service health is bad, then create another one (but don't delete the existing).
         * 
         */
        createMissingUnitInstances(svcInstanceIdGenerator);

        for (String launchConfigName : launchConfigToInstance.keySet()) {
            createInstance(launchConfigName);
        }
    }
    
    public void waitForStart(){
        for (DeploymentUnitInstance instance : launchConfigToInstance.values()) {
            instance.waitForStart();
        }
    }

    protected DeploymentUnitInstance createInstance(String launchConfigName) {
        List<Integer> volumesFromInstanceIds = getVolumesFromInstancesIds(launchConfigName);
        Integer networkContainerId = getNetworkContainerId(launchConfigName);
        
        this.launchConfigToInstance.get(launchConfigName)
                .start(
                        populateDeployParams(this.launchConfigToInstance.get(launchConfigName), volumesFromInstanceIds,
                                networkContainerId));

        return this.launchConfigToInstance.get(launchConfigName);
    }

    @SuppressWarnings("unchecked")
    protected List<Integer> getVolumesFromInstancesIds(String launchConfigName) {
        List<Integer> volumesFromInstanceIds = new ArrayList<>();
        Object volumesFromLaunchConfigs = context.sdService.getLaunchConfigObject(this.service, launchConfigName,
                ServiceDiscoveryConstants.FIELD_DATA_VOLUMES_LAUNCH_CONFIG);
        Object volumesFromInstance = context.sdService.getLaunchConfigObject(this.service, launchConfigName,
                DockerInstanceConstants.FIELD_VOLUMES_FROM);
        if (volumesFromInstance != null) {
            volumesFromInstanceIds.addAll((List<Integer>) volumesFromInstance);
        }
        
        if (volumesFromLaunchConfigs != null) {
            for (String volumesFromLaunchConfig : (List<String>) volumesFromLaunchConfigs) {
                // check if the service is present in the service map (it can be referenced, but removed already)
                if (volumesFromLaunchConfig.toString().equalsIgnoreCase(service.getName())) {
                    volumesFromLaunchConfig = ServiceDiscoveryConstants.PRIMARY_LAUNCH_CONFIG_NAME;
                }
                DeploymentUnitInstance volumesFromUnitInstance = launchConfigToInstance.get(volumesFromLaunchConfig);
                if (volumesFromUnitInstance != null && volumesFromUnitInstance instanceof InstanceUnit) {
                    if (((InstanceUnit) volumesFromUnitInstance).getInstance() == null) {
                        // request new instance creation
                        volumesFromUnitInstance = createInstance(volumesFromUnitInstance.getLaunchConfigName());
                    }
                    // wait for start
                    volumesFromUnitInstance.start(new HashMap<String, Object>());
                    volumesFromUnitInstance.waitForStart();
                    volumesFromInstanceIds.add(((InstanceUnit) volumesFromUnitInstance).getInstance().getId()
                            .intValue());
                }
            }
        }

        return volumesFromInstanceIds;
    }

    protected Integer getNetworkContainerId(String launchConfigName) {
        Integer networkContainerId = null;

        Object networkFromInstance = context.sdService.getLaunchConfigObject(this.service, launchConfigName,
                DockerInstanceConstants.FIELD_NETWORK_CONTAINER_ID);
        if (networkFromInstance != null) {
            return (Integer) networkFromInstance;
        }

        Object networkFromLaunchConfig = context.sdService.getLaunchConfigObject(this.service, launchConfigName,
                ServiceDiscoveryConstants.FIELD_NETWORK_LAUNCH_CONFIG);

        if (networkFromLaunchConfig != null) {
            // check if the service is present in the service map (it can be referenced, but removed already)
            if (networkFromLaunchConfig.toString().equalsIgnoreCase(service.getName())) {
                networkFromLaunchConfig = ServiceDiscoveryConstants.PRIMARY_LAUNCH_CONFIG_NAME;
            }
            DeploymentUnitInstance networkFromUnitInstance = launchConfigToInstance.get(networkFromLaunchConfig);
            if (networkFromUnitInstance != null && networkFromUnitInstance instanceof InstanceUnit) {
                if (((InstanceUnit) networkFromUnitInstance).getInstance() == null) {
                    // request new instance creation
                    networkFromUnitInstance = createInstance(networkFromUnitInstance.getLaunchConfigName());
                }
                // wait for start
                networkFromUnitInstance.start(new HashMap<String, Object>());
                networkFromUnitInstance.waitForStart();
                networkContainerId = ((InstanceUnit) networkFromUnitInstance).getInstance().getId().intValue();
            }
        }

        return networkContainerId;
    }

    public boolean isStarted() {
        for (DeploymentUnitInstance instance : launchConfigToInstance.values()) {
            if (!instance.isStarted()) {
                return false;
            }
        }
        return true;
    }

    public boolean isUnhealthy() {
        // returns list of instances that need cleanup (having bad health)
        for (DeploymentUnitInstance instance : launchConfigToInstance.values()) {
            if (instance.isUnhealthy()) {
                return true;
            }
        }
        return false;
    }

    public boolean isComplete() {
        return launchConfigToInstance.size() == launchConfigNames.size();
    }

    protected Map<String, Object> populateDeployParams(DeploymentUnitInstance instance,
            List<Integer> volumesFromInstanceIds, Integer networkContainerId) {
        Map<String, Object> deployParams = new HashMap<>();
        Map<String, String> instanceLabels = getLabels(instance);
        deployParams.put(InstanceConstants.FIELD_LABELS, instanceLabels);
        if (volumesFromInstanceIds != null && !volumesFromInstanceIds.isEmpty()) {
            deployParams.put(DockerInstanceConstants.FIELD_VOLUMES_FROM, volumesFromInstanceIds);
        }
        Object hostId = instanceLabels.get(ServiceDiscoveryConstants.LABEL_SERVICE_REQUESTED_HOST_ID);
        if (hostId != null) {
            deployParams.put(InstanceConstants.FIELD_REQUESTED_HOST_ID, hostId);
        }

        if (networkContainerId != null) {
            deployParams.put(DockerInstanceConstants.FIELD_NETWORK_CONTAINER_ID, networkContainerId);
        }
        return deployParams;
    }

    protected Map<String, String> getLabels(DeploymentUnitInstance instance) {
        Map<String, String> labels = new HashMap<>();
        labels.put(ServiceDiscoveryConstants.LABEL_SERVICE_NAME, service.getName());
        labels.put(ServiceDiscoveryConstants.LABEL_ENVIRONMENT_NAME,
                context.objectManager.loadResource(Environment.class, service.getEnvironmentId()).getName());
        /*
         * Put label 'io.rancher.deployment.unit=this.uuid' on each one. This way
         * we can reference a set of containers later.
         */
        labels.put(ServiceDiscoveryConstants.LABEL_SERVICE_DEPLOYMENT_UNIT, uuid);

        /*
         * Put label with launch config name
         */
        labels.put(ServiceDiscoveryConstants.LABEL_SERVICE_LAUNCH_CONFIG, instance.getLaunchConfigName());

        /*
         * Put affinity constraint on every instance to let allocator know that they should go to the same host
         */
        // TODO: Might change labels into a Multimap or add a service function to handle merging
        String containerLabelSoftAffinityKey = ContainerLabelAffinityConstraint.LABEL_HEADER_AFFINITY_CONTAINER_LABEL + AffinityOps.SOFT_EQ.getLabelSymbol();
        labels.put(containerLabelSoftAffinityKey, ServiceDiscoveryConstants.LABEL_SERVICE_DEPLOYMENT_UNIT + "=" + this.uuid);
        labels.putAll(this.unitLabels);

        return labels;
    }

    public Map<String, String> getLabels() {
        return unitLabels;
    }

    public String getUuid() {
        return uuid;
    }

}
