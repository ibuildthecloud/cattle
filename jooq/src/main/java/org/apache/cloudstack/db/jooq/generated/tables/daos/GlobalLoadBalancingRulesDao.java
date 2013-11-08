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
public class GlobalLoadBalancingRulesDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.GlobalLoadBalancingRulesRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.GlobalLoadBalancingRules, java.lang.Long> {

	/**
	 * Create a new GlobalLoadBalancingRulesDao without any configuration
	 */
	public GlobalLoadBalancingRulesDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.GlobalLoadBalancingRules.GLOBAL_LOAD_BALANCING_RULES, org.apache.cloudstack.db.jooq.generated.tables.pojos.GlobalLoadBalancingRules.class);
	}

	/**
	 * Create a new GlobalLoadBalancingRulesDao with an attached configuration
	 */
	public GlobalLoadBalancingRulesDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.GlobalLoadBalancingRules.GLOBAL_LOAD_BALANCING_RULES, org.apache.cloudstack.db.jooq.generated.tables.pojos.GlobalLoadBalancingRules.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.GlobalLoadBalancingRules object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.GlobalLoadBalancingRules> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.GlobalLoadBalancingRules.GLOBAL_LOAD_BALANCING_RULES.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.GlobalLoadBalancingRules fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.GlobalLoadBalancingRules.GLOBAL_LOAD_BALANCING_RULES.ID, value);
	}

	/**
	 * Fetch records that have <code>uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.GlobalLoadBalancingRules> fetchByUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.GlobalLoadBalancingRules.GLOBAL_LOAD_BALANCING_RULES.UUID, values);
	}

	/**
	 * Fetch records that have <code>account_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.GlobalLoadBalancingRules> fetchByAccountId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.GlobalLoadBalancingRules.GLOBAL_LOAD_BALANCING_RULES.ACCOUNT_ID, values);
	}

	/**
	 * Fetch records that have <code>domain_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.GlobalLoadBalancingRules> fetchByDomainId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.GlobalLoadBalancingRules.GLOBAL_LOAD_BALANCING_RULES.DOMAIN_ID, values);
	}

	/**
	 * Fetch records that have <code>region_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.GlobalLoadBalancingRules> fetchByRegionId(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.GlobalLoadBalancingRules.GLOBAL_LOAD_BALANCING_RULES.REGION_ID, values);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.GlobalLoadBalancingRules> fetchByName(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.GlobalLoadBalancingRules.GLOBAL_LOAD_BALANCING_RULES.NAME, values);
	}

	/**
	 * Fetch records that have <code>description IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.GlobalLoadBalancingRules> fetchByDescription(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.GlobalLoadBalancingRules.GLOBAL_LOAD_BALANCING_RULES.DESCRIPTION, values);
	}

	/**
	 * Fetch records that have <code>state IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.GlobalLoadBalancingRules> fetchByState(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.GlobalLoadBalancingRules.GLOBAL_LOAD_BALANCING_RULES.STATE, values);
	}

	/**
	 * Fetch records that have <code>algorithm IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.GlobalLoadBalancingRules> fetchByAlgorithm(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.GlobalLoadBalancingRules.GLOBAL_LOAD_BALANCING_RULES.ALGORITHM, values);
	}

	/**
	 * Fetch records that have <code>persistence IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.GlobalLoadBalancingRules> fetchByPersistence(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.GlobalLoadBalancingRules.GLOBAL_LOAD_BALANCING_RULES.PERSISTENCE, values);
	}

	/**
	 * Fetch records that have <code>service_type IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.GlobalLoadBalancingRules> fetchByServiceType(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.GlobalLoadBalancingRules.GLOBAL_LOAD_BALANCING_RULES.SERVICE_TYPE, values);
	}

	/**
	 * Fetch records that have <code>gslb_domain_name IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.GlobalLoadBalancingRules> fetchByGslbDomainName(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.GlobalLoadBalancingRules.GLOBAL_LOAD_BALANCING_RULES.GSLB_DOMAIN_NAME, values);
	}
}
