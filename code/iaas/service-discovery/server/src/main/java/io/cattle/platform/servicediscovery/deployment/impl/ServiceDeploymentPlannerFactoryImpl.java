package io.cattle.platform.servicediscovery.deployment.impl;

import io.cattle.platform.core.model.Service;
import io.cattle.platform.servicediscovery.api.constants.ServiceDiscoveryConstants;
import io.cattle.platform.servicediscovery.deployment.ServiceDeploymentPlanner;
import io.cattle.platform.servicediscovery.deployment.ServiceDeploymentPlannerFactory;
import io.cattle.platform.servicediscovery.deployment.impl.DeploymentManagerImpl.DeploymentServiceContext;

import java.util.List;
import java.util.Map;

public class ServiceDeploymentPlannerFactoryImpl implements ServiceDeploymentPlannerFactory {

    @Override
    public ServiceDeploymentPlanner createServiceDeploymentPlanner(Service service, List<DeploymentUnit> units,
            DeploymentServiceContext context) {

        Map<String, String> serviceLabels = context.sdService.getServiceLabels(service);
        String globalService = serviceLabels.get(ServiceDiscoveryConstants.LABEL_SERVICE_GLOBAL);

        if (service.getKind().equalsIgnoreCase(ServiceDiscoveryConstants.KIND.EXTERNALSERVICE.name())
                || service.getKind().equalsIgnoreCase(ServiceDiscoveryConstants.KIND.DNSSERVICE.name())) {
            return new ExternalServiceDeploymentPlanner(service, units, context);
        } else if (globalService != null) {
            return new GlobalServiceDeploymentPlanner(service, units, context);
        } else {
            return new DefaultServiceDeploymentPlanner(service, units, context);
        }
    }

}
