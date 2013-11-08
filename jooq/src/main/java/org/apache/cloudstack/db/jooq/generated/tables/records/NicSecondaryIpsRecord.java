/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "nic_secondary_ips", schema = "cloud")
public class NicSecondaryIpsRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.NicSecondaryIpsRecord> implements org.jooq.Record10<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.sql.Timestamp, java.lang.Long, java.lang.Long> {

	private static final long serialVersionUID = 1812477250;

	/**
	 * Setter for <code>cloud.nic_secondary_ips.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.nic_secondary_ips.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.nic_secondary_ips.uuid</code>. 
	 */
	public void setUuid(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.nic_secondary_ips.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", unique = true, length = 40)
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cloud.nic_secondary_ips.vmId</code>. 
	 */
	public void setVmid(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.nic_secondary_ips.vmId</code>. 
	 */
	@javax.persistence.Column(name = "vmId", precision = 20)
	public java.lang.Long getVmid() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>cloud.nic_secondary_ips.nicId</code>. 
	 */
	public void setNicid(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.nic_secondary_ips.nicId</code>. 
	 */
	@javax.persistence.Column(name = "nicId", nullable = false, precision = 20)
	public java.lang.Long getNicid() {
		return (java.lang.Long) getValue(3);
	}

	/**
	 * Setter for <code>cloud.nic_secondary_ips.ip4_address</code>. 
	 */
	public void setIp4Address(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cloud.nic_secondary_ips.ip4_address</code>. 
	 */
	@javax.persistence.Column(name = "ip4_address", length = 40)
	public java.lang.String getIp4Address() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>cloud.nic_secondary_ips.ip6_address</code>. 
	 */
	public void setIp6Address(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cloud.nic_secondary_ips.ip6_address</code>. 
	 */
	@javax.persistence.Column(name = "ip6_address", length = 40)
	public java.lang.String getIp6Address() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>cloud.nic_secondary_ips.network_id</code>. 
	 */
	public void setNetworkId(java.lang.Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cloud.nic_secondary_ips.network_id</code>. 
	 */
	@javax.persistence.Column(name = "network_id", nullable = false, precision = 20)
	public java.lang.Long getNetworkId() {
		return (java.lang.Long) getValue(6);
	}

	/**
	 * Setter for <code>cloud.nic_secondary_ips.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cloud.nic_secondary_ips.created</code>. 
	 */
	@javax.persistence.Column(name = "created", nullable = false)
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>cloud.nic_secondary_ips.account_id</code>. 
	 */
	public void setAccountId(java.lang.Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>cloud.nic_secondary_ips.account_id</code>. 
	 */
	@javax.persistence.Column(name = "account_id", nullable = false, precision = 20)
	public java.lang.Long getAccountId() {
		return (java.lang.Long) getValue(8);
	}

	/**
	 * Setter for <code>cloud.nic_secondary_ips.domain_id</code>. 
	 */
	public void setDomainId(java.lang.Long value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>cloud.nic_secondary_ips.domain_id</code>. 
	 */
	@javax.persistence.Column(name = "domain_id", nullable = false, precision = 20)
	public java.lang.Long getDomainId() {
		return (java.lang.Long) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.sql.Timestamp, java.lang.Long, java.lang.Long> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.sql.Timestamp, java.lang.Long, java.lang.Long> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.VMID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.NICID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.IP4_ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.IP6_ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field7() {
		return org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.NETWORK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field8() {
		return org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field9() {
		return org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.ACCOUNT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field10() {
		return org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.DOMAIN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getVmid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getNicid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getIp4Address();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getIp6Address();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value7() {
		return getNetworkId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value8() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value9() {
		return getAccountId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value10() {
		return getDomainId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached NicSecondaryIpsRecord
	 */
	public NicSecondaryIpsRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS);
	}

	/**
	 * Create a detached, initialised NicSecondaryIpsRecord
	 */
	public NicSecondaryIpsRecord(java.lang.Long id, java.lang.String uuid, java.lang.Long vmid, java.lang.Long nicid, java.lang.String ip4Address, java.lang.String ip6Address, java.lang.Long networkId, java.sql.Timestamp created, java.lang.Long accountId, java.lang.Long domainId) {
		super(org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS);

		setValue(0, id);
		setValue(1, uuid);
		setValue(2, vmid);
		setValue(3, nicid);
		setValue(4, ip4Address);
		setValue(5, ip6Address);
		setValue(6, networkId);
		setValue(7, created);
		setValue(8, accountId);
		setValue(9, domainId);
	}
}
