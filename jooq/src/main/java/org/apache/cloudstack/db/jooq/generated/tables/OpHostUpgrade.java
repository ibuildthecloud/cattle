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
public class OpHostUpgrade extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.OpHostUpgradeRecord> {

	private static final long serialVersionUID = -2089908981;

	/**
	 * The singleton instance of <code>cloud.op_host_upgrade</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.OpHostUpgrade OP_HOST_UPGRADE = new org.apache.cloudstack.db.jooq.generated.tables.OpHostUpgrade();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.OpHostUpgradeRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.OpHostUpgradeRecord.class;
	}

	/**
	 * The column <code>cloud.op_host_upgrade.host_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.OpHostUpgradeRecord, java.lang.Long> HOST_ID = createField("host_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.op_host_upgrade.version</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.OpHostUpgradeRecord, java.lang.String> VERSION = createField("version", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this);

	/**
	 * The column <code>cloud.op_host_upgrade.state</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.OpHostUpgradeRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this);

	/**
	 * Create a <code>cloud.op_host_upgrade</code> table reference
	 */
	public OpHostUpgrade() {
		super("op_host_upgrade", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.op_host_upgrade</code> table reference
	 */
	public OpHostUpgrade(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.OpHostUpgrade.OP_HOST_UPGRADE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.OpHostUpgradeRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_OP_HOST_UPGRADE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.OpHostUpgradeRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.OpHostUpgradeRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_OP_HOST_UPGRADE_PRIMARY, org.apache.cloudstack.db.jooq.generated.Keys.KEY_OP_HOST_UPGRADE_HOST_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.OpHostUpgrade as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.OpHostUpgrade(alias);
	}
}
