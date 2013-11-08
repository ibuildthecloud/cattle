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
@javax.persistence.Table(name = "op_host_upgrade", schema = "cloud")
public class OpHostUpgradeRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.OpHostUpgradeRecord> implements org.jooq.Record3<java.lang.Long, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1745673164;

	/**
	 * Setter for <code>cloud.op_host_upgrade.host_id</code>. 
	 */
	public void setHostId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.op_host_upgrade.host_id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "host_id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getHostId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.op_host_upgrade.version</code>. 
	 */
	public void setVersion(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.op_host_upgrade.version</code>. 
	 */
	@javax.persistence.Column(name = "version", nullable = false, length = 20)
	public java.lang.String getVersion() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cloud.op_host_upgrade.state</code>. 
	 */
	public void setState(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.op_host_upgrade.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 20)
	public java.lang.String getState() {
		return (java.lang.String) getValue(2);
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
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpHostUpgrade.OP_HOST_UPGRADE.HOST_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpHostUpgrade.OP_HOST_UPGRADE.VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpHostUpgrade.OP_HOST_UPGRADE.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getHostId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getVersion();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getState();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached OpHostUpgradeRecord
	 */
	public OpHostUpgradeRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.OpHostUpgrade.OP_HOST_UPGRADE);
	}

	/**
	 * Create a detached, initialised OpHostUpgradeRecord
	 */
	public OpHostUpgradeRecord(java.lang.Long hostId, java.lang.String version, java.lang.String state) {
		super(org.apache.cloudstack.db.jooq.generated.tables.OpHostUpgrade.OP_HOST_UPGRADE);

		setValue(0, hostId);
		setValue(1, version);
		setValue(2, state);
	}
}
