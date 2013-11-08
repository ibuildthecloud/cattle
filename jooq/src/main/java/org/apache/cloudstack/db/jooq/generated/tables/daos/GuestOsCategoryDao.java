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
public class GuestOsCategoryDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.GuestOsCategoryRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.GuestOsCategory, java.lang.Long> {

	/**
	 * Create a new GuestOsCategoryDao without any configuration
	 */
	public GuestOsCategoryDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.GuestOsCategory.GUEST_OS_CATEGORY, org.apache.cloudstack.db.jooq.generated.tables.pojos.GuestOsCategory.class);
	}

	/**
	 * Create a new GuestOsCategoryDao with an attached configuration
	 */
	public GuestOsCategoryDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.GuestOsCategory.GUEST_OS_CATEGORY, org.apache.cloudstack.db.jooq.generated.tables.pojos.GuestOsCategory.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.GuestOsCategory object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.GuestOsCategory> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.GuestOsCategory.GUEST_OS_CATEGORY.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.GuestOsCategory fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.GuestOsCategory.GUEST_OS_CATEGORY.ID, value);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.GuestOsCategory> fetchByName(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.GuestOsCategory.GUEST_OS_CATEGORY.NAME, values);
	}

	/**
	 * Fetch records that have <code>uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.GuestOsCategory> fetchByUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.GuestOsCategory.GUEST_OS_CATEGORY.UUID, values);
	}

	/**
	 * Fetch a unique record that has <code>uuid = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.GuestOsCategory fetchOneByUuid(java.lang.String value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.GuestOsCategory.GUEST_OS_CATEGORY.UUID, value);
	}
}
