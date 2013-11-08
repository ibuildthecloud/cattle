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
@javax.persistence.Table(name = "network_asa1000v_map", schema = "cloud")
public class NetworkAsa1000vMapRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.NetworkAsa1000vMapRecord> implements org.jooq.Record3<java.lang.Long, java.lang.Long, java.lang.Long> {

	private static final long serialVersionUID = -1834108758;

	/**
	 * Setter for <code>cloud.network_asa1000v_map.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.network_asa1000v_map.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.network_asa1000v_map.network_id</code>. 
	 */
	public void setNetworkId(java.lang.Long value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.network_asa1000v_map.network_id</code>. 
	 */
	@javax.persistence.Column(name = "network_id", nullable = false, precision = 20)
	public java.lang.Long getNetworkId() {
		return (java.lang.Long) getValue(1);
	}

	/**
	 * Setter for <code>cloud.network_asa1000v_map.asa1000v_id</code>. 
	 */
	public void setAsa1000vId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.network_asa1000v_map.asa1000v_id</code>. 
	 */
	@javax.persistence.Column(name = "asa1000v_id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getAsa1000vId() {
		return (java.lang.Long) getValue(2);
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
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.Long, java.lang.Long> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.Long, java.lang.Long> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetworkAsa1000vMap.NETWORK_ASA1000V_MAP.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetworkAsa1000vMap.NETWORK_ASA1000V_MAP.NETWORK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.NetworkAsa1000vMap.NETWORK_ASA1000V_MAP.ASA1000V_ID;
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
	public java.lang.Long value2() {
		return getNetworkId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getAsa1000vId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached NetworkAsa1000vMapRecord
	 */
	public NetworkAsa1000vMapRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.NetworkAsa1000vMap.NETWORK_ASA1000V_MAP);
	}

	/**
	 * Create a detached, initialised NetworkAsa1000vMapRecord
	 */
	public NetworkAsa1000vMapRecord(java.lang.Long id, java.lang.Long networkId, java.lang.Long asa1000vId) {
		super(org.apache.cloudstack.db.jooq.generated.tables.NetworkAsa1000vMap.NETWORK_ASA1000V_MAP);

		setValue(0, id);
		setValue(1, networkId);
		setValue(2, asa1000vId);
	}
}
