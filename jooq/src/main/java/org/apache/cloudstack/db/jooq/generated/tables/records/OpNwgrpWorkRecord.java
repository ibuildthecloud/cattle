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
@javax.persistence.Table(name = "op_nwgrp_work", schema = "cloud")
public class OpNwgrpWorkRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.OpNwgrpWorkRecord> implements org.jooq.Record7<java.lang.Long, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.Long> {

	private static final long serialVersionUID = 276107121;

	/**
	 * Setter for <code>cloud.op_nwgrp_work.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.op_nwgrp_work.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.op_nwgrp_work.instance_id</code>. 
	 */
	public void setInstanceId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.op_nwgrp_work.instance_id</code>. 
	 */
	@javax.persistence.Column(name = "instance_id", nullable = false, precision = 20)
	public java.lang.Long getInstanceId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>cloud.op_nwgrp_work.mgmt_server_id</code>. 
	 */
	public void setMgmtServerId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.op_nwgrp_work.mgmt_server_id</code>. 
	 */
	@javax.persistence.Column(name = "mgmt_server_id", precision = 20)
	public java.lang.Long getMgmtServerId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>cloud.op_nwgrp_work.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.op_nwgrp_work.created</code>. 
	 */
	@javax.persistence.Column(name = "created", nullable = false)
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>cloud.op_nwgrp_work.taken</code>. 
	 */
	public void setTaken(java.sql.Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cloud.op_nwgrp_work.taken</code>. 
	 */
	@javax.persistence.Column(name = "taken")
	public java.sql.Timestamp getTaken() {
		return (java.sql.Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>cloud.op_nwgrp_work.step</code>. 
	 */
	public void setStep(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cloud.op_nwgrp_work.step</code>. 
	 */
	@javax.persistence.Column(name = "step", nullable = false, length = 32)
	public java.lang.String getStep() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>cloud.op_nwgrp_work.seq_no</code>. 
	 */
	public void setSeqNo(java.lang.Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cloud.op_nwgrp_work.seq_no</code>. 
	 */
	@javax.persistence.Column(name = "seq_no", precision = 20)
	public java.lang.Long getSeqNo() {
		return (java.lang.Long) getValue(6);
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
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Long, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.Long> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Long, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp, java.lang.String, java.lang.Long> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpNwgrpWork.OP_NWGRP_WORK.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpNwgrpWork.OP_NWGRP_WORK.INSTANCE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpNwgrpWork.OP_NWGRP_WORK.MGMT_SERVER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpNwgrpWork.OP_NWGRP_WORK.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpNwgrpWork.OP_NWGRP_WORK.TAKEN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpNwgrpWork.OP_NWGRP_WORK.STEP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field7() {
		return org.apache.cloudstack.db.jooq.generated.tables.OpNwgrpWork.OP_NWGRP_WORK.SEQ_NO;
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
	public java.lang.Long value3() {
		return getMgmtServerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getTaken();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getStep();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value7() {
		return getSeqNo();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached OpNwgrpWorkRecord
	 */
	public OpNwgrpWorkRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.OpNwgrpWork.OP_NWGRP_WORK);
	}

	/**
	 * Create a detached, initialised OpNwgrpWorkRecord
	 */
	public OpNwgrpWorkRecord(java.lang.Long id, java.lang.Long instanceId, java.lang.Long mgmtServerId, java.sql.Timestamp created, java.sql.Timestamp taken, java.lang.String step, java.lang.Long seqNo) {
		super(org.apache.cloudstack.db.jooq.generated.tables.OpNwgrpWork.OP_NWGRP_WORK);

		setValue(0, id);
		setValue(1, instanceId);
		setValue(2, mgmtServerId);
		setValue(3, created);
		setValue(4, taken);
		setValue(5, step);
		setValue(6, seqNo);
	}
}
