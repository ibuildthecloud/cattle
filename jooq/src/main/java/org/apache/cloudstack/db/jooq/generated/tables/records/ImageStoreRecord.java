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
@javax.persistence.Table(name = "image_store", schema = "cloud")
public class ImageStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.ImageStoreRecord> implements org.jooq.Record14<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Long, java.lang.Long> {

	private static final long serialVersionUID = 1241610660;

	/**
	 * Setter for <code>cloud.image_store.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.image_store.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.image_store.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.image_store.name</code>. 
	 */
	@javax.persistence.Column(name = "name", nullable = false, length = 255)
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cloud.image_store.image_provider_name</code>. 
	 */
	public void setImageProviderName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.image_store.image_provider_name</code>. 
	 */
	@javax.persistence.Column(name = "image_provider_name", nullable = false, length = 255)
	public java.lang.String getImageProviderName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>cloud.image_store.protocol</code>. 
	 */
	public void setProtocol(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.image_store.protocol</code>. 
	 */
	@javax.persistence.Column(name = "protocol", nullable = false, length = 255)
	public java.lang.String getProtocol() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>cloud.image_store.url</code>. 
	 */
	public void setUrl(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cloud.image_store.url</code>. 
	 */
	@javax.persistence.Column(name = "url", length = 255)
	public java.lang.String getUrl() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>cloud.image_store.data_center_id</code>. 
	 */
	public void setDataCenterId(java.lang.Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cloud.image_store.data_center_id</code>. 
	 */
	@javax.persistence.Column(name = "data_center_id", precision = 20)
	public java.lang.Long getDataCenterId() {
		return (java.lang.Long) getValue(5);
	}

	/**
	 * Setter for <code>cloud.image_store.scope</code>. 
	 */
	public void setScope(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cloud.image_store.scope</code>. 
	 */
	@javax.persistence.Column(name = "scope", length = 255)
	public java.lang.String getScope() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>cloud.image_store.role</code>. 
	 */
	public void setRole(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cloud.image_store.role</code>. 
	 */
	@javax.persistence.Column(name = "role", length = 255)
	public java.lang.String getRole() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>cloud.image_store.uuid</code>. 
	 */
	public void setUuid(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>cloud.image_store.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", length = 255)
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>cloud.image_store.parent</code>. 
	 */
	public void setParent(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>cloud.image_store.parent</code>. 
	 */
	@javax.persistence.Column(name = "parent", length = 255)
	public java.lang.String getParent() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>cloud.image_store.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>cloud.image_store.created</code>. 
	 */
	@javax.persistence.Column(name = "created")
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(10);
	}

	/**
	 * Setter for <code>cloud.image_store.removed</code>. 
	 */
	public void setRemoved(java.sql.Timestamp value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>cloud.image_store.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	public java.sql.Timestamp getRemoved() {
		return (java.sql.Timestamp) getValue(11);
	}

	/**
	 * Setter for <code>cloud.image_store.total_size</code>. 
	 */
	public void setTotalSize(java.lang.Long value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>cloud.image_store.total_size</code>. 
	 */
	@javax.persistence.Column(name = "total_size", precision = 20)
	public java.lang.Long getTotalSize() {
		return (java.lang.Long) getValue(12);
	}

	/**
	 * Setter for <code>cloud.image_store.used_bytes</code>. 
	 */
	public void setUsedBytes(java.lang.Long value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>cloud.image_store.used_bytes</code>. 
	 */
	@javax.persistence.Column(name = "used_bytes", precision = 20)
	public java.lang.Long getUsedBytes() {
		return (java.lang.Long) getValue(13);
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
	public org.jooq.Row14<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Long, java.lang.Long> fieldsRow() {
		return (org.jooq.Row14) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row14<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp, java.sql.Timestamp, java.lang.Long, java.lang.Long> valuesRow() {
		return (org.jooq.Row14) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.ImageStore.IMAGE_STORE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.ImageStore.IMAGE_STORE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.ImageStore.IMAGE_STORE.IMAGE_PROVIDER_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.apache.cloudstack.db.jooq.generated.tables.ImageStore.IMAGE_STORE.PROTOCOL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return org.apache.cloudstack.db.jooq.generated.tables.ImageStore.IMAGE_STORE.URL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return org.apache.cloudstack.db.jooq.generated.tables.ImageStore.IMAGE_STORE.DATA_CENTER_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return org.apache.cloudstack.db.jooq.generated.tables.ImageStore.IMAGE_STORE.SCOPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return org.apache.cloudstack.db.jooq.generated.tables.ImageStore.IMAGE_STORE.ROLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return org.apache.cloudstack.db.jooq.generated.tables.ImageStore.IMAGE_STORE.UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return org.apache.cloudstack.db.jooq.generated.tables.ImageStore.IMAGE_STORE.PARENT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field11() {
		return org.apache.cloudstack.db.jooq.generated.tables.ImageStore.IMAGE_STORE.CREATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field12() {
		return org.apache.cloudstack.db.jooq.generated.tables.ImageStore.IMAGE_STORE.REMOVED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field13() {
		return org.apache.cloudstack.db.jooq.generated.tables.ImageStore.IMAGE_STORE.TOTAL_SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field14() {
		return org.apache.cloudstack.db.jooq.generated.tables.ImageStore.IMAGE_STORE.USED_BYTES;
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
		return getImageProviderName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getProtocol();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getUrl();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value6() {
		return getDataCenterId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getScope();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getRole();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getParent();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value11() {
		return getCreated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value12() {
		return getRemoved();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value13() {
		return getTotalSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value14() {
		return getUsedBytes();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ImageStoreRecord
	 */
	public ImageStoreRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.ImageStore.IMAGE_STORE);
	}

	/**
	 * Create a detached, initialised ImageStoreRecord
	 */
	public ImageStoreRecord(java.lang.Long id, java.lang.String name, java.lang.String imageProviderName, java.lang.String protocol, java.lang.String url, java.lang.Long dataCenterId, java.lang.String scope, java.lang.String role, java.lang.String uuid, java.lang.String parent, java.sql.Timestamp created, java.sql.Timestamp removed, java.lang.Long totalSize, java.lang.Long usedBytes) {
		super(org.apache.cloudstack.db.jooq.generated.tables.ImageStore.IMAGE_STORE);

		setValue(0, id);
		setValue(1, name);
		setValue(2, imageProviderName);
		setValue(3, protocol);
		setValue(4, url);
		setValue(5, dataCenterId);
		setValue(6, scope);
		setValue(7, role);
		setValue(8, uuid);
		setValue(9, parent);
		setValue(10, created);
		setValue(11, removed);
		setValue(12, totalSize);
		setValue(13, usedBytes);
	}
}
