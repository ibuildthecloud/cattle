package io.cattle.platform.docker.process.instancehostmap;

import java.util.Map;

import javax.inject.Inject;

import com.netflix.config.DynamicBooleanProperty;

import static io.cattle.platform.core.model.tables.IpAddressTable.*;
import static io.cattle.platform.core.model.tables.HostIpAddressMapTable.*;
import io.cattle.platform.archaius.util.ArchaiusUtil;
import io.cattle.platform.core.dao.IpAddressDao;
import io.cattle.platform.core.model.Host;
import io.cattle.platform.core.model.HostIpAddressMap;
import io.cattle.platform.core.model.Instance;
import io.cattle.platform.core.model.InstanceHostMap;
import io.cattle.platform.core.model.IpAddress;
import io.cattle.platform.core.model.Port;
import io.cattle.platform.docker.constants.DockerInstanceConstants;
import io.cattle.platform.engine.handler.HandlerResult;
import io.cattle.platform.engine.handler.ProcessPostListener;
import io.cattle.platform.engine.process.ProcessInstance;
import io.cattle.platform.engine.process.ProcessState;
import io.cattle.platform.json.JsonMapper;
import io.cattle.platform.object.util.DataAccessor;
import io.cattle.platform.process.common.handler.AbstractObjectProcessHandler;

public class DockerPostInstanceHostMapActivate extends AbstractObjectProcessHandler implements ProcessPostListener {

    public static final DynamicBooleanProperty DYNAMIC_ADD_IP = ArchaiusUtil.getBoolean("docker.compute.auto.add.host.ip");

    JsonMapper jsonMapper;
    IpAddressDao ipAddressDao;

    @Override
    public String[] getProcessNames() {
        return new String[] { "instancehostmap.activate" };
    }

    @Override
    public HandlerResult handle(ProcessState state, ProcessInstance process) {
        InstanceHostMap map = (InstanceHostMap)state.getResource();
        Instance instance = getObjectManager().loadResource(Instance.class, map.getInstanceId());
        Host host = getObjectManager().loadResource(Host.class, map.getHostId());

        String hostIp = DataAccessor.fields(instance)
                .withKey(DockerInstanceConstants.FIELD_DOCKER_HOST_IP)
                .as(String.class);

        Map ports = DataAccessor.fields(instance)
                .withKey(DockerInstanceConstants.FIELD_DOCKER_PORTS)
                .as(jsonMapper, Map.class);

        if ( hostIp != null && ports != null ) {
            processPorts(hostIp, ports, instance, host);
        }

        return null;
    }

    protected void processPorts(String hostIp, Map<String,String> ports, Instance instance, Host host) {
        IpAddress ipAddress = getIpAddress(host, hostIp);

        if ( ipAddress == null && DYNAMIC_ADD_IP.get() ) {
            ipAddress = ipAddressDao.assignNewAddress(host, hostIp);
        }

        if ( DYNAMIC_ADD_IP.get() ) {
            createThenActivate(ipAddress, null);
            for ( HostIpAddressMap map : getObjectManager().children(ipAddress, HostIpAddressMap.class) ) {
                if ( map.getHostId().longValue() == host.getId() ) {
                    createThenActivate(map, null);
                }
            }
        }

        for ( Port port : getObjectManager().children(instance, Port.class) ) {

        }
    }

    protected IpAddress getIpAddress(Host host, String hostIp) {
        for ( IpAddress address : getObjectManager().mappedChildren(host, IpAddress.class) ) {
            if ( hostIp.equals(address.getAddress()) ) {
                return address;
            }
        }

        return null;
    }

    public JsonMapper getJsonMapper() {
        return jsonMapper;
    }

    @Inject
    public void setJsonMapper(JsonMapper jsonMapper) {
        this.jsonMapper = jsonMapper;
    }

    public IpAddressDao getIpAddressDao() {
        return ipAddressDao;
    }

    @Inject
    public void setIpAddressDao(IpAddressDao ipAddressDao) {
        this.ipAddressDao = ipAddressDao;
    }

}
