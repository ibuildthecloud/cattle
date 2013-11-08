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
public class S2sCustomerGatewayDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.S2sCustomerGatewayRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.S2sCustomerGateway, java.lang.Long> {

	/**
	 * Create a new S2sCustomerGatewayDao without any configuration
	 */
	public S2sCustomerGatewayDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway.S2S_CUSTOMER_GATEWAY, org.apache.cloudstack.db.jooq.generated.tables.pojos.S2sCustomerGateway.class);
	}

	/**
	 * Create a new S2sCustomerGatewayDao with an attached configuration
	 */
	public S2sCustomerGatewayDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway.S2S_CUSTOMER_GATEWAY, org.apache.cloudstack.db.jooq.generated.tables.pojos.S2sCustomerGateway.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.S2sCustomerGateway object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.S2sCustomerGateway> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway.S2S_CUSTOMER_GATEWAY.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.S2sCustomerGateway fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway.S2S_CUSTOMER_GATEWAY.ID, value);
	}

	/**
	 * Fetch records that have <code>uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.S2sCustomerGateway> fetchByUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway.S2S_CUSTOMER_GATEWAY.UUID, values);
	}

	/**
	 * Fetch a unique record that has <code>uuid = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.S2sCustomerGateway fetchOneByUuid(java.lang.String value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway.S2S_CUSTOMER_GATEWAY.UUID, value);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.S2sCustomerGateway> fetchByName(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway.S2S_CUSTOMER_GATEWAY.NAME, values);
	}

	/**
	 * Fetch records that have <code>gateway_ip IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.S2sCustomerGateway> fetchByGatewayIp(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway.S2S_CUSTOMER_GATEWAY.GATEWAY_IP, values);
	}

	/**
	 * Fetch records that have <code>guest_cidr_list IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.S2sCustomerGateway> fetchByGuestCidrList(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway.S2S_CUSTOMER_GATEWAY.GUEST_CIDR_LIST, values);
	}

	/**
	 * Fetch records that have <code>ipsec_psk IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.S2sCustomerGateway> fetchByIpsecPsk(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway.S2S_CUSTOMER_GATEWAY.IPSEC_PSK, values);
	}

	/**
	 * Fetch records that have <code>ike_policy IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.S2sCustomerGateway> fetchByIkePolicy(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway.S2S_CUSTOMER_GATEWAY.IKE_POLICY, values);
	}

	/**
	 * Fetch records that have <code>esp_policy IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.S2sCustomerGateway> fetchByEspPolicy(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway.S2S_CUSTOMER_GATEWAY.ESP_POLICY, values);
	}

	/**
	 * Fetch records that have <code>ike_lifetime IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.S2sCustomerGateway> fetchByIkeLifetime(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway.S2S_CUSTOMER_GATEWAY.IKE_LIFETIME, values);
	}

	/**
	 * Fetch records that have <code>esp_lifetime IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.S2sCustomerGateway> fetchByEspLifetime(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway.S2S_CUSTOMER_GATEWAY.ESP_LIFETIME, values);
	}

	/**
	 * Fetch records that have <code>dpd IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.S2sCustomerGateway> fetchByDpd(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway.S2S_CUSTOMER_GATEWAY.DPD, values);
	}

	/**
	 * Fetch records that have <code>domain_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.S2sCustomerGateway> fetchByDomainId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway.S2S_CUSTOMER_GATEWAY.DOMAIN_ID, values);
	}

	/**
	 * Fetch records that have <code>account_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.S2sCustomerGateway> fetchByAccountId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway.S2S_CUSTOMER_GATEWAY.ACCOUNT_ID, values);
	}

	/**
	 * Fetch records that have <code>removed IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.S2sCustomerGateway> fetchByRemoved(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.S2sCustomerGateway.S2S_CUSTOMER_GATEWAY.REMOVED, values);
	}
}
