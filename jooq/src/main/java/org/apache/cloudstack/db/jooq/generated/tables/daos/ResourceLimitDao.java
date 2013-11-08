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
public class ResourceLimitDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceLimitRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.ResourceLimit, java.lang.Long> {

	/**
	 * Create a new ResourceLimitDao without any configuration
	 */
	public ResourceLimitDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.ResourceLimit.RESOURCE_LIMIT, org.apache.cloudstack.db.jooq.generated.tables.pojos.ResourceLimit.class);
	}

	/**
	 * Create a new ResourceLimitDao with an attached configuration
	 */
	public ResourceLimitDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.ResourceLimit.RESOURCE_LIMIT, org.apache.cloudstack.db.jooq.generated.tables.pojos.ResourceLimit.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.ResourceLimit object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.ResourceLimit> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.ResourceLimit.RESOURCE_LIMIT.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.ResourceLimit fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.ResourceLimit.RESOURCE_LIMIT.ID, value);
	}

	/**
	 * Fetch records that have <code>domain_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.ResourceLimit> fetchByDomainId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.ResourceLimit.RESOURCE_LIMIT.DOMAIN_ID, values);
	}

	/**
	 * Fetch records that have <code>account_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.ResourceLimit> fetchByAccountId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.ResourceLimit.RESOURCE_LIMIT.ACCOUNT_ID, values);
	}

	/**
	 * Fetch records that have <code>type IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.ResourceLimit> fetchByType(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.ResourceLimit.RESOURCE_LIMIT.TYPE, values);
	}

	/**
	 * Fetch records that have <code>max IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.ResourceLimit> fetchByMax(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.ResourceLimit.RESOURCE_LIMIT.MAX, values);
	}
}
