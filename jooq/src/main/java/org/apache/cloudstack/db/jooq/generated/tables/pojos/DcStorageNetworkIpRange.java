/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "dc_storage_network_ip_range", schema = "cloud")
public class DcStorageNetworkIpRange implements java.io.Serializable {

	private static final long serialVersionUID = 415051136;

	private java.lang.Long    id;
	private java.lang.String  uuid;
	private java.lang.String  startIp;
	private java.lang.String  endIp;
	private java.lang.String  gateway;
	private java.lang.Integer vlan;
	private java.lang.String  netmask;
	private java.lang.Long    dataCenterId;
	private java.lang.Long    podId;
	private java.lang.Long    networkId;

	public DcStorageNetworkIpRange() {}

	public DcStorageNetworkIpRange(
		java.lang.Long    id,
		java.lang.String  uuid,
		java.lang.String  startIp,
		java.lang.String  endIp,
		java.lang.String  gateway,
		java.lang.Integer vlan,
		java.lang.String  netmask,
		java.lang.Long    dataCenterId,
		java.lang.Long    podId,
		java.lang.Long    networkId
	) {
		this.id = id;
		this.uuid = uuid;
		this.startIp = startIp;
		this.endIp = endIp;
		this.gateway = gateway;
		this.vlan = vlan;
		this.netmask = netmask;
		this.dataCenterId = dataCenterId;
		this.podId = podId;
		this.networkId = networkId;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "uuid", unique = true, length = 40)
	public java.lang.String getUuid() {
		return this.uuid;
	}

	public void setUuid(java.lang.String uuid) {
		this.uuid = uuid;
	}

	@javax.persistence.Column(name = "start_ip", nullable = false, length = 40)
	public java.lang.String getStartIp() {
		return this.startIp;
	}

	public void setStartIp(java.lang.String startIp) {
		this.startIp = startIp;
	}

	@javax.persistence.Column(name = "end_ip", nullable = false, length = 40)
	public java.lang.String getEndIp() {
		return this.endIp;
	}

	public void setEndIp(java.lang.String endIp) {
		this.endIp = endIp;
	}

	@javax.persistence.Column(name = "gateway", nullable = false, length = 15)
	public java.lang.String getGateway() {
		return this.gateway;
	}

	public void setGateway(java.lang.String gateway) {
		this.gateway = gateway;
	}

	@javax.persistence.Column(name = "vlan", precision = 10)
	public java.lang.Integer getVlan() {
		return this.vlan;
	}

	public void setVlan(java.lang.Integer vlan) {
		this.vlan = vlan;
	}

	@javax.persistence.Column(name = "netmask", nullable = false, length = 15)
	public java.lang.String getNetmask() {
		return this.netmask;
	}

	public void setNetmask(java.lang.String netmask) {
		this.netmask = netmask;
	}

	@javax.persistence.Column(name = "data_center_id", nullable = false, precision = 20)
	public java.lang.Long getDataCenterId() {
		return this.dataCenterId;
	}

	public void setDataCenterId(java.lang.Long dataCenterId) {
		this.dataCenterId = dataCenterId;
	}

	@javax.persistence.Column(name = "pod_id", nullable = false, precision = 20)
	public java.lang.Long getPodId() {
		return this.podId;
	}

	public void setPodId(java.lang.Long podId) {
		this.podId = podId;
	}

	@javax.persistence.Column(name = "network_id", nullable = false, precision = 20)
	public java.lang.Long getNetworkId() {
		return this.networkId;
	}

	public void setNetworkId(java.lang.Long networkId) {
		this.networkId = networkId;
	}
}
