package io.cattle.platform.servicediscovery.deployment.impl;

import io.cattle.platform.core.model.Service;
import io.cattle.platform.object.util.DataAccessor;
import io.cattle.platform.servicediscovery.api.constants.ServiceDiscoveryConstants;
import io.cattle.platform.servicediscovery.deployment.ServiceDeploymentPlanner;
import io.cattle.platform.servicediscovery.deployment.impl.DeploymentManagerImpl.DeploymentServiceContext;

import java.util.List;

public class DefaultServiceDeploymentPlanner extends ServiceDeploymentPlanner {

    protected Integer requestedScale = 0;

    public DefaultServiceDeploymentPlanner(Service service, List<DeploymentUnit> units,
            DeploymentServiceContext context) {
        super(service, units, context);
        this.requestedScale = DataAccessor.fieldInteger(service,
                ServiceDiscoveryConstants.FIELD_SCALE);
    }

    @Override
    public List<DeploymentUnit> deployHealthyUnits() {
        if (this.healthyUnits.size() < requestedScale) {
            addMissingUnits();
        } else if (healthyUnits.size() > requestedScale) {
            removeExtraUnits();
        }

        return healthyUnits;
    }

    private void addMissingUnits() {
        while (this.healthyUnits.size() < this.requestedScale) {
            DeploymentUnit unit = new DeploymentUnit(context, service, null);
            this.healthyUnits.add(unit);
        }
    }

    private void removeExtraUnits() {
        // delete units
        int i = this.healthyUnits.size() - 1;
        while (this.healthyUnits.size() > this.requestedScale) {
            DeploymentUnit toRemove = this.healthyUnits.get(i);
            toRemove.remove();
            this.healthyUnits.remove(i);
            i--;
        }
    }

    @Override
    public boolean needToReconcileDeployment() {
        return (healthyUnits.size() != requestedScale);
    }
}
