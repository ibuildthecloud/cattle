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
@javax.persistence.Table(name = "security_group", schema = "cloud", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"name", "account_id"})
})
public class SecurityGroupRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.SecurityGroupRecord> implements org.jooq.Record6<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long> {

	private static final long serialVersionUID = -1187006559;

	/**
	 * Setter for <code>cloud.security_group.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.security_group.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.security_group.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.security_group.name</code>. 
	 */
	@javax.persistence.Column(name = "name", nullable = false, length = 255)
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cloud.security_group.uuid</code>. 
	 */
	public void setUuid(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.security_group.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", unique = true, length = 40)
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>cloud.security_group.description</code>. 
	 */
	public void setDescription(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.security_group.description</code>. 
	 */
	@javax.persistence.Column(name = "description", length = 4096)
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>cloud.security_group.domain_id</code>. 
	 */
	public void setDomainId(java.lang.Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cloud.security_group.domain_id</code>. 
	 */
	@javax.persistence.Column(name = "domain_id", nullable = false, precision = 20)
	public java.lang.Long getDomainId() {
		return (java.lang.Long) getValue(4);
	}

	/**
	 * Setter for <code>cloud.security_group.account_id</code>. 
	 */
	public void setAccountId(java.lang.Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cloud.security_group.account_id</code>. 
	 */
	@javax.persistence.Column(name = "account_id", nullable = false, precision = 20)
	public java.lang.Long getAccountId() {
		return (java.lang.Long) getValue(5);
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
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.SecurityGroup.SECURITY_GROUP.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.SecurityGroup.SECURITY_GROUP.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.SecurityGroup.SECURITY_GROUP.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.apache.cloudstack.db.jooq.generated.tables.SecurityGroup.SECURITY_GROUP.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field5() {
		return org.apache.cloudstack.db.jooq.generated.tables.SecurityGroup.SECURITY_GROUP.DOMAIN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return org.apache.cloudstack.db.jooq.generated.tables.SecurityGroup.SECURITY_GROUP.ACCOUNT_ID;
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
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value5() {
		return getDomainId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value6() {
		return getAccountId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SecurityGroupRecord
	 */
	public SecurityGroupRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.SecurityGroup.SECURITY_GROUP);
	}

	/**
	 * Create a detached, initialised SecurityGroupRecord
	 */
	public SecurityGroupRecord(java.lang.Long id, java.lang.String name, java.lang.String uuid, java.lang.String description, java.lang.Long domainId, java.lang.Long accountId) {
		super(org.apache.cloudstack.db.jooq.generated.tables.SecurityGroup.SECURITY_GROUP);

		setValue(0, id);
		setValue(1, name);
		setValue(2, uuid);
		setValue(3, description);
		setValue(4, domainId);
		setValue(5, accountId);
	}
}
