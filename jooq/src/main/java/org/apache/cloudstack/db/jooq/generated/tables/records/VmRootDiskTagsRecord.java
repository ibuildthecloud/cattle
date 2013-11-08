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
@javax.persistence.Table(name = "vm_root_disk_tags", schema = "cloud")
public class VmRootDiskTagsRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.VmRootDiskTagsRecord> implements org.jooq.Record3<java.lang.Long, java.lang.Long, java.lang.String> {

	private static final long serialVersionUID = -1715327999;

	/**
	 * Setter for <code>cloud.vm_root_disk_tags.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.vm_root_disk_tags.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.vm_root_disk_tags.vm_id</code>. 
	 */
	public void setVmId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.vm_root_disk_tags.vm_id</code>. 
	 */
	@javax.persistence.Column(name = "vm_id", nullable = false, precision = 20)
	public java.lang.Long getVmId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>cloud.vm_root_disk_tags.root_disk_tag</code>. 
	 */
	public void setRootDiskTag(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.vm_root_disk_tags.root_disk_tag</code>. 
	 */
	@javax.persistence.Column(name = "root_disk_tag", nullable = false, length = 255)
	public java.lang.String getRootDiskTag() {
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
	public org.jooq.Row3<java.lang.Long, java.lang.Long, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.Long, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.VmRootDiskTags.VM_ROOT_DISK_TAGS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.VmRootDiskTags.VM_ROOT_DISK_TAGS.VM_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.VmRootDiskTags.VM_ROOT_DISK_TAGS.ROOT_DISK_TAG;
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
		return getVmId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getRootDiskTag();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VmRootDiskTagsRecord
	 */
	public VmRootDiskTagsRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.VmRootDiskTags.VM_ROOT_DISK_TAGS);
	}

	/**
	 * Create a detached, initialised VmRootDiskTagsRecord
	 */
	public VmRootDiskTagsRecord(java.lang.Long id, java.lang.Long vmId, java.lang.String rootDiskTag) {
		super(org.apache.cloudstack.db.jooq.generated.tables.VmRootDiskTags.VM_ROOT_DISK_TAGS);

		setValue(0, id);
		setValue(1, vmId);
		setValue(2, rootDiskTag);
	}
}
