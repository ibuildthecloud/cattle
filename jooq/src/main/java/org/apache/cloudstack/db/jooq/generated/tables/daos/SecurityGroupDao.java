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
public class SecurityGroupDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.SecurityGroupRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.SecurityGroup, java.lang.Long> {

	/**
	 * Create a new SecurityGroupDao without any configuration
	 */
	public SecurityGroupDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.SecurityGroup.SECURITY_GROUP, org.apache.cloudstack.db.jooq.generated.tables.pojos.SecurityGroup.class);
	}

	/**
	 * Create a new SecurityGroupDao with an attached configuration
	 */
	public SecurityGroupDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.SecurityGroup.SECURITY_GROUP, org.apache.cloudstack.db.jooq.generated.tables.pojos.SecurityGroup.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.SecurityGroup object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SecurityGroup> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SecurityGroup.SECURITY_GROUP.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.SecurityGroup fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.SecurityGroup.SECURITY_GROUP.ID, value);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SecurityGroup> fetchByName(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SecurityGroup.SECURITY_GROUP.NAME, values);
	}

	/**
	 * Fetch records that have <code>uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SecurityGroup> fetchByUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SecurityGroup.SECURITY_GROUP.UUID, values);
	}

	/**
	 * Fetch a unique record that has <code>uuid = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.SecurityGroup fetchOneByUuid(java.lang.String value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.SecurityGroup.SECURITY_GROUP.UUID, value);
	}

	/**
	 * Fetch records that have <code>description IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SecurityGroup> fetchByDescription(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SecurityGroup.SECURITY_GROUP.DESCRIPTION, values);
	}

	/**
	 * Fetch records that have <code>domain_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SecurityGroup> fetchByDomainId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SecurityGroup.SECURITY_GROUP.DOMAIN_ID, values);
	}

	/**
	 * Fetch records that have <code>account_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.SecurityGroup> fetchByAccountId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.SecurityGroup.SECURITY_GROUP.ACCOUNT_ID, values);
	}
}
