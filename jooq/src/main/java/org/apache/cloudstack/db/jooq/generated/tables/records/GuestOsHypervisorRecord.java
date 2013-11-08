/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "guest_os_hypervisor", schema = "cloud")
public class GuestOsHypervisorRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.GuestOsHypervisorRecord> implements org.jooq.Record4<java.lang.Long, java.lang.String, java.lang.String, java.lang.Long> {

	private static final long serialVersionUID = 687188784;

	/**
	 * Setter for <code>cloud.guest_os_hypervisor.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.guest_os_hypervisor.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.guest_os_hypervisor.hypervisor_type</code>. 
	 */
	public void setHypervisorType(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.guest_os_hypervisor.hypervisor_type</code>. 
	 */
	@javax.persistence.Column(name = "hypervisor_type", nullable = false, length = 32)
	public java.lang.String getHypervisorType() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cloud.guest_os_hypervisor.guest_os_name</code>. 
	 */
	public void setGuestOsName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.guest_os_hypervisor.guest_os_name</code>. 
	 */
	@javax.persistence.Column(name = "guest_os_name", nullable = false, length = 255)
	public java.lang.String getGuestOsName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>cloud.guest_os_hypervisor.guest_os_id</code>. 
	 */
	public void setGuestOsId(java.lang.Long value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.guest_os_hypervisor.guest_os_id</code>. 
	 */
	@javax.persistence.Column(name = "guest_os_id", nullable = false, precision = 20)
	public java.lang.Long getGuestOsId() {
		return (java.lang.Long) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Long, java.lang.String, java.lang.String, java.lang.Long> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Long, java.lang.String, java.lang.String, java.lang.Long> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.GuestOsHypervisor.GUEST_OS_HYPERVISOR.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.GuestOsHypervisor.GUEST_OS_HYPERVISOR.HYPERVISOR_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.GuestOsHypervisor.GUEST_OS_HYPERVISOR.GUEST_OS_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field4() {
		return org.apache.cloudstack.db.jooq.generated.tables.GuestOsHypervisor.GUEST_OS_HYPERVISOR.GUEST_OS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getHypervisorType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getGuestOsName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value4() {
		return getGuestOsId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached GuestOsHypervisorRecord
	 */
	public GuestOsHypervisorRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.GuestOsHypervisor.GUEST_OS_HYPERVISOR);
	}

	/**
	 * Create a detached, initialised GuestOsHypervisorRecord
	 */
	public GuestOsHypervisorRecord(java.lang.Long id, java.lang.String hypervisorType, java.lang.String guestOsName, java.lang.Long guestOsId) {
		super(org.apache.cloudstack.db.jooq.generated.tables.GuestOsHypervisor.GUEST_OS_HYPERVISOR);

		setValue(0, id);
		setValue(1, hypervisorType);
		setValue(2, guestOsName);
		setValue(3, guestOsId);
	}
}
