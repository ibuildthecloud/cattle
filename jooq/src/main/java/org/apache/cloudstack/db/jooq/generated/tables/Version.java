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
public class Version extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.VersionRecord> {

	private static final long serialVersionUID = -179081956;

	/**
	 * The singleton instance of <code>cloud.version</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.Version VERSION = new org.apache.cloudstack.db.jooq.generated.tables.Version();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.VersionRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.VersionRecord.class;
	}

	/**
	 * The column <code>cloud.version.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VersionRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.version.version</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VersionRecord, java.lang.String> VERSION_ = createField("version", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this);

	/**
	 * The column <code>cloud.version.updated</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VersionRecord, java.sql.Timestamp> UPDATED = createField("updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this);

	/**
	 * The column <code>cloud.version.step</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VersionRecord, java.lang.String> STEP = createField("step", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this);

	/**
	 * Create a <code>cloud.version</code> table reference
	 */
	public Version() {
		super("version", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.version</code> table reference
	 */
	public Version(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.Version.VERSION);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.VersionRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VersionRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_VERSION_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VersionRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VersionRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_VERSION_PRIMARY, org.apache.cloudstack.db.jooq.generated.Keys.KEY_VERSION_VERSION);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.Version as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.Version(alias);
	}
}
