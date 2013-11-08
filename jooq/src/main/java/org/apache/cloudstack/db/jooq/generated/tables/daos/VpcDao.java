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
public class VpcDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.VpcRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.Vpc, java.lang.Long> {

	/**
	 * Create a new VpcDao without any configuration
	 */
	public VpcDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.Vpc.VPC, org.apache.cloudstack.db.jooq.generated.tables.pojos.Vpc.class);
	}

	/**
	 * Create a new VpcDao with an attached configuration
	 */
	public VpcDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.Vpc.VPC, org.apache.cloudstack.db.jooq.generated.tables.pojos.Vpc.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.Vpc object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Vpc> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Vpc.VPC.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.Vpc fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.Vpc.VPC.ID, value);
	}

	/**
	 * Fetch records that have <code>uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Vpc> fetchByUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Vpc.VPC.UUID, values);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Vpc> fetchByName(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Vpc.VPC.NAME, values);
	}

	/**
	 * Fetch records that have <code>display_text IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Vpc> fetchByDisplayText(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Vpc.VPC.DISPLAY_TEXT, values);
	}

	/**
	 * Fetch records that have <code>cidr IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Vpc> fetchByCidr(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Vpc.VPC.CIDR, values);
	}

	/**
	 * Fetch records that have <code>vpc_offering_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Vpc> fetchByVpcOfferingId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Vpc.VPC.VPC_OFFERING_ID, values);
	}

	/**
	 * Fetch records that have <code>zone_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Vpc> fetchByZoneId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Vpc.VPC.ZONE_ID, values);
	}

	/**
	 * Fetch records that have <code>state IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Vpc> fetchByState(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Vpc.VPC.STATE, values);
	}

	/**
	 * Fetch records that have <code>domain_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Vpc> fetchByDomainId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Vpc.VPC.DOMAIN_ID, values);
	}

	/**
	 * Fetch records that have <code>account_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Vpc> fetchByAccountId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Vpc.VPC.ACCOUNT_ID, values);
	}

	/**
	 * Fetch records that have <code>network_domain IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Vpc> fetchByNetworkDomain(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Vpc.VPC.NETWORK_DOMAIN, values);
	}

	/**
	 * Fetch records that have <code>removed IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Vpc> fetchByRemoved(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Vpc.VPC.REMOVED, values);
	}

	/**
	 * Fetch records that have <code>created IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Vpc> fetchByCreated(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Vpc.VPC.CREATED, values);
	}

	/**
	 * Fetch records that have <code>restart_required IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Vpc> fetchByRestartRequired(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Vpc.VPC.RESTART_REQUIRED, values);
	}
}
