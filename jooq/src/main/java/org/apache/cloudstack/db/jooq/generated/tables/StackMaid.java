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
public class StackMaid extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.StackMaidRecord> {

	private static final long serialVersionUID = 632445774;

	/**
	 * The singleton instance of <code>cloud.stack_maid</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.StackMaid STACK_MAID = new org.apache.cloudstack.db.jooq.generated.tables.StackMaid();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.StackMaidRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.StackMaidRecord.class;
	}

	/**
	 * The column <code>cloud.stack_maid.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StackMaidRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.stack_maid.msid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StackMaidRecord, java.lang.Long> MSID = createField("msid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.stack_maid.thread_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StackMaidRecord, java.lang.Long> THREAD_ID = createField("thread_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.stack_maid.seq</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StackMaidRecord, java.lang.Integer> SEQ = createField("seq", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>cloud.stack_maid.cleanup_delegate</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StackMaidRecord, java.lang.String> CLEANUP_DELEGATE = createField("cleanup_delegate", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>cloud.stack_maid.cleanup_context</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StackMaidRecord, java.lang.String> CLEANUP_CONTEXT = createField("cleanup_context", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The column <code>cloud.stack_maid.created</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.StackMaidRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>cloud.stack_maid</code> table reference
	 */
	public StackMaid() {
		super("stack_maid", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.stack_maid</code> table reference
	 */
	public StackMaid(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.StackMaid.STACK_MAID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.StackMaidRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_STACK_MAID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.StackMaidRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_STACK_MAID_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.StackMaidRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.StackMaidRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_STACK_MAID_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.StackMaid as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.StackMaid(alias);
	}
}
