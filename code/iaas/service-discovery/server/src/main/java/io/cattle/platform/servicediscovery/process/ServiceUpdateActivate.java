package io.cattle.platform.servicediscovery.process;

import io.cattle.platform.activity.ActivityService;
import io.cattle.platform.core.constants.CommonStatesConstants;
import io.cattle.platform.core.constants.ServiceConstants;
import io.cattle.platform.core.dao.ServiceExposeMapDao;
import io.cattle.platform.core.model.Service;
import io.cattle.platform.engine.handler.HandlerResult;
import io.cattle.platform.engine.process.ProcessInstance;
import io.cattle.platform.engine.process.ProcessState;
import io.cattle.platform.iaas.api.auditing.AuditService;
import io.cattle.platform.inator.Deployinator;
import io.cattle.platform.object.resource.ResourceMonitor;
import io.cattle.platform.object.util.DataAccessor;
import io.cattle.platform.process.common.handler.AbstractObjectProcessHandler;
import io.cattle.platform.servicediscovery.api.service.ServiceDataManager;
import io.cattle.platform.servicediscovery.service.DeploymentManager;
import io.cattle.platform.servicediscovery.service.ServiceDiscoveryService;
import io.cattle.platform.servicediscovery.upgrade.UpgradeManager;
import io.github.ibuildthecloud.gdapi.id.IdFormatter;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * This handler is responsible for activating the service as well as restoring the active service to its scale
 * The handler can be invoked as a part of service.activate, service.update for both scaleUp and ScaleDown
 *
 */
@Named
public class ServiceUpdateActivate extends AbstractObjectProcessHandler {

    @Inject
    ActivityService activity;
    @Inject
    DeploymentManager deploymentMgr;
    @Inject
    ServiceDiscoveryService serviceDiscoveryService;
    @Inject
    ResourceMonitor resourceMonitor;
    @Inject
    IdFormatter idFormatter;
    @Inject
    AuditService auditSvc;
    @Inject
    ServiceExposeMapDao exposeDao;
    @Inject
    UpgradeManager upgradeMgr;
    @Inject
    ServiceDataManager serviceDataMgr;
    @Inject
    ServiceDiscoveryService sdSvc;
    @Inject
    Deployinator deployinator;

    @Override
    public String[] getProcessNames() {
        return new String[] { ServiceConstants.PROCESS_SERVICE_ACTIVATE,
                ServiceConstants.PROCESS_SERVICE_UPDATE };
    }

    @Override
    public HandlerResult handle(ProcessState state, final ProcessInstance process) {
        final Service service = (Service) state.getResource();
        deployinator.reconcile(Service.class, service.getId());
//        // on inactive service update, do nothing
//        if (process.getName().equalsIgnoreCase(ServiceConstants.PROCESS_SERVICE_UPDATE)
//                && service.getState().equalsIgnoreCase(CommonStatesConstants.UPDATING_INACTIVE)) {
//            return null;
//        }
//        activity.run(service, process.getName(), getMessage(process.getName()), new Runnable() {
//            @Override
//            public void run() {
//                waitForConsumedServicesActivate(state);
//                if (ServiceConstants.SERVICE_LIKE.contains(service.getKind())) {
//                    boolean sleep = service.getIsUpgrade();
//                    if (service.getState().equalsIgnoreCase(CommonStatesConstants.UPDATING_ACTIVE)) {
//                        upgradeMgr.upgrade(service, service.getState(), sleep,
//                                ServiceUtil.isImagePrePull(service));
//                    } else {
//                        upgradeMgr.upgrade(service, service.getState(), sleep, false);
//                    }
//                }
//                deploymentMgr.activate(service);
//            }
//        });
//
//        objectManager.reload(state.getResource());
        return new HandlerResult(ServiceConstants.FIELD_CURRENT_SCALE, exposeDao.getCurrentScale(service.getId()));
    }


    protected String getMessage(String name) {
        if (name == null) {
            return null;
        }
        switch (name) {
        case "service.activate":
            return "Activating service";
        default:
            return "Updating service";
        }
    }

    @SuppressWarnings("unchecked")
    protected void waitForConsumedServicesActivate(ProcessState state) {
        List<Integer> consumedServicesIds = DataAccessor.fromMap(state.getData())
                .withKey(ServiceConstants.FIELD_WAIT_FOR_CONSUMED_SERVICES_IDS)
                .withDefault(Collections.EMPTY_LIST).as(List.class);

        for (Integer consumedServiceId : consumedServicesIds) {
            Service consumedService = objectManager.loadResource(Service.class, consumedServiceId.longValue());
            resourceMonitor.waitForState(consumedService, CommonStatesConstants.ACTIVE);
        }
    }
}
