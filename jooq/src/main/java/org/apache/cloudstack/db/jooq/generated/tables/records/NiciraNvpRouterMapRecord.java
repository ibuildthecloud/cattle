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
@javax.persistence.Table(name = "nicira_nvp_router_map", schema = "cloud")
public class NiciraNvpRouterMapRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.NiciraNvpRouterMapRecord> implements org.jooq.Record3<java.lang.Long, java.lang.String, java.lang.Long> {

	private static final long serialVersionUID = 794189124;

	/**
	 * Setter for <code>cloud.nicira_nvp_router_map.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.nicira_nvp_router_map.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.nicira_nvp_router_map.logicalrouter_uuid</code>. 
	 */
	public void setLogicalrouterUuid(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.nicira_nvp_router_map.logicalrouter_uuid</code>. 
	 */
	@javax.persistence.Column(name = "logicalrouter_uuid", unique = true, nullable = false, length = 255)
	public java.lang.String getLogicalrouterUuid() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cloud.nicira_nvp_router_map.network_id</code>. 
	 */
	public void setNetworkId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.nicira_nvp_router_map.network_id</code>. 
	 */
	@javax.persistence.Column(name = "network_id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getNetworkId() {
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
	public org.jooq.Row3<java.lang.Long, java.lang.String, java.lang.Long> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Long, java.lang.String, java.lang.Long> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field1() {
		return org.apache.cloudstack.db.jooq.generated.tables.NiciraNvpRouterMap.NICIRA_NVP_ROUTER_MAP.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.apache.cloudstack.db.jooq.generated.tables.NiciraNvpRouterMap.NICIRA_NVP_ROUTER_MAP.LOGICALROUTER_UUID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field3() {
		return org.apache.cloudstack.db.jooq.generated.tables.NiciraNvpRouterMap.NICIRA_NVP_ROUTER_MAP.NETWORK_ID;
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
		return getLogicalrouterUuid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value3() {
		return getNetworkId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached NiciraNvpRouterMapRecord
	 */
	public NiciraNvpRouterMapRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.NiciraNvpRouterMap.NICIRA_NVP_ROUTER_MAP);
	}

	/**
	 * Create a detached, initialised NiciraNvpRouterMapRecord
	 */
	public NiciraNvpRouterMapRecord(java.lang.Long id, java.lang.String logicalrouterUuid, java.lang.Long networkId) {
		super(org.apache.cloudstack.db.jooq.generated.tables.NiciraNvpRouterMap.NICIRA_NVP_ROUTER_MAP);

		setValue(0, id);
		setValue(1, logicalrouterUuid);
		setValue(2, networkId);
	}
}
