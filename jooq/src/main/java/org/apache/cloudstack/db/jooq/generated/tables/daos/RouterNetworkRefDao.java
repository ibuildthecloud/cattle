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
public class RouterNetworkRefDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.RouterNetworkRefRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.RouterNetworkRef, java.lang.Long> {

	/**
	 * Create a new RouterNetworkRefDao without any configuration
	 */
	public RouterNetworkRefDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.RouterNetworkRef.ROUTER_NETWORK_REF, org.apache.cloudstack.db.jooq.generated.tables.pojos.RouterNetworkRef.class);
	}

	/**
	 * Create a new RouterNetworkRefDao with an attached configuration
	 */
	public RouterNetworkRefDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.RouterNetworkRef.ROUTER_NETWORK_REF, org.apache.cloudstack.db.jooq.generated.tables.pojos.RouterNetworkRef.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.RouterNetworkRef object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.RouterNetworkRef> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.RouterNetworkRef.ROUTER_NETWORK_REF.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.RouterNetworkRef fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.RouterNetworkRef.ROUTER_NETWORK_REF.ID, value);
	}

	/**
	 * Fetch records that have <code>router_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.RouterNetworkRef> fetchByRouterId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.RouterNetworkRef.ROUTER_NETWORK_REF.ROUTER_ID, values);
	}

	/**
	 * Fetch records that have <code>network_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.RouterNetworkRef> fetchByNetworkId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.RouterNetworkRef.ROUTER_NETWORK_REF.NETWORK_ID, values);
	}

	/**
	 * Fetch records that have <code>guest_type IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.RouterNetworkRef> fetchByGuestType(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.RouterNetworkRef.ROUTER_NETWORK_REF.GUEST_TYPE, values);
	}
}
