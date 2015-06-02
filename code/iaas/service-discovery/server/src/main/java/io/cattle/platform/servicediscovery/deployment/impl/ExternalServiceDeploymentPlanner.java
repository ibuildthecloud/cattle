package io.cattle.platform.servicediscovery.deployment.impl;

import io.cattle.platform.core.model.Service;
import io.cattle.platform.servicediscovery.deployment.ServiceDeploymentPlanner;
import io.cattle.platform.servicediscovery.deployment.impl.DeploymentManagerImpl.DeploymentServiceContext;

import java.util.List;

public class ExternalServiceDeploymentPlanner extends ServiceDeploymentPlanner {

    public ExternalServiceDeploymentPlanner(Service service, List<DeploymentUnit> units,
            DeploymentServiceContext context) {
        super(service, units, context);
    }

    @Override
    public List<DeploymentUnit> deployHealthyUnits() {
        return this.healthyUnits;
    }

    @Override
    public boolean needToReconcileDeployment() {
        return false;
    }
}
