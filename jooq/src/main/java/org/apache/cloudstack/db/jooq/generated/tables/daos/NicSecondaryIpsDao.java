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
public class NicSecondaryIpsDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.NicSecondaryIpsRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.NicSecondaryIps, java.lang.Long> {

	/**
	 * Create a new NicSecondaryIpsDao without any configuration
	 */
	public NicSecondaryIpsDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS, org.apache.cloudstack.db.jooq.generated.tables.pojos.NicSecondaryIps.class);
	}

	/**
	 * Create a new NicSecondaryIpsDao with an attached configuration
	 */
	public NicSecondaryIpsDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS, org.apache.cloudstack.db.jooq.generated.tables.pojos.NicSecondaryIps.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.NicSecondaryIps object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NicSecondaryIps> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.NicSecondaryIps fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.ID, value);
	}

	/**
	 * Fetch records that have <code>uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NicSecondaryIps> fetchByUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.UUID, values);
	}

	/**
	 * Fetch a unique record that has <code>uuid = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.NicSecondaryIps fetchOneByUuid(java.lang.String value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.UUID, value);
	}

	/**
	 * Fetch records that have <code>vmId IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NicSecondaryIps> fetchByVmid(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.VMID, values);
	}

	/**
	 * Fetch records that have <code>nicId IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NicSecondaryIps> fetchByNicid(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.NICID, values);
	}

	/**
	 * Fetch records that have <code>ip4_address IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NicSecondaryIps> fetchByIp4Address(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.IP4_ADDRESS, values);
	}

	/**
	 * Fetch records that have <code>ip6_address IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NicSecondaryIps> fetchByIp6Address(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.IP6_ADDRESS, values);
	}

	/**
	 * Fetch records that have <code>network_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NicSecondaryIps> fetchByNetworkId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.NETWORK_ID, values);
	}

	/**
	 * Fetch records that have <code>created IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NicSecondaryIps> fetchByCreated(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.CREATED, values);
	}

	/**
	 * Fetch records that have <code>account_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NicSecondaryIps> fetchByAccountId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.ACCOUNT_ID, values);
	}

	/**
	 * Fetch records that have <code>domain_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.NicSecondaryIps> fetchByDomainId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.NicSecondaryIps.NIC_SECONDARY_IPS.DOMAIN_ID, values);
	}
}
