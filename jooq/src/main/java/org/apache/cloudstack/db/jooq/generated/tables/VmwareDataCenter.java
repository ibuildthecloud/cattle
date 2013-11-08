/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VmwareDataCenter extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.VmwareDataCenterRecord> {

	private static final long serialVersionUID = -683508375;

	/**
	 * The singleton instance of <code>cloud.vmware_data_center</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.VmwareDataCenter VMWARE_DATA_CENTER = new org.apache.cloudstack.db.jooq.generated.tables.VmwareDataCenter();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.VmwareDataCenterRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.VmwareDataCenterRecord.class;
	}

	/**
	 * The column <code>cloud.vmware_data_center.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmwareDataCenterRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.vmware_data_center.uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmwareDataCenterRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.vmware_data_center.name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmwareDataCenterRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.vmware_data_center.guid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmwareDataCenterRecord, java.lang.String> GUID = createField("guid", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.vmware_data_center.vcenter_host</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmwareDataCenterRecord, java.lang.String> VCENTER_HOST = createField("vcenter_host", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.vmware_data_center.username</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmwareDataCenterRecord, java.lang.String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.vmware_data_center.password</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VmwareDataCenterRecord, java.lang.String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * Create a <code>cloud.vmware_data_center</code> table reference
	 */
	public VmwareDataCenter() {
		super("vmware_data_center", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.vmware_data_center</code> table reference
	 */
	public VmwareDataCenter(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.VmwareDataCenter.VMWARE_DATA_CENTER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.VmwareDataCenterRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_VMWARE_DATA_CENTER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VmwareDataCenterRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_VMWARE_DATA_CENTER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VmwareDataCenterRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VmwareDataCenterRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_VMWARE_DATA_CENTER_PRIMARY, org.apache.cloudstack.db.jooq.generated.Keys.KEY_VMWARE_DATA_CENTER_UUID, org.apache.cloudstack.db.jooq.generated.Keys.KEY_VMWARE_DATA_CENTER_GUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.VmwareDataCenter as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.VmwareDataCenter(alias);
	}
}
