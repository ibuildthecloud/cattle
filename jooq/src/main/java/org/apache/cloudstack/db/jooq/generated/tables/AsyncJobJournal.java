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
public class AsyncJobJournal extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobJournalRecord> {

	private static final long serialVersionUID = -1383034579;

	/**
	 * The singleton instance of <code>cloud.async_job_journal</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.AsyncJobJournal ASYNC_JOB_JOURNAL = new org.apache.cloudstack.db.jooq.generated.tables.AsyncJobJournal();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobJournalRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobJournalRecord.class;
	}

	/**
	 * The column <code>cloud.async_job_journal.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobJournalRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.async_job_journal.job_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobJournalRecord, java.lang.Long> JOB_ID = createField("job_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.async_job_journal.journal_type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobJournalRecord, java.lang.String> JOURNAL_TYPE = createField("journal_type", org.jooq.impl.SQLDataType.VARCHAR.length(32), this);

	/**
	 * The column <code>cloud.async_job_journal.journal_text</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobJournalRecord, java.lang.String> JOURNAL_TEXT = createField("journal_text", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this);

	/**
	 * The column <code>cloud.async_job_journal.journal_obj</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobJournalRecord, java.lang.String> JOURNAL_OBJ = createField("journal_obj", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this);

	/**
	 * The column <code>cloud.async_job_journal.created</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobJournalRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this);

	/**
	 * Create a <code>cloud.async_job_journal</code> table reference
	 */
	public AsyncJobJournal() {
		super("async_job_journal", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.async_job_journal</code> table reference
	 */
	public AsyncJobJournal(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.AsyncJobJournal.ASYNC_JOB_JOURNAL);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobJournalRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_ASYNC_JOB_JOURNAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobJournalRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_ASYNC_JOB_JOURNAL_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobJournalRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobJournalRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_ASYNC_JOB_JOURNAL_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobJournalRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.AsyncJobJournalRecord, ?>>asList(org.apache.cloudstack.db.jooq.generated.Keys.FK_ASYNC_JOB_JOURNAL__JOB_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.AsyncJobJournal as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.AsyncJobJournal(alias);
	}
}
