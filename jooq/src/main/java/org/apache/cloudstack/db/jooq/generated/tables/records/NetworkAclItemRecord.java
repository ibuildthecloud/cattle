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
@javax.persistence.Table(name = "network_acl_item", schema = "cloud", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"acl_id", "number"})
})
public class NetworkAclItemRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.NetworkAclItemRecord> implements org.jooq.Record14<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = -1206630619;

	/**
	 * Setter for <code>cloud.network_acl_item.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.network_acl_item.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.network_acl_item.uuid</code>. 
	 */
	public void setUuid(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.network_acl_item.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", unique = true, length = 40)
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cloud.network_acl_item.acl_id</code>. 
	 */
	public void setAclId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.network_acl_item.acl_id</code>. 
	 */
	@javax.persistence.Column(name = "acl_id", nullable = false, precision = 20)
	public java.lang.Long getAclId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>cloud.network_acl_item.start_port</code>. 
	 */
	public void setStartPort(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.network_acl_item.start_port</code>. 
	 */
	@javax.persistence.Column(name = "start_port", precision = 10)
	public java.lang.Integer getStartPort() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>cloud.network_acl_item.end_port</code>. 
	 */
	public void setEndPort(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cloud.network_acl_item.end_port</code>. 
	 */
	@javax.persistence.Column(name = "end_port", precision = 10)
	public java.lang.Integer getEndPort() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>cloud.network_acl_item.state</code>. 
	 */
	public void setState(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cloud.network_acl_item.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 32)
	public java.lang.String getState() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>cloud.network_acl_item.protocol</code>. 
	 */
	public void setProtocol(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cloud.network_acl_item.protocol</code>. 
	 */
	@javax.persistence.Column(name = "protocol", nullable = false, length = 16)
	public java.lang.String getProtocol() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>cloud.network_acl_item.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cloud.network_acl_item.created</code>. 
	 */
	@javax.persistence.Column(name = "created")
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>cloud.network_acl_item.icmp_code</code>. 
	 */
	public void setIcmpCode(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>cloud.network_acl_item.icmp_code</code>. 
	 */
	@javax.persistence.Column(name = "icmp_code", precision = 10)
	public java.lang.Integer getIcmpCode() {
		return (java.lang.Integer) getValue(8);
	}

	/**
	 * Setter for <code>cloud.network_acl_item.icmp_type</code>. 
	 */
	public void setIcmpType(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>cloud.network_acl_item.icmp_type</code>. 
	 */
	@javax.persistence.Column(name = "icmp_type", precision = 10)
	public java.lang.Integer getIcmpType() {
		return (java.lang.Integer) getValue(9);
	}

	/**
	 * Setter for <code>cloud.network_acl_item.traffic_type</code>. 
	 */
	public void setTrafficType(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>cloud.network_acl_item.traffic_type</code>. 
	 */
	@javax.persistence.Column(name = "traffic_type", length = 32)
	public java.lang.String getTrafficType() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>cloud.network_acl_item.cidr</code>. 
	 */
	public void setCidr(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>cloud.network_acl_item.cidr</code>. 
	 */
	@javax.persistence.Column(name = "cidr", length = 255)
	public java.lang.String getCidr() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>cloud.network_acl_item.number</code>. 
	 */
	public void setNumber(java.lang.Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>cloud.network_acl_item.number</code>. 
	 */
	@javax.persistence.Column(name = "number", nullable = false, precision = 10)
	public java.lang.Integer getNumber() {
		return (java.lang.Integer) getValue(12);
	}

	/**
	 * Setter for <code>cloud.network_acl_item.action</code>. 
	 */
	public void setAction(java.lang.String value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>cloud.network_acl_item.action</code>. 
	 */
	@javax.persistence.Column(name = "action", nullable = false, length = 10)
	public java.lang.String getAction() {
		return (java.lang.String) getValue(13);
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
	// Record14 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row14<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row14) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row14<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row14) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetworkAclItem.NETWORK_ACL_ITEM.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetworkAclItem.NETWORK_ACL_ITEM.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetworkAclItem.NETWORK_ACL_ITEM.ACL_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetworkAclItem.NETWORK_ACL_ITEM.START_PORT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetworkAclItem.NETWORK_ACL_ITEM.END_PORT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetworkAclItem.NETWORK_ACL_ITEM.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetworkAclItem.NETWORK_ACL_ITEM.PROTOCOL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field8() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetworkAclItem.NETWORK_ACL_ITEM.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetworkAclItem.NETWORK_ACL_ITEM.ICMP_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field10() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetworkAclItem.NETWORK_ACL_ITEM.ICMP_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetworkAclItem.NETWORK_ACL_ITEM.TRAFFIC_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetworkAclItem.NETWORK_ACL_ITEM.CIDR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field13() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetworkAclItem.NETWORK_ACL_ITEM.NUMBER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field14() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetworkAclItem.NETWORK_ACL_ITEM.ACTION;
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
		return getAclId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getStartPort();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getEndPort();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getProtocol();
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
	public java.lang.Integer value9() {
		return getIcmpCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value10() {
		return getIcmpType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getTrafficType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getCidr();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value13() {
		return getNumber();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value14() {
		return getAction();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached NetworkAclItemRecord
	 */
	public NetworkAclItemRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.NetworkAclItem.NETWORK_ACL_ITEM);
	}

	/**
	 * Create a detached, initialised NetworkAclItemRecord
	 */
	public NetworkAclItemRecord(java.lang.Long id, java.lang.String uuid, java.lang.Long aclId, java.lang.Integer startPort, java.lang.Integer endPort, java.lang.String state, java.lang.String protocol, java.sql.Timestamp created, java.lang.Integer icmpCode, java.lang.Integer icmpType, java.lang.String trafficType, java.lang.String cidr, java.lang.Integer number, java.lang.String action) {
		super(org.apache.cloudstack.db.jooq.generated.tables.NetworkAclItem.NETWORK_ACL_ITEM);

		setValue(0, id);
		setValue(1, uuid);
		setValue(2, aclId);
		setValue(3, startPort);
		setValue(4, endPort);
		setValue(5, state);
		setValue(6, protocol);
		setValue(7, created);
		setValue(8, icmpCode);
		setValue(9, icmpType);
		setValue(10, trafficType);
		setValue(11, cidr);
		setValue(12, number);
		setValue(13, action);
	}
}
