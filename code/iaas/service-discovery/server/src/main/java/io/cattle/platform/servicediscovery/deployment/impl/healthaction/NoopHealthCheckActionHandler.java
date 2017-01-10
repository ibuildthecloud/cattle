package io.cattle.platform.servicediscovery.deployment.impl.healthaction;

import io.cattle.platform.core.model.DeploymentUnit;
import io.cattle.platform.servicediscovery.deployment.impl.DeploymentManagerImpl.DeploymentManagerContext;

import java.util.List;

public class NoopHealthCheckActionHandler implements HealthCheckActionHandler {

    @Override
    public void populateHealthyUnhealthyUnits(List<DeploymentUnit> healthyUnits,
            List<DeploymentUnit> unhealthyUnits, List<DeploymentUnit> units, DeploymentManagerContext context) {
        healthyUnits.addAll(units);
    }
}
