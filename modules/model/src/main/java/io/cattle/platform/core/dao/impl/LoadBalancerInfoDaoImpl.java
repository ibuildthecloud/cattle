package io.cattle.platform.core.dao.impl;

import static io.cattle.platform.core.model.tables.CertificateTable.*;
import static io.cattle.platform.core.model.tables.InstanceTable.*;
import static io.cattle.platform.core.model.tables.ServiceConsumeMapTable.*;
import static io.cattle.platform.core.model.tables.ServiceTable.*;
import static io.cattle.platform.core.model.tables.StackTable.*;

import io.cattle.platform.core.addon.LbConfig;
import io.cattle.platform.core.addon.LoadBalancerTargetInput;
import io.cattle.platform.core.constants.CommonStatesConstants;
import io.cattle.platform.core.constants.InstanceConstants;
import io.cattle.platform.core.constants.ServiceConstants;
import io.cattle.platform.core.dao.LoadBalancerInfoDao;
import io.cattle.platform.core.dao.ServiceDao;
import io.cattle.platform.core.model.Certificate;
import io.cattle.platform.core.model.Service;
import io.cattle.platform.core.model.ServiceConsumeMap;
import io.cattle.platform.core.model.Stack;
import io.cattle.platform.core.util.LBMetadataUtil.LBConfigMetadataStyle;
import io.cattle.platform.core.util.PortSpec;
import io.cattle.platform.db.jooq.dao.impl.AbstractJooqDao;
import io.cattle.platform.json.JsonMapper;
import io.cattle.platform.object.ObjectManager;
import io.cattle.platform.object.util.DataAccessor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.tuple.Pair;
import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.Record3;
import org.jooq.RecordHandler;

public class LoadBalancerInfoDaoImpl extends AbstractJooqDao implements LoadBalancerInfoDao {

    ObjectManager objectManager;
    JsonMapper jsonMapper;
    ServiceDao svcDao;

    public LoadBalancerInfoDaoImpl(Configuration configuration, ObjectManager objectManager, JsonMapper jsonMapper, ServiceDao svcDao) {
        super(configuration);
        this.objectManager = objectManager;
        this.jsonMapper = jsonMapper;
        this.svcDao = svcDao;
    }

    @SuppressWarnings("unchecked")
    protected List<LoadBalancerListenerInfo> getListeners(Service lbService) {
        Map<Integer, LoadBalancerListenerInfo> listeners = new HashMap<>();
        Map<String, Object> launchConfig = DataAccessor.fields(lbService)
                .withKey(ServiceConstants.FIELD_LAUNCH_CONFIG).withDefault(Collections.EMPTY_MAP)
                .as(Map.class);
        // 1. create listeners
        Map<String, Boolean> portDefs = new HashMap<>();

        if (launchConfig.get(InstanceConstants.FIELD_PORTS) != null) {
            for (String port : (List<String>) launchConfig.get(InstanceConstants.FIELD_PORTS)) {
                portDefs.put(port, true);
            }
        }

        if (launchConfig.get(InstanceConstants.FIELD_EXPOSE) != null) {
            for (String port : (List<String>) launchConfig.get(InstanceConstants.FIELD_EXPOSE)) {
                portDefs.put(port, false);
            }
        }

        List<String> sslPorts = getLabeledPorts(launchConfig, ServiceConstants.LABEL_LB_SSL_PORTS);
        List<String> proxyProtocolPorts = getLabeledPorts(launchConfig,
                ServiceConstants.LABEL_LB_PROXY_PORTS);
        List<LoadBalancerListenerInfo> listenersToReturn = new ArrayList<>();
        for (String port : portDefs.keySet()) {
            PortSpec spec = new PortSpec(port);
            String protocol;
            if (!port.contains("tcp")) {
                // default to http unless defined otherwise in the compose file
                protocol = "http";
            } else {
                protocol = "tcp";
            }

            if (listeners.containsKey(spec.getPrivatePort())) {
                continue;
            }

            int targetPort = spec.getPrivatePort();
            Integer sourcePort = null;
            Integer privatePort = null;
            // set sourcePort only for ports defined in "ports" param
            // the ones defined in expose, will get translated to private listeners
            if (portDefs.get(port)) {
                if (spec.getPublicPort() == null) {
                    sourcePort = targetPort;
                } else {
                    sourcePort = spec.getPublicPort();
                }
                privatePort = sourcePort;
            } else {
                if (spec.getPublicPort() == null) {
                    privatePort = targetPort;
                } else {
                    privatePort = spec.getPublicPort();
                }
            }

            String sourceProtocol = protocol;
            if (sslPorts.contains(privatePort.toString())) {
                if (protocol.equals("tcp")) {
                    sourceProtocol = "tls";
                } else {
                    sourceProtocol = "https";
                }
            }
            listenersToReturn.add(new LoadBalancerListenerInfo(privatePort, sourcePort, sourceProtocol,
                    targetPort, proxyProtocolPorts.contains(privatePort.toString())));
        }
        return listenersToReturn;
    }

