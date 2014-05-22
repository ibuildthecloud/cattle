package io.cattle.platform.configitem.context.data;

import io.cattle.platform.core.model.Instance;
import io.cattle.platform.core.model.IpAddress;
import io.cattle.platform.core.model.Nic;

public class MetadataEntry {

    Instance instance;
    Nic nic;
    IpAddress ipAddress;
    IpAddress publicIpAddress;

    public Instance getInstance() {
        return instance;
    }

    public void setInstance(Instance instance) {
        this.instance = instance;
    }

    public Nic getNic() {
        return nic;
    }

    public void setNic(Nic nic) {
        this.nic = nic;
    }

    public IpAddress getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(IpAddress ipAddress) {
        this.ipAddress = ipAddress;
    }

    public IpAddress getPublicIpAddress() {
        return publicIpAddress;
    }

    public void setPublicIpAddress(IpAddress publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

}
