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
@javax.persistence.Table(name = "user_ip_address", schema = "cloud", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"public_ip_address", "source_network_id"})
})
public class UserIpAddress implements java.io.Serializable {

	private static final long serialVersionUID = 1497847238;

	private java.lang.Long     id;
	private java.lang.String   uuid;
	private java.lang.Long     accountId;
	private java.lang.Long     domainId;
	private java.lang.String   publicIpAddress;
	private java.lang.Long     dataCenterId;
	private java.lang.Integer  sourceNat;
	private java.sql.Timestamp allocated;
	private java.lang.Long     vlanDbId;
	private java.lang.Integer  oneToOneNat;
	private java.lang.Long     vmId;
	private java.lang.String   state;
	private java.lang.Long     macAddress;
	private java.lang.Long     sourceNetworkId;
	private java.lang.Long     networkId;
	private java.lang.Long     physicalNetworkId;
	private java.lang.Integer  isSystem;
	private java.lang.Long     vpcId;
	private java.lang.String   dnatVmip;
	private java.lang.Integer  isPortable;

	public UserIpAddress() {}

	public UserIpAddress(
		java.lang.Long     id,
		java.lang.String   uuid,
		java.lang.Long     accountId,
		java.lang.Long     domainId,
		java.lang.String   publicIpAddress,
		java.lang.Long     dataCenterId,
		java.lang.Integer  sourceNat,
		java.sql.Timestamp allocated,
		java.lang.Long     vlanDbId,
		java.lang.Integer  oneToOneNat,
		java.lang.Long     vmId,
		java.lang.String   state,
		java.lang.Long     macAddress,
		java.lang.Long     sourceNetworkId,
		java.lang.Long     networkId,
		java.lang.Long     physicalNetworkId,
		java.lang.Integer  isSystem,
		java.lang.Long     vpcId,
		java.lang.String   dnatVmip,
		java.lang.Integer  isPortable
	) {
		this.id = id;
		this.uuid = uuid;
		this.accountId = accountId;
		this.domainId = domainId;
		this.publicIpAddress = publicIpAddress;
		this.dataCenterId = dataCenterId;
		this.sourceNat = sourceNat;
		this.allocated = allocated;
		this.vlanDbId = vlanDbId;
		this.oneToOneNat = oneToOneNat;
		this.vmId = vmId;
		this.state = state;
		this.macAddress = macAddress;
		this.sourceNetworkId = sourceNetworkId;
		this.networkId = networkId;
		this.physicalNetworkId = physicalNetworkId;
		this.isSystem = isSystem;
		this.vpcId = vpcId;
		this.dnatVmip = dnatVmip;
		this.isPortable = isPortable;
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

	@javax.persistence.Column(name = "account_id", precision = 20)
	public java.lang.Long getAccountId() {
		return this.accountId;
	}

	public void setAccountId(java.lang.Long accountId) {
		this.accountId = accountId;
	}

	@javax.persistence.Column(name = "domain_id", precision = 20)
	public java.lang.Long getDomainId() {
		return this.domainId;
	}

	public void setDomainId(java.lang.Long domainId) {
		this.domainId = domainId;
	}

	@javax.persistence.Column(name = "public_ip_address", nullable = false, length = 40)
	public java.lang.String getPublicIpAddress() {
		return this.publicIpAddress;
	}

	public void setPublicIpAddress(java.lang.String publicIpAddress) {
		this.publicIpAddress = publicIpAddress;
	}

	@javax.persistence.Column(name = "data_center_id", nullable = false, precision = 20)
	public java.lang.Long getDataCenterId() {
		return this.dataCenterId;
	}

	public void setDataCenterId(java.lang.Long dataCenterId) {
		this.dataCenterId = dataCenterId;
	}

	@javax.persistence.Column(name = "source_nat", nullable = false, precision = 10)
	public java.lang.Integer getSourceNat() {
		return this.sourceNat;
	}

	public void setSourceNat(java.lang.Integer sourceNat) {
		this.sourceNat = sourceNat;
	}

	@javax.persistence.Column(name = "allocated")
	public java.sql.Timestamp getAllocated() {
		return this.allocated;
	}

	public void setAllocated(java.sql.Timestamp allocated) {
		this.allocated = allocated;
	}

	@javax.persistence.Column(name = "vlan_db_id", nullable = false, precision = 20)
	public java.lang.Long getVlanDbId() {
		return this.vlanDbId;
	}

	public void setVlanDbId(java.lang.Long vlanDbId) {
		this.vlanDbId = vlanDbId;
	}

	@javax.persistence.Column(name = "one_to_one_nat", nullable = false, precision = 10)
	public java.lang.Integer getOneToOneNat() {
		return this.oneToOneNat;
	}

	public void setOneToOneNat(java.lang.Integer oneToOneNat) {
		this.oneToOneNat = oneToOneNat;
	}

	@javax.persistence.Column(name = "vm_id", precision = 20)
	public java.lang.Long getVmId() {
		return this.vmId;
	}

	public void setVmId(java.lang.Long vmId) {
		this.vmId = vmId;
	}

	@javax.persistence.Column(name = "state", nullable = false, length = 32)
	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	@javax.persistence.Column(name = "mac_address", nullable = false, precision = 20)
	public java.lang.Long getMacAddress() {
		return this.macAddress;
	}

	public void setMacAddress(java.lang.Long macAddress) {
		this.macAddress = macAddress;
	}

	@javax.persistence.Column(name = "source_network_id", nullable = false, precision = 20)
	public java.lang.Long getSourceNetworkId() {
		return this.sourceNetworkId;
	}

	public void setSourceNetworkId(java.lang.Long sourceNetworkId) {
		this.sourceNetworkId = sourceNetworkId;
	}

	@javax.persistence.Column(name = "network_id", precision = 20)
	public java.lang.Long getNetworkId() {
		return this.networkId;
	}

	public void setNetworkId(java.lang.Long networkId) {
		this.networkId = networkId;
	}

	@javax.persistence.Column(name = "physical_network_id", nullable = false, precision = 20)
	public java.lang.Long getPhysicalNetworkId() {
		return this.physicalNetworkId;
	}

	public void setPhysicalNetworkId(java.lang.Long physicalNetworkId) {
		this.physicalNetworkId = physicalNetworkId;
	}

	@javax.persistence.Column(name = "is_system", nullable = false, precision = 10)
	public java.lang.Integer getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(java.lang.Integer isSystem) {
		this.isSystem = isSystem;
	}

	@javax.persistence.Column(name = "vpc_id", precision = 20)
	public java.lang.Long getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(java.lang.Long vpcId) {
		this.vpcId = vpcId;
	}

	@javax.persistence.Column(name = "dnat_vmip", length = 40)
	public java.lang.String getDnatVmip() {
		return this.dnatVmip;
	}

	public void setDnatVmip(java.lang.String dnatVmip) {
		this.dnatVmip = dnatVmip;
	}

	@javax.persistence.Column(name = "is_portable", nullable = false, precision = 10)
	public java.lang.Integer getIsPortable() {
		return this.isPortable;
	}

	public void setIsPortable(java.lang.Integer isPortable) {
		this.isPortable = isPortable;
	}
}
