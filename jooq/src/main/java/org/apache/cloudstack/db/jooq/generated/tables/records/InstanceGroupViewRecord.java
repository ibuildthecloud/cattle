/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "instance_group_view", schema = "cloud")
public class InstanceGroupViewRecord extends org.jooq.impl.TableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.InstanceGroupViewRecord> implements org.jooq.Record16<java.lang.Long, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1981455185;

	/**
	 * Setter for <code>cloud.instance_group_view.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.instance_group_view.id</code>. 
	 */
	@javax.persistence.Column(name = "id", nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.instance_group_view.uuid</code>. 
	 */
	public void setUuid(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.instance_group_view.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", length = 40)
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cloud.instance_group_view.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.instance_group_view.name</code>. 
	 */
	@javax.persistence.Column(name = "name", nullable = false, length = 255)
	public java.lang.String getName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>cloud.instance_group_view.removed</code>. 
	 */
	public void setRemoved(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.instance_group_view.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	public java.sql.Timestamp getRemoved() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>cloud.instance_group_view.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cloud.instance_group_view.created</code>. 
	 */
	@javax.persistence.Column(name = "created")
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(4);
	}

	/**
	 * Setter for <code>cloud.instance_group_view.account_id</code>. 
	 */
	public void setAccountId(java.lang.Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cloud.instance_group_view.account_id</code>. 
	 */
	@javax.persistence.Column(name = "account_id", nullable = false, precision = 20)
	public java.lang.Long getAccountId() {
		return (java.lang.Long) getValue(5);
	}

	/**
	 * Setter for <code>cloud.instance_group_view.account_uuid</code>. 
	 */
	public void setAccountUuid(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cloud.instance_group_view.account_uuid</code>. 
	 */
	@javax.persistence.Column(name = "account_uuid", length = 40)
	public java.lang.String getAccountUuid() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>cloud.instance_group_view.account_name</code>. 
	 */
	public void setAccountName(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cloud.instance_group_view.account_name</code>. 
	 */
	@javax.persistence.Column(name = "account_name", length = 100)
	public java.lang.String getAccountName() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>cloud.instance_group_view.account_type</code>. 
	 */
	public void setAccountType(java.lang.Integer value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>cloud.instance_group_view.account_type</code>. 
	 */
	@javax.persistence.Column(name = "account_type", nullable = false, precision = 10)
	public java.lang.Integer getAccountType() {
		return (java.lang.Integer) getValue(8);
	}

	/**
	 * Setter for <code>cloud.instance_group_view.domain_id</code>. 
	 */
	public void setDomainId(java.lang.Long value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>cloud.instance_group_view.domain_id</code>. 
	 */
	@javax.persistence.Column(name = "domain_id", nullable = false, precision = 20)
	public java.lang.Long getDomainId() {
		return (java.lang.Long) getValue(9);
	}

	/**
	 * Setter for <code>cloud.instance_group_view.domain_uuid</code>. 
	 */
	public void setDomainUuid(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>cloud.instance_group_view.domain_uuid</code>. 
	 */
	@javax.persistence.Column(name = "domain_uuid", length = 40)
	public java.lang.String getDomainUuid() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>cloud.instance_group_view.domain_name</code>. 
	 */
	public void setDomainName(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>cloud.instance_group_view.domain_name</code>. 
	 */
	@javax.persistence.Column(name = "domain_name", length = 255)
	public java.lang.String getDomainName() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>cloud.instance_group_view.domain_path</code>. 
	 */
	public void setDomainPath(java.lang.String value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>cloud.instance_group_view.domain_path</code>. 
	 */
	@javax.persistence.Column(name = "domain_path", nullable = false, length = 255)
	public java.lang.String getDomainPath() {
		return (java.lang.String) getValue(12);
	}

	/**
	 * Setter for <code>cloud.instance_group_view.project_id</code>. 
	 */
	public void setProjectId(java.lang.Long value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>cloud.instance_group_view.project_id</code>. 
	 */
	@javax.persistence.Column(name = "project_id", precision = 20)
	public java.lang.Long getProjectId() {
		return (java.lang.Long) getValue(13);
	}

	/**
	 * Setter for <code>cloud.instance_group_view.project_uuid</code>. 
	 */
	public void setProjectUuid(java.lang.String value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>cloud.instance_group_view.project_uuid</code>. 
	 */
	@javax.persistence.Column(name = "project_uuid", length = 40)
	public java.lang.String getProjectUuid() {
		return (java.lang.String) getValue(14);
	}

	/**
	 * Setter for <code>cloud.instance_group_view.project_name</code>. 
	 */
	public void setProjectName(java.lang.String value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>cloud.instance_group_view.project_name</code>. 
	 */
	@javax.persistence.Column(name = "project_name", length = 255)
	public java.lang.String getProjectName() {
		return (java.lang.String) getValue(15);
	}

	// -------------------------------------------------------------------------
	// Record16 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row16<java.lang.Long, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row16) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row16<java.lang.Long, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row16) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.InstanceGroupView.INSTANCE_GROUP_VIEW.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.InstanceGroupView.INSTANCE_GROUP_VIEW.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.InstanceGroupView.INSTANCE_GROUP_VIEW.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return org.apache.cloudstack.db.jooq.generated.tables.InstanceGroupView.INSTANCE_GROUP_VIEW.REMOVED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return org.apache.cloudstack.db.jooq.generated.tables.InstanceGroupView.INSTANCE_GROUP_VIEW.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return org.apache.cloudstack.db.jooq.generated.tables.InstanceGroupView.INSTANCE_GROUP_VIEW.ACCOUNT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.apache.cloudstack.db.jooq.generated.tables.InstanceGroupView.INSTANCE_GROUP_VIEW.ACCOUNT_UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.apache.cloudstack.db.jooq.generated.tables.InstanceGroupView.INSTANCE_GROUP_VIEW.ACCOUNT_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field9() {
		return org.apache.cloudstack.db.jooq.generated.tables.InstanceGroupView.INSTANCE_GROUP_VIEW.ACCOUNT_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field10() {
		return org.apache.cloudstack.db.jooq.generated.tables.InstanceGroupView.INSTANCE_GROUP_VIEW.DOMAIN_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return org.apache.cloudstack.db.jooq.generated.tables.InstanceGroupView.INSTANCE_GROUP_VIEW.DOMAIN_UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return org.apache.cloudstack.db.jooq.generated.tables.InstanceGroupView.INSTANCE_GROUP_VIEW.DOMAIN_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field13() {
		return org.apache.cloudstack.db.jooq.generated.tables.InstanceGroupView.INSTANCE_GROUP_VIEW.DOMAIN_PATH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field14() {
		return org.apache.cloudstack.db.jooq.generated.tables.InstanceGroupView.INSTANCE_GROUP_VIEW.PROJECT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field15() {
		return org.apache.cloudstack.db.jooq.generated.tables.InstanceGroupView.INSTANCE_GROUP_VIEW.PROJECT_UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field16() {
		return org.apache.cloudstack.db.jooq.generated.tables.InstanceGroupView.INSTANCE_GROUP_VIEW.PROJECT_NAME;
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
	public java.lang.String value3() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getRemoved();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value6() {
		return getAccountId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getAccountUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getAccountName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value9() {
		return getAccountType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value10() {
		return getDomainId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getDomainUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getDomainName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value13() {
		return getDomainPath();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value14() {
		return getProjectId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value15() {
		return getProjectUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value16() {
		return getProjectName();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InstanceGroupViewRecord
	 */
	public InstanceGroupViewRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.InstanceGroupView.INSTANCE_GROUP_VIEW);
	}

	/**
	 * Create a detached, initialised InstanceGroupViewRecord
	 */
	public InstanceGroupViewRecord(java.lang.Long id, java.lang.String uuid, java.lang.String name, java.sql.Timestamp removed, java.sql.Timestamp created, java.lang.Long accountId, java.lang.String accountUuid, java.lang.String accountName, java.lang.Integer accountType, java.lang.Long domainId, java.lang.String domainUuid, java.lang.String domainName, java.lang.String domainPath, java.lang.Long projectId, java.lang.String projectUuid, java.lang.String projectName) {
		super(org.apache.cloudstack.db.jooq.generated.tables.InstanceGroupView.INSTANCE_GROUP_VIEW);

		setValue(0, id);
		setValue(1, uuid);
		setValue(2, name);
		setValue(3, removed);
		setValue(4, created);
		setValue(5, accountId);
		setValue(6, accountUuid);
		setValue(7, accountName);
		setValue(8, accountType);
		setValue(9, domainId);
		setValue(10, domainUuid);
		setValue(11, domainName);
		setValue(12, domainPath);
		setValue(13, projectId);
		setValue(14, projectUuid);
		setValue(15, projectName);
	}
}