    @SuppressWarnings("unchecked")
    protected List<String> getLabeledPorts(Map<String, Object> launchConfigData, String labelName) {
        List<String> sslPorts = new ArrayList<>();
        Map<String, String> labels = (Map<String, String>) launchConfigData.get(InstanceConstants.FIELD_LABELS);
        if (labels != null) {
            Object sslPortsObj = labels.get(labelName);
            if (sslPortsObj != null) {
                for (String sslPort : sslPortsObj.toString().split(",")) {
                    sslPorts.add(sslPort.trim());
                }
            }
        }

        return sslPorts;
    }

    protected List<LoadBalancerTargetInput> getLoadBalancerTargetsV2(Service lbService) {
        if (!lbService.getKind().equalsIgnoreCase(ServiceConstants.KIND_LOAD_BALANCER_SERVICE)) {
            return new ArrayList<>();
        }
        List<LoadBalancerTargetInput> targets = new ArrayList<>();
        List<? extends ServiceConsumeMap> lbLinks = objectManager.find(ServiceConsumeMap.class,
                SERVICE_CONSUME_MAP.REMOVED, null, SERVICE_CONSUME_MAP.SERVICE_ID, lbService.getId());
        for (ServiceConsumeMap lbLink : lbLinks) {
            if (lbLink.getState().equals(CommonStatesConstants.REMOVING)) {
                continue;
            }
            List<Service> consumedServices = new ArrayList<>();
            Service svc = objectManager.loadResource(Service.class, lbLink.getConsumedServiceId());
            consumedServices.add(svc);
            for (Service consumedService : consumedServices) {
                targets.add(new LoadBalancerTargetInput(consumedService, lbLink, jsonMapper));
            }
        }
        return targets;
    }

    protected List<Long> getLoadBalancerCertIds(Service lbService) {
        List<Long> certsToReturn = new ArrayList<>();
        for (Certificate cert : svcDao.getLoadBalancerServiceCertificates(lbService)) {
            certsToReturn.add(cert.getId());
        }
        return certsToReturn;
    }

    protected Long getLoadBalancerDefaultCertId(Service lbService) {
        Certificate defaultCert = svcDao.getLoadBalancerServiceDefaultCertificate(lbService);
        if (defaultCert != null) {
            return defaultCert.getId();
        }
        return null;
    }

