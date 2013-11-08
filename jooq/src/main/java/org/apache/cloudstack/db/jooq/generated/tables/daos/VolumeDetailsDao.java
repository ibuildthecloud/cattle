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
public class VolumeDetailsDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeDetailsRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.VolumeDetails, java.lang.Long> {

	/**
	 * Create a new VolumeDetailsDao without any configuration
	 */
	public VolumeDetailsDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.VolumeDetails.VOLUME_DETAILS, org.apache.cloudstack.db.jooq.generated.tables.pojos.VolumeDetails.class);
	}

	/**
	 * Create a new VolumeDetailsDao with an attached configuration
	 */
	public VolumeDetailsDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.VolumeDetails.VOLUME_DETAILS, org.apache.cloudstack.db.jooq.generated.tables.pojos.VolumeDetails.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.VolumeDetails object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VolumeDetails> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VolumeDetails.VOLUME_DETAILS.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.VolumeDetails fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.VolumeDetails.VOLUME_DETAILS.ID, value);
	}

	/**
	 * Fetch records that have <code>volume_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VolumeDetails> fetchByVolumeId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VolumeDetails.VOLUME_DETAILS.VOLUME_ID, values);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VolumeDetails> fetchByName(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VolumeDetails.VOLUME_DETAILS.NAME, values);
	}

	/**
	 * Fetch records that have <code>value IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VolumeDetails> fetchByValue(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VolumeDetails.VOLUME_DETAILS.VALUE, values);
	}

	/**
	 * Fetch records that have <code>display IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VolumeDetails> fetchByDisplay(java.lang.Boolean... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VolumeDetails.VOLUME_DETAILS.DISPLAY, values);
	}
}
