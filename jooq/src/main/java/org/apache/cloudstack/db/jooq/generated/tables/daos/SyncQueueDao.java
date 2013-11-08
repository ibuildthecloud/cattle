/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SyncQueueDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.SyncQueueRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.SyncQueue, java.lang.Long> {

	/**
	 * Create a new SyncQueueDao without any configuration
	 */
	public SyncQueueDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.SyncQueue.SYNC_QUEUE, org.apache.cloudstack.db.jooq.generated.tables.pojos.SyncQueue.class);
	}

	/**
	 * Create a new SyncQueueDao with an attached configuration
	 */
	public SyncQueueDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.SyncQueue.SYNC_QUEUE, org.apache.cloudstack.db.jooq.generated.tables.pojos.SyncQueue.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.SyncQueue object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SyncQueue> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SyncQueue.SYNC_QUEUE.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.SyncQueue fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.SyncQueue.SYNC_QUEUE.ID, value);
	}

	/**
	 * Fetch records that have <code>sync_objtype IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SyncQueue> fetchBySyncObjtype(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SyncQueue.SYNC_QUEUE.SYNC_OBJTYPE, values);
	}

	/**
	 * Fetch records that have <code>sync_objid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SyncQueue> fetchBySyncObjid(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SyncQueue.SYNC_QUEUE.SYNC_OBJID, values);
	}

	/**
	 * Fetch records that have <code>queue_proc_number IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SyncQueue> fetchByQueueProcNumber(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SyncQueue.SYNC_QUEUE.QUEUE_PROC_NUMBER, values);
	}

	/**
	 * Fetch records that have <code>created IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SyncQueue> fetchByCreated(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SyncQueue.SYNC_QUEUE.CREATED, values);
	}

	/**
	 * Fetch records that have <code>last_updated IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SyncQueue> fetchByLastUpdated(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SyncQueue.SYNC_QUEUE.LAST_UPDATED, values);
	}

	/**
	 * Fetch records that have <code>queue_size IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SyncQueue> fetchByQueueSize(java.lang.Short... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SyncQueue.SYNC_QUEUE.QUEUE_SIZE, values);
	}

	/**
	 * Fetch records that have <code>queue_size_limit IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SyncQueue> fetchByQueueSizeLimit(java.lang.Short... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SyncQueue.SYNC_QUEUE.QUEUE_SIZE_LIMIT, values);
	}
}