    @Override
    public LBConfigMetadataStyle generateLBConfigMetadataStyle(Service lbService) {
        Object lbConfigObj = DataAccessor.field(lbService, ServiceConstants.FIELD_LB_CONFIG, Object.class);
        if (lbConfigObj == null) {
            return null;
        }
        LbConfig lbConfig = null;
        if (lbConfigObj != null) {
            lbConfig = jsonMapper.convertValue(lbConfigObj, LbConfig.class);
        }
        // lb config can be set for lb and regular service (when it joins LB via selectors)
        // metadata gets set for both.
        Stack selfStack = objectManager.loadResource(Stack.class, lbService.getStackId());
        return new LBConfigMetadataStyle(lbConfig.getPortRules(), lbConfig.getCertificateIds(),
                lbConfig.getDefaultCertificateId(),
                lbConfig.getConfig(), lbConfig.getStickinessPolicy(),
                getServiceIdToServiceStackName(lbService.getAccountId()),
                getCertificateIdToCertificate(lbService.getAccountId()),
                selfStack.getName(), false, getInstanceIdToInstanceName(lbService.getAccountId()));
    }

    public static class LoadBalancerListenerInfo {
        Integer privatePort;
        Integer sourcePort;
        Integer targetPort;
        String sourceProtocol;
        boolean proxyPort;

        public LoadBalancerListenerInfo(Integer privatePort, Integer sourcePort, String protocol, Integer targetPort,
                boolean proxyPort) {
            super();
            this.privatePort = privatePort;
            this.sourcePort = sourcePort;
            this.sourceProtocol = protocol;
            this.targetPort = targetPort;
            this.proxyPort = proxyPort;
        }

        // LEGACY code to support the case when private port is not defined
        public Integer getSourcePort() {
            return this.privatePort != null ? this.privatePort : this.sourcePort;
        }

        public Integer getTargetPort() {
            return targetPort;
        }

        public String getSourceProtocol() {
            return sourceProtocol;
        }

        public boolean isProxyPort() {
            return proxyPort;
        }

    }

    @Override
    public Map<Long, Pair<String, String>> getServiceIdToServiceStackName(long accountId) {
        final Map<Long, Pair<String, String>> toReturn = new HashMap<>();
        create().select(SERVICE.ID, SERVICE.NAME, STACK.NAME)
                .from(SERVICE)
                .join(STACK)
                .on(STACK.ID.eq(SERVICE.STACK_ID))
                .where(SERVICE.ACCOUNT_ID.eq(accountId))
                .and(SERVICE.REMOVED.isNull())
                .fetchInto(new RecordHandler<Record3<Long, String, String>>() {
                    @Override
                    public void next(Record3<Long, String, String> record) {
                        toReturn.put(record.getValue(SERVICE.ID), Pair.of(record.getValue(SERVICE.NAME), record.getValue(STACK.NAME)));
                    }
                });
        return toReturn;
    }

    @Override
    public Map<Long, String> getInstanceIdToInstanceName(long accountId) {
        final Map<Long, String> toReturn = new HashMap<>();
        create().select(INSTANCE.ID, INSTANCE.NAME)
                .from(INSTANCE)
                .where(INSTANCE.ACCOUNT_ID.eq(accountId))
                .and(INSTANCE.REMOVED.isNull())
                .fetchInto(new RecordHandler<Record2<Long, String>>() {
                    @Override
                    public void next(Record2<Long, String> record) {
                        toReturn.put(record.getValue(INSTANCE.ID), record.getValue(INSTANCE.NAME));
                    }
                });
        return toReturn;
    }

    @Override
    public Map<Long, String> getCertificateIdToCertificate(long accountId) {
        final Map<Long, String> toReturn = new HashMap<>();
        create().select(CERTIFICATE.ID, CERTIFICATE.NAME)
                .from(CERTIFICATE)
                .where(CERTIFICATE.ACCOUNT_ID.eq(accountId))
                .and(CERTIFICATE.REMOVED.isNull())
                .fetchInto(new RecordHandler<Record2<Long, String>>() {
                    @Override
                    public void next(Record2<Long, String> record) {
                        toReturn.put(record.getValue(CERTIFICATE.ID), record.getValue(CERTIFICATE.NAME));
                    }
                });
        return toReturn;
    }

}