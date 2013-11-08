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
public class VolumeReservationDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.VolumeReservationRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.VolumeReservation, java.lang.Long> {

	/**
	 * Create a new VolumeReservationDao without any configuration
	 */
	public VolumeReservationDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.VolumeReservation.VOLUME_RESERVATION, org.apache.cloudstack.db.jooq.generated.tables.pojos.VolumeReservation.class);
	}

	/**
	 * Create a new VolumeReservationDao with an attached configuration
	 */
	public VolumeReservationDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.VolumeReservation.VOLUME_RESERVATION, org.apache.cloudstack.db.jooq.generated.tables.pojos.VolumeReservation.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.VolumeReservation object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VolumeReservation> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VolumeReservation.VOLUME_RESERVATION.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.VolumeReservation fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.VolumeReservation.VOLUME_RESERVATION.ID, value);
	}

	/**
	 * Fetch records that have <code>vm_reservation_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VolumeReservation> fetchByVmReservationId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VolumeReservation.VOLUME_RESERVATION.VM_RESERVATION_ID, values);
	}

	/**
	 * Fetch records that have <code>vm_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VolumeReservation> fetchByVmId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VolumeReservation.VOLUME_RESERVATION.VM_ID, values);
	}

	/**
	 * Fetch records that have <code>volume_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VolumeReservation> fetchByVolumeId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VolumeReservation.VOLUME_RESERVATION.VOLUME_ID, values);
	}

	/**
	 * Fetch records that have <code>pool_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.VolumeReservation> fetchByPoolId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.VolumeReservation.VOLUME_RESERVATION.POOL_ID, values);
	}
}
