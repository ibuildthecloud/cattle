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
public class NtwkServiceMapDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.NtwkServiceMapRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.NtwkServiceMap, java.lang.Long> {

	/**
	 * Create a new NtwkServiceMapDao without any configuration
	 */
	public NtwkServiceMapDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.NtwkServiceMap.NTWK_SERVICE_MAP, org.apache.cloudstack.db.jooq.generated.tables.pojos.NtwkServiceMap.class);
	}

	/**
	 * Create a new NtwkServiceMapDao with an attached configuration
	 */
	public NtwkServiceMapDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.NtwkServiceMap.NTWK_SERVICE_MAP, org.apache.cloudstack.db.jooq.generated.tables.pojos.NtwkServiceMap.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.NtwkServiceMap object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NtwkServiceMap> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NtwkServiceMap.NTWK_SERVICE_MAP.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.NtwkServiceMap fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.NtwkServiceMap.NTWK_SERVICE_MAP.ID, value);
	}

	/**
	 * Fetch records that have <code>network_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NtwkServiceMap> fetchByNetworkId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NtwkServiceMap.NTWK_SERVICE_MAP.NETWORK_ID, values);
	}

	/**
	 * Fetch records that have <code>service IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NtwkServiceMap> fetchByService(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NtwkServiceMap.NTWK_SERVICE_MAP.SERVICE, values);
	}

	/**
	 * Fetch records that have <code>provider IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NtwkServiceMap> fetchByProvider(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NtwkServiceMap.NTWK_SERVICE_MAP.PROVIDER, values);
	}

	/**
	 * Fetch records that have <code>created IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NtwkServiceMap> fetchByCreated(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NtwkServiceMap.NTWK_SERVICE_MAP.CREATED, values);
	}
}
