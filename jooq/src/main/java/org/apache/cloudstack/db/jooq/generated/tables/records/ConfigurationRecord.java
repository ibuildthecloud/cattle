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
@javax.persistence.Table(name = "configuration", schema = "cloud")
public class ConfigurationRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.ConfigurationRecord> implements org.jooq.Record10<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String, java.lang.Boolean> {

	private static final long serialVersionUID = 1790243592;

	/**
	 * Setter for <code>cloud.configuration.category</code>. 
	 */
	public void setCategory(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.configuration.category</code>. 
	 */
	@javax.persistence.Column(name = "category", nullable = false, length = 255)
	public java.lang.String getCategory() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>cloud.configuration.instance</code>. 
	 */
	public void setInstance(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.configuration.instance</code>. 
	 */
	@javax.persistence.Column(name = "instance", nullable = false, length = 255)
	public java.lang.String getInstance() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cloud.configuration.component</code>. 
	 */
	public void setComponent(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.configuration.component</code>. 
	 */
	@javax.persistence.Column(name = "component", nullable = false, length = 255)
	public java.lang.String getComponent() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>cloud.configuration.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.configuration.name</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "name", unique = true, nullable = false, length = 255)
	public java.lang.String getName() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>cloud.configuration.value</code>. 
	 */
	public void setValue(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cloud.configuration.value</code>. 
	 */
	@javax.persistence.Column(name = "value", length = 4095)
	public java.lang.String getValue() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>cloud.configuration.description</code>. 
	 */
	public void setDescription(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cloud.configuration.description</code>. 
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>cloud.configuration.default_value</code>. 
	 */
	public void setDefaultValue(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cloud.configuration.default_value</code>. 
	 */
	@javax.persistence.Column(name = "default_value", length = 4095)
	public java.lang.String getDefaultValue() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>cloud.configuration.updated</code>. 
	 */
	public void setUpdated(java.sql.Timestamp value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cloud.configuration.updated</code>. 
	 */
	@javax.persistence.Column(name = "updated")
	public java.sql.Timestamp getUpdated() {
		return (java.sql.Timestamp) getValue(7);
	}

	/**
	 * Setter for <code>cloud.configuration.scope</code>. 
	 */
	public void setScope(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>cloud.configuration.scope</code>. 
	 */
	@javax.persistence.Column(name = "scope", length = 255)
	public java.lang.String getScope() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>cloud.configuration.is_dynamic</code>. 
	 */
	public void setIsDynamic(java.lang.Boolean value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>cloud.configuration.is_dynamic</code>. 
	 */
	@javax.persistence.Column(name = "is_dynamic", nullable = false, precision = 1)
	public java.lang.Boolean getIsDynamic() {
		return (java.lang.Boolean) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String, java.lang.Boolean> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.lang.String, java.lang.Boolean> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.Configuration.CONFIGURATION.CATEGORY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.Configuration.CONFIGURATION.INSTANCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.Configuration.CONFIGURATION.COMPONENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.apache.cloudstack.db.jooq.generated.tables.Configuration.CONFIGURATION.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.apache.cloudstack.db.jooq.generated.tables.Configuration.CONFIGURATION.VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.apache.cloudstack.db.jooq.generated.tables.Configuration.CONFIGURATION.DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.apache.cloudstack.db.jooq.generated.tables.Configuration.CONFIGURATION.DEFAULT_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field8() {
		return org.apache.cloudstack.db.jooq.generated.tables.Configuration.CONFIGURATION.UPDATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return org.apache.cloudstack.db.jooq.generated.tables.Configuration.CONFIGURATION.SCOPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field10() {
		return org.apache.cloudstack.db.jooq.generated.tables.Configuration.CONFIGURATION.IS_DYNAMIC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getCategory();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getInstance();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getComponent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getDefaultValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value8() {
		return getUpdated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getScope();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value10() {
		return getIsDynamic();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ConfigurationRecord
	 */
	public ConfigurationRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.Configuration.CONFIGURATION);
	}

	/**
	 * Create a detached, initialised ConfigurationRecord
	 */
	public ConfigurationRecord(java.lang.String category, java.lang.String instance, java.lang.String component, java.lang.String name, java.lang.String value, java.lang.String description, java.lang.String defaultValue, java.sql.Timestamp updated, java.lang.String scope, java.lang.Boolean isDynamic) {
		super(org.apache.cloudstack.db.jooq.generated.tables.Configuration.CONFIGURATION);

		setValue(0, category);
		setValue(1, instance);
		setValue(2, component);
		setValue(3, name);
		setValue(4, value);
		setValue(5, description);
		setValue(6, defaultValue);
		setValue(7, updated);
		setValue(8, scope);
		setValue(9, isDynamic);
	}
}
