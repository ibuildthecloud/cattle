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
public class AccountDetailsDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.AccountDetailsRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.AccountDetails, java.lang.Long> {

	/**
	 * Create a new AccountDetailsDao without any configuration
	 */
	public AccountDetailsDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.AccountDetails.ACCOUNT_DETAILS, org.apache.cloudstack.db.jooq.generated.tables.pojos.AccountDetails.class);
	}

	/**
	 * Create a new AccountDetailsDao with an attached configuration
	 */
	public AccountDetailsDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.AccountDetails.ACCOUNT_DETAILS, org.apache.cloudstack.db.jooq.generated.tables.pojos.AccountDetails.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.AccountDetails object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.AccountDetails> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.AccountDetails.ACCOUNT_DETAILS.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.AccountDetails fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.AccountDetails.ACCOUNT_DETAILS.ID, value);
	}

	/**
	 * Fetch records that have <code>account_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.AccountDetails> fetchByAccountId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.AccountDetails.ACCOUNT_DETAILS.ACCOUNT_ID, values);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.AccountDetails> fetchByName(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.AccountDetails.ACCOUNT_DETAILS.NAME, values);
	}

	/**
	 * Fetch records that have <code>value IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.AccountDetails> fetchByValue(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.AccountDetails.ACCOUNT_DETAILS.VALUE, values);
	}
}
