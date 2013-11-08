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
public class ClusterDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.ClusterRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster, java.lang.Long> {

	/**
	 * Create a new ClusterDao without any configuration
	 */
	public ClusterDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.Cluster.CLUSTER, org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster.class);
	}

	/**
	 * Create a new ClusterDao with an attached configuration
	 */
	public ClusterDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.Cluster.CLUSTER, org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Cluster.CLUSTER.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.Cluster.CLUSTER.ID, value);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster> fetchByName(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Cluster.CLUSTER.NAME, values);
	}

	/**
	 * Fetch records that have <code>uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster> fetchByUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Cluster.CLUSTER.UUID, values);
	}

	/**
	 * Fetch a unique record that has <code>uuid = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster fetchOneByUuid(java.lang.String value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.Cluster.CLUSTER.UUID, value);
	}

	/**
	 * Fetch records that have <code>guid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster> fetchByGuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Cluster.CLUSTER.GUID, values);
	}

	/**
	 * Fetch a unique record that has <code>guid = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster fetchOneByGuid(java.lang.String value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.Cluster.CLUSTER.GUID, value);
	}

	/**
	 * Fetch records that have <code>pod_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster> fetchByPodId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Cluster.CLUSTER.POD_ID, values);
	}

	/**
	 * Fetch records that have <code>data_center_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster> fetchByDataCenterId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Cluster.CLUSTER.DATA_CENTER_ID, values);
	}

	/**
	 * Fetch records that have <code>hypervisor_type IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster> fetchByHypervisorType(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Cluster.CLUSTER.HYPERVISOR_TYPE, values);
	}

	/**
	 * Fetch records that have <code>cluster_type IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster> fetchByClusterType(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Cluster.CLUSTER.CLUSTER_TYPE, values);
	}

	/**
	 * Fetch records that have <code>allocation_state IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster> fetchByAllocationState(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Cluster.CLUSTER.ALLOCATION_STATE, values);
	}

	/**
	 * Fetch records that have <code>managed_state IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster> fetchByManagedState(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Cluster.CLUSTER.MANAGED_STATE, values);
	}

	/**
	 * Fetch records that have <code>removed IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster> fetchByRemoved(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Cluster.CLUSTER.REMOVED, values);
	}

	/**
	 * Fetch records that have <code>owner IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster> fetchByOwner(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Cluster.CLUSTER.OWNER, values);
	}

	/**
	 * Fetch records that have <code>created IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster> fetchByCreated(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Cluster.CLUSTER.CREATED, values);
	}

	/**
	 * Fetch records that have <code>lastUpdated IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster> fetchByLastupdated(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Cluster.CLUSTER.LASTUPDATED, values);
	}

	/**
	 * Fetch records that have <code>engine_state IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Cluster> fetchByEngineState(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Cluster.CLUSTER.ENGINE_STATE, values);
	}
}
