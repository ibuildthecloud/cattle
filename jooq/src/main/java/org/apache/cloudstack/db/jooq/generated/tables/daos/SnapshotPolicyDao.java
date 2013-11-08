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
public class SnapshotPolicyDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.SnapshotPolicyRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.SnapshotPolicy, java.lang.Long> {

	/**
	 * Create a new SnapshotPolicyDao without any configuration
	 */
	public SnapshotPolicyDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.SnapshotPolicy.SNAPSHOT_POLICY, org.apache.cloudstack.db.jooq.generated.tables.pojos.SnapshotPolicy.class);
	}

	/**
	 * Create a new SnapshotPolicyDao with an attached configuration
	 */
	public SnapshotPolicyDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.SnapshotPolicy.SNAPSHOT_POLICY, org.apache.cloudstack.db.jooq.generated.tables.pojos.SnapshotPolicy.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.SnapshotPolicy object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SnapshotPolicy> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SnapshotPolicy.SNAPSHOT_POLICY.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.SnapshotPolicy fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.SnapshotPolicy.SNAPSHOT_POLICY.ID, value);
	}

	/**
	 * Fetch records that have <code>uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SnapshotPolicy> fetchByUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SnapshotPolicy.SNAPSHOT_POLICY.UUID, values);
	}

	/**
	 * Fetch a unique record that has <code>uuid = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.SnapshotPolicy fetchOneByUuid(java.lang.String value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.SnapshotPolicy.SNAPSHOT_POLICY.UUID, value);
	}

	/**
	 * Fetch records that have <code>volume_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SnapshotPolicy> fetchByVolumeId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SnapshotPolicy.SNAPSHOT_POLICY.VOLUME_ID, values);
	}

	/**
	 * Fetch records that have <code>schedule IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SnapshotPolicy> fetchBySchedule(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SnapshotPolicy.SNAPSHOT_POLICY.SCHEDULE, values);
	}

	/**
	 * Fetch records that have <code>timezone IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SnapshotPolicy> fetchByTimezone(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SnapshotPolicy.SNAPSHOT_POLICY.TIMEZONE, values);
	}

	/**
	 * Fetch records that have <code>interval IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SnapshotPolicy> fetchByInterval(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SnapshotPolicy.SNAPSHOT_POLICY.INTERVAL, values);
	}

	/**
	 * Fetch records that have <code>max_snaps IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SnapshotPolicy> fetchByMaxSnaps(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SnapshotPolicy.SNAPSHOT_POLICY.MAX_SNAPS, values);
	}

	/**
	 * Fetch records that have <code>active IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SnapshotPolicy> fetchByActive(java.lang.Boolean... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SnapshotPolicy.SNAPSHOT_POLICY.ACTIVE, values);
	}
}
