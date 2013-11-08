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
@javax.persistence.Table(name = "conditions", schema = "cloud")
public class ConditionsRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.ConditionsRecord> implements org.jooq.Record9<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp> {

	private static final long serialVersionUID = -904103125;

	/**
	 * Setter for <code>cloud.conditions.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.conditions.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.conditions.uuid</code>. 
	 */
	public void setUuid(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.conditions.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", unique = true, length = 40)
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cloud.conditions.counter_id</code>. 
	 */
	public void setCounterId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.conditions.counter_id</code>. 
	 */
	@javax.persistence.Column(name = "counter_id", nullable = false, precision = 20)
	public java.lang.Long getCounterId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>cloud.conditions.threshold</code>. 
	 */
	public void setThreshold(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.conditions.threshold</code>. 
	 */
	@javax.persistence.Column(name = "threshold", nullable = false, precision = 20)
	public java.lang.Long getThreshold() {
		return (java.lang.Long) getValue(3);
	}

	/**
	 * Setter for <code>cloud.conditions.relational_operator</code>. 
	 */
	public void setRelationalOperator(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cloud.conditions.relational_operator</code>. 
	 */
	@javax.persistence.Column(name = "relational_operator", length = 2)
	public java.lang.String getRelationalOperator() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>cloud.conditions.domain_id</code>. 
	 */
	public void setDomainId(java.lang.Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cloud.conditions.domain_id</code>. 
	 */
	@javax.persistence.Column(name = "domain_id", nullable = false, precision = 20)
	public java.lang.Long getDomainId() {
		return (java.lang.Long) getValue(5);
	}

	/**
	 * Setter for <code>cloud.conditions.account_id</code>. 
	 */
	public void setAccountId(java.lang.Long value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cloud.conditions.account_id</code>. 
	 */
	@javax.persistence.Column(name = "account_id", nullable = false, precision = 20)
	public java.lang.Long getAccountId() {
		return (java.lang.Long) getValue(6);
	}

	/**
	 * Setter for <code>cloud.conditions.removed</code>. 
	 */
	public void setRemoved(java.sql.Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cloud.conditions.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	public java.sql.Timestamp getRemoved() {
		return (java.sql.Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>cloud.conditions.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>cloud.conditions.created</code>. 
	 */
	@javax.persistence.Column(name = "created", nullable = false)
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(8);
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
	// Record9 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row9) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row9<java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.Long, java.lang.Long, java.sql.Timestamp, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row9) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.Conditions.CONDITIONS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.Conditions.CONDITIONS.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.Conditions.CONDITIONS.COUNTER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return org.apache.cloudstack.db.jooq.generated.tables.Conditions.CONDITIONS.THRESHOLD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.apache.cloudstack.db.jooq.generated.tables.Conditions.CONDITIONS.RELATIONAL_OPERATOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return org.apache.cloudstack.db.jooq.generated.tables.Conditions.CONDITIONS.DOMAIN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field7() {
		return org.apache.cloudstack.db.jooq.generated.tables.Conditions.CONDITIONS.ACCOUNT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field8() {
		return org.apache.cloudstack.db.jooq.generated.tables.Conditions.CONDITIONS.REMOVED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field9() {
		return org.apache.cloudstack.db.jooq.generated.tables.Conditions.CONDITIONS.CREATED;
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
		return getCounterId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getThreshold();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getRelationalOperator();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value6() {
		return getDomainId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value7() {
		return getAccountId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value8() {
		return getRemoved();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value9() {
		return getCreated();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ConditionsRecord
	 */
	public ConditionsRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.Conditions.CONDITIONS);
	}

	/**
	 * Create a detached, initialised ConditionsRecord
	 */
	public ConditionsRecord(java.lang.Long id, java.lang.String uuid, java.lang.Long counterId, java.lang.Long threshold, java.lang.String relationalOperator, java.lang.Long domainId, java.lang.Long accountId, java.sql.Timestamp removed, java.sql.Timestamp created) {
		super(org.apache.cloudstack.db.jooq.generated.tables.Conditions.CONDITIONS);

		setValue(0, id);
		setValue(1, uuid);
		setValue(2, counterId);
		setValue(3, threshold);
		setValue(4, relationalOperator);
		setValue(5, domainId);
		setValue(6, accountId);
		setValue(7, removed);
		setValue(8, created);
	}
}
