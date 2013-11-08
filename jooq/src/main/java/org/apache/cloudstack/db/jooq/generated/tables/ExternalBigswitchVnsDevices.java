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
public class ExternalBigswitchVnsDevices extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.ExternalBigswitchVnsDevicesRecord> {

	private static final long serialVersionUID = 158443920;

	/**
	 * The singleton instance of <code>cloud.external_bigswitch_vns_devices</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.ExternalBigswitchVnsDevices EXTERNAL_BIGSWITCH_VNS_DEVICES = new org.apache.cloudstack.db.jooq.generated.tables.ExternalBigswitchVnsDevices();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.ExternalBigswitchVnsDevicesRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.ExternalBigswitchVnsDevicesRecord.class;
	}

	/**
	 * The column <code>cloud.external_bigswitch_vns_devices.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ExternalBigswitchVnsDevicesRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.external_bigswitch_vns_devices.uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ExternalBigswitchVnsDevicesRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.external_bigswitch_vns_devices.physical_network_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ExternalBigswitchVnsDevicesRecord, java.lang.Long> PHYSICAL_NETWORK_ID = createField("physical_network_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.external_bigswitch_vns_devices.provider_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ExternalBigswitchVnsDevicesRecord, java.lang.String> PROVIDER_NAME = createField("provider_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.external_bigswitch_vns_devices.device_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ExternalBigswitchVnsDevicesRecord, java.lang.String> DEVICE_NAME = createField("device_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.external_bigswitch_vns_devices.host_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ExternalBigswitchVnsDevicesRecord, java.lang.Long> HOST_ID = createField("host_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * Create a <code>cloud.external_bigswitch_vns_devices</code> table reference
	 */
	public ExternalBigswitchVnsDevices() {
		super("external_bigswitch_vns_devices", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.external_bigswitch_vns_devices</code> table reference
	 */
	public ExternalBigswitchVnsDevices(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.ExternalBigswitchVnsDevices.EXTERNAL_BIGSWITCH_VNS_DEVICES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.ExternalBigswitchVnsDevicesRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_EXTERNAL_BIGSWITCH_VNS_DEVICES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.ExternalBigswitchVnsDevicesRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_EXTERNAL_BIGSWITCH_VNS_DEVICES_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.ExternalBigswitchVnsDevicesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.ExternalBigswitchVnsDevicesRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_EXTERNAL_BIGSWITCH_VNS_DEVICES_PRIMARY, org.apache.cloudstack.db.jooq.generated.Keys.KEY_EXTERNAL_BIGSWITCH_VNS_DEVICES_UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.ExternalBigswitchVnsDevicesRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.ExternalBigswitchVnsDevicesRecord, ?>>asList(org.apache.cloudstack.db.jooq.generated.Keys.FK_EXTERNAL_BIGSWITCH_VNS_DEVICES__PHYSICAL_NETWORK_ID, org.apache.cloudstack.db.jooq.generated.Keys.FK_EXTERNAL_BIGSWITCH_VNS_DEVICES__HOST_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.ExternalBigswitchVnsDevices as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.ExternalBigswitchVnsDevices(alias);
	}
}
