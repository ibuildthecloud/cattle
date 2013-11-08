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
public class AlertDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.AlertRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.Alert, java.lang.Long> {

	/**
	 * Create a new AlertDao without any configuration
	 */
	public AlertDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.Alert.ALERT, org.apache.cloudstack.db.jooq.generated.tables.pojos.Alert.class);
	}

	/**
	 * Create a new AlertDao with an attached configuration
	 */
	public AlertDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.Alert.ALERT, org.apache.cloudstack.db.jooq.generated.tables.pojos.Alert.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.Alert object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Alert> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Alert.ALERT.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.Alert fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.Alert.ALERT.ID, value);
	}

	/**
	 * Fetch records that have <code>uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Alert> fetchByUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Alert.ALERT.UUID, values);
	}

	/**
	 * Fetch a unique record that has <code>uuid = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.Alert fetchOneByUuid(java.lang.String value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.Alert.ALERT.UUID, value);
	}

	/**
	 * Fetch records that have <code>type IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Alert> fetchByType(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Alert.ALERT.TYPE, values);
	}

	/**
	 * Fetch records that have <code>cluster_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Alert> fetchByClusterId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Alert.ALERT.CLUSTER_ID, values);
	}

	/**
	 * Fetch records that have <code>pod_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Alert> fetchByPodId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Alert.ALERT.POD_ID, values);
	}

	/**
	 * Fetch records that have <code>data_center_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Alert> fetchByDataCenterId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Alert.ALERT.DATA_CENTER_ID, values);
	}

	/**
	 * Fetch records that have <code>subject IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Alert> fetchBySubject(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Alert.ALERT.SUBJECT, values);
	}

	/**
	 * Fetch records that have <code>sent_count IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Alert> fetchBySentCount(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Alert.ALERT.SENT_COUNT, values);
	}

	/**
	 * Fetch records that have <code>created IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Alert> fetchByCreated(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Alert.ALERT.CREATED, values);
	}

	/**
	 * Fetch records that have <code>last_sent IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Alert> fetchByLastSent(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Alert.ALERT.LAST_SENT, values);
	}

	/**
	 * Fetch records that have <code>resolved IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Alert> fetchByResolved(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Alert.ALERT.RESOLVED, values);
	}

	/**
	 * Fetch records that have <code>archived IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Alert> fetchByArchived(java.lang.Boolean... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Alert.ALERT.ARCHIVED, values);
	}
}
