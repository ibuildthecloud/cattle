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
@javax.persistence.Table(name = "op_ha_work", schema = "cloud")
public class OpHaWorkRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.OpHaWorkRecord> implements org.jooq.Record13<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.lang.Integer, java.sql.Timestamp, java.lang.String, java.lang.Long, java.lang.Long> {

	private static final long serialVersionUID = 1248413358;

	/**
	 * Setter for <code>cloud.op_ha_work.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.op_ha_work.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.op_ha_work.instance_id</code>. 
	 */
	public void setInstanceId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.op_ha_work.instance_id</code>. 
	 */
	@javax.persistence.Column(name = "instance_id", nullable = false, precision = 20)
	public java.lang.Long getInstanceId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>cloud.op_ha_work.type</code>. 
	 */
	public void setType(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.op_ha_work.type</code>. 
	 */
	@javax.persistence.Column(name = "type", nullable = false, length = 32)
	public java.lang.String getType() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>cloud.op_ha_work.vm_type</code>. 
	 */
	public void setVmType(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.op_ha_work.vm_type</code>. 
	 */
	@javax.persistence.Column(name = "vm_type", nullable = false, length = 32)
	public java.lang.String getVmType() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>cloud.op_ha_work.state</code>. 
	 */
	public void setState(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cloud.op_ha_work.state</code>. 
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 32)
	public java.lang.String getState() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>cloud.op_ha_work.mgmt_server_id</code>. 
	 */
	public void setMgmtServerId(java.lang.Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cloud.op_ha_work.mgmt_server_id</code>. 
	 */
	@javax.persistence.Column(name = "mgmt_server_id", precision = 20)
	public java.lang.Long getMgmtServerId() {
		return (java.lang.Long) getValue(5);
	}

	/**
	 * Setter for <code>cloud.op_ha_work.host_id</code>. 
	 */
	public void setHostId(java.lang.Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cloud.op_ha_work.host_id</code>. 
	 */
	@javax.persistence.Column(name = "host_id", precision = 20)
	public java.lang.Long getHostId() {
		return (java.lang.Long) getValue(6);
	}

	/**
	 * Setter for <code>cloud.op_ha_work.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cloud.op_ha_work.created</code>. 
	 */
	@javax.persistence.Column(name = "created", nullable = false)
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>cloud.op_ha_work.tried</code>. 
	 */
	public void setTried(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>cloud.op_ha_work.tried</code>. 
	 */
	@javax.persistence.Column(name = "tried", precision = 10)
	public java.lang.Integer getTried() {
		return (java.lang.Integer) getValue(8);
	}

	/**
	 * Setter for <code>cloud.op_ha_work.taken</code>. 
	 */
	public void setTaken(java.sql.Timestamp value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>cloud.op_ha_work.taken</code>. 
	 */
	@javax.persistence.Column(name = "taken")
	public java.sql.Timestamp getTaken() {
		return (java.sql.Timestamp) getValue(9);
	}

	/**
	 * Setter for <code>cloud.op_ha_work.step</code>. 
	 */
	public void setStep(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>cloud.op_ha_work.step</code>. 
	 */
	@javax.persistence.Column(name = "step", nullable = false, length = 32)
	public java.lang.String getStep() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>cloud.op_ha_work.time_to_try</code>. 
	 */
	public void setTimeToTry(java.lang.Long value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>cloud.op_ha_work.time_to_try</code>. 
	 */
	@javax.persistence.Column(name = "time_to_try", precision = 19)
	public java.lang.Long getTimeToTry() {
		return (java.lang.Long) getValue(11);
	}

	/**
	 * Setter for <code>cloud.op_ha_work.updated</code>. 
	 */
	public void setUpdated(java.lang.Long value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>cloud.op_ha_work.updated</code>. 
	 */
	@javax.persistence.Column(name = "updated", nullable = false, precision = 20)
	public java.lang.Long getUpdated() {
		return (java.lang.Long) getValue(12);
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
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.lang.Integer, java.sql.Timestamp, java.lang.String, java.lang.Long, java.lang.Long> fieldsRow() {
		return (org.jooq.Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.lang.Integer, java.sql.Timestamp, java.lang.String, java.lang.Long, java.lang.Long> valuesRow() {
		return (org.jooq.Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpHaWork.OP_HA_WORK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpHaWork.OP_HA_WORK.INSTANCE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpHaWork.OP_HA_WORK.TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpHaWork.OP_HA_WORK.VM_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpHaWork.OP_HA_WORK.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpHaWork.OP_HA_WORK.MGMT_SERVER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field7() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpHaWork.OP_HA_WORK.HOST_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field8() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpHaWork.OP_HA_WORK.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpHaWork.OP_HA_WORK.TRIED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field10() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpHaWork.OP_HA_WORK.TAKEN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpHaWork.OP_HA_WORK.STEP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field12() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpHaWork.OP_HA_WORK.TIME_TO_TRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field13() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpHaWork.OP_HA_WORK.UPDATED;
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
	public java.lang.Long value2() {
		return getInstanceId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getVmType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value6() {
		return getMgmtServerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value7() {
		return getHostId();
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
		return getTried();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value10() {
		return getTaken();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getStep();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value12() {
		return getTimeToTry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value13() {
		return getUpdated();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached OpHaWorkRecord
	 */
	public OpHaWorkRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.OpHaWork.OP_HA_WORK);
	}

	/**
	 * Create a detached, initialised OpHaWorkRecord
	 */
	public OpHaWorkRecord(java.lang.Long id, java.lang.Long instanceId, java.lang.String type, java.lang.String vmType, java.lang.String state, java.lang.Long mgmtServerId, java.lang.Long hostId, java.sql.Timestamp created, java.lang.Integer tried, java.sql.Timestamp taken, java.lang.String step, java.lang.Long timeToTry, java.lang.Long updated) {
		super(org.apache.cloudstack.db.jooq.generated.tables.OpHaWork.OP_HA_WORK);

		setValue(0, id);
		setValue(1, instanceId);
		setValue(2, type);
		setValue(3, vmType);
		setValue(4, state);
		setValue(5, mgmtServerId);
		setValue(6, hostId);
		setValue(7, created);
		setValue(8, tried);
		setValue(9, taken);
		setValue(10, step);
		setValue(11, timeToTry);
		setValue(12, updated);
	}
}
