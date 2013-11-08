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
public class StoragePoolWork extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolWorkRecord> {

	private static final long serialVersionUID = 683526893;

	/**
	 * The singleton instance of <code>cloud.storage_pool_work</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.StoragePoolWork STORAGE_POOL_WORK = new org.apache.cloudstack.db.jooq.generated.tables.StoragePoolWork();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolWorkRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolWorkRecord.class;
	}

	/**
	 * The column <code>cloud.storage_pool_work.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolWorkRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.storage_pool_work.pool_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolWorkRecord, java.lang.Long> POOL_ID = createField("pool_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.storage_pool_work.vm_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolWorkRecord, java.lang.Long> VM_ID = createField("vm_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.storage_pool_work.stopped_for_maintenance</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolWorkRecord, java.lang.Byte> STOPPED_FOR_MAINTENANCE = createField("stopped_for_maintenance", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.storage_pool_work.started_after_maintenance</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolWorkRecord, java.lang.Byte> STARTED_AFTER_MAINTENANCE = createField("started_after_maintenance", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.storage_pool_work.mgmt_server_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolWorkRecord, java.lang.Long> MGMT_SERVER_ID = createField("mgmt_server_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * Create a <code>cloud.storage_pool_work</code> table reference
	 */
	public StoragePoolWork() {
		super("storage_pool_work", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.storage_pool_work</code> table reference
	 */
	public StoragePoolWork(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.StoragePoolWork.STORAGE_POOL_WORK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolWorkRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_STORAGE_POOL_WORK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolWorkRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_STORAGE_POOL_WORK_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolWorkRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.StoragePoolWorkRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_STORAGE_POOL_WORK_PRIMARY, org.apache.cloudstack.db.jooq.generated.Keys.KEY_STORAGE_POOL_WORK_POOL_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.StoragePoolWork as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.StoragePoolWork(alias);
	}
}
