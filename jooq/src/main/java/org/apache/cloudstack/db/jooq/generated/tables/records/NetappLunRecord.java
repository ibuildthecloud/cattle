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
@javax.persistence.Table(name = "netapp_lun", schema = "cloud")
public class NetappLunRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.NetappLunRecord> implements org.jooq.Record6<java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long> {

	private static final long serialVersionUID = -358175001;

	/**
	 * Setter for <code>cloud.netapp_lun.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.netapp_lun.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.netapp_lun.lun_name</code>. 
	 */
	public void setLunName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.netapp_lun.lun_name</code>. 
	 */
	@javax.persistence.Column(name = "lun_name", nullable = false, length = 255)
	public java.lang.String getLunName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cloud.netapp_lun.target_iqn</code>. 
	 */
	public void setTargetIqn(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.netapp_lun.target_iqn</code>. 
	 */
	@javax.persistence.Column(name = "target_iqn", nullable = false, length = 255)
	public java.lang.String getTargetIqn() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>cloud.netapp_lun.path</code>. 
	 */
	public void setPath(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.netapp_lun.path</code>. 
	 */
	@javax.persistence.Column(name = "path", nullable = false, length = 255)
	public java.lang.String getPath() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>cloud.netapp_lun.size</code>. 
	 */
	public void setSize(java.lang.Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cloud.netapp_lun.size</code>. 
	 */
	@javax.persistence.Column(name = "size", nullable = false, precision = 19)
	public java.lang.Long getSize() {
		return (java.lang.Long) getValue(4);
	}

	/**
	 * Setter for <code>cloud.netapp_lun.volume_id</code>. 
	 */
	public void setVolumeId(java.lang.Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cloud.netapp_lun.volume_id</code>. 
	 */
	@javax.persistence.Column(name = "volume_id", nullable = false, precision = 20)
	public java.lang.Long getVolumeId() {
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
		return org.apache.cloudstack.db.jooq.generated.tables.NetappLun.NETAPP_LUN.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetappLun.NETAPP_LUN.LUN_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetappLun.NETAPP_LUN.TARGET_IQN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetappLun.NETAPP_LUN.PATH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field5() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetappLun.NETAPP_LUN.SIZE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetappLun.NETAPP_LUN.VOLUME_ID;
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
		return getLunName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getTargetIqn();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getPath();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value5() {
		return getSize();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value6() {
		return getVolumeId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached NetappLunRecord
	 */
	public NetappLunRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.NetappLun.NETAPP_LUN);
	}

	/**
	 * Create a detached, initialised NetappLunRecord
	 */
	public NetappLunRecord(java.lang.Long id, java.lang.String lunName, java.lang.String targetIqn, java.lang.String path, java.lang.Long size, java.lang.Long volumeId) {
		super(org.apache.cloudstack.db.jooq.generated.tables.NetappLun.NETAPP_LUN);

		setValue(0, id);
		setValue(1, lunName);
		setValue(2, targetIqn);
		setValue(3, path);
		setValue(4, size);
		setValue(5, volumeId);
	}
}
