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
@javax.persistence.Table(name = "network_offerings", schema = "cloud")
public class NetworkOfferingsRecord extends org.jooq.impl.UpdatableRecordImpl<org.apache.cloudstack.db.jooq.generated.tables.records.NetworkOfferingsRecord> {

	private static final long serialVersionUID = -1476341405;

	/**
	 * Setter for <code>cloud.network_offerings.id</code>. 
	 */
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cloud.network_offerings.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.name</code>. 
	 */
	@javax.persistence.Column(name = "name", length = 64)
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cloud.network_offerings.uuid</code>. 
	 */
	public void setUuid(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.uuid</code>. 
	 */
	@javax.persistence.Column(name = "uuid", unique = true, length = 40)
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>cloud.network_offerings.unique_name</code>. 
	 */
	public void setUniqueName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.unique_name</code>. 
	 */
	@javax.persistence.Column(name = "unique_name", unique = true, length = 64)
	public java.lang.String getUniqueName() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>cloud.network_offerings.display_text</code>. 
	 */
	public void setDisplayText(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.display_text</code>. 
	 */
	@javax.persistence.Column(name = "display_text", nullable = false, length = 255)
	public java.lang.String getDisplayText() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>cloud.network_offerings.nw_rate</code>. 
	 */
	public void setNwRate(java.lang.Short value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.nw_rate</code>. 
	 */
	@javax.persistence.Column(name = "nw_rate", precision = 5)
	public java.lang.Short getNwRate() {
		return (java.lang.Short) getValue(5);
	}

	/**
	 * Setter for <code>cloud.network_offerings.mc_rate</code>. 
	 */
	public void setMcRate(java.lang.Short value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.mc_rate</code>. 
	 */
	@javax.persistence.Column(name = "mc_rate", precision = 5)
	public java.lang.Short getMcRate() {
		return (java.lang.Short) getValue(6);
	}

	/**
	 * Setter for <code>cloud.network_offerings.traffic_type</code>. 
	 */
	public void setTrafficType(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.traffic_type</code>. 
	 */
	@javax.persistence.Column(name = "traffic_type", nullable = false, length = 32)
	public java.lang.String getTrafficType() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>cloud.network_offerings.tags</code>. 
	 */
	public void setTags(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.tags</code>. 
	 */
	@javax.persistence.Column(name = "tags", length = 4096)
	public java.lang.String getTags() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>cloud.network_offerings.system_only</code>. 
	 */
	public void setSystemOnly(java.lang.Integer value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.system_only</code>. 
	 */
	@javax.persistence.Column(name = "system_only", nullable = false, precision = 10)
	public java.lang.Integer getSystemOnly() {
		return (java.lang.Integer) getValue(9);
	}

	/**
	 * Setter for <code>cloud.network_offerings.specify_vlan</code>. 
	 */
	public void setSpecifyVlan(java.lang.Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.specify_vlan</code>. 
	 */
	@javax.persistence.Column(name = "specify_vlan", nullable = false, precision = 10)
	public java.lang.Integer getSpecifyVlan() {
		return (java.lang.Integer) getValue(10);
	}

	/**
	 * Setter for <code>cloud.network_offerings.service_offering_id</code>. 
	 */
	public void setServiceOfferingId(java.lang.Long value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.service_offering_id</code>. 
	 */
	@javax.persistence.Column(name = "service_offering_id", precision = 20)
	public java.lang.Long getServiceOfferingId() {
		return (java.lang.Long) getValue(11);
	}

	/**
	 * Setter for <code>cloud.network_offerings.conserve_mode</code>. 
	 */
	public void setConserveMode(java.lang.Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.conserve_mode</code>. 
	 */
	@javax.persistence.Column(name = "conserve_mode", nullable = false, precision = 10)
	public java.lang.Integer getConserveMode() {
		return (java.lang.Integer) getValue(12);
	}

	/**
	 * Setter for <code>cloud.network_offerings.created</code>. 
	 */
	public void setCreated(java.sql.Timestamp value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.created</code>. 
	 */
	@javax.persistence.Column(name = "created", nullable = false)
	public java.sql.Timestamp getCreated() {
		return (java.sql.Timestamp) getValue(13);
	}

	/**
	 * Setter for <code>cloud.network_offerings.removed</code>. 
	 */
	public void setRemoved(java.sql.Timestamp value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.removed</code>. 
	 */
	@javax.persistence.Column(name = "removed")
	public java.sql.Timestamp getRemoved() {
		return (java.sql.Timestamp) getValue(14);
	}

	/**
	 * Setter for <code>cloud.network_offerings.default</code>. 
	 */
	public void setDefault(java.lang.Integer value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.default</code>. 
	 */
	@javax.persistence.Column(name = "default", nullable = false, precision = 10)
	public java.lang.Integer getDefault() {
		return (java.lang.Integer) getValue(15);
	}

	/**
	 * Setter for <code>cloud.network_offerings.availability</code>. 
	 */
	public void setAvailability(java.lang.String value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.availability</code>. 
	 */
	@javax.persistence.Column(name = "availability", nullable = false, length = 255)
	public java.lang.String getAvailability() {
		return (java.lang.String) getValue(16);
	}

	/**
	 * Setter for <code>cloud.network_offerings.dedicated_lb_service</code>. 
	 */
	public void setDedicatedLbService(java.lang.Integer value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.dedicated_lb_service</code>. 
	 */
	@javax.persistence.Column(name = "dedicated_lb_service", nullable = false, precision = 10)
	public java.lang.Integer getDedicatedLbService() {
		return (java.lang.Integer) getValue(17);
	}

	/**
	 * Setter for <code>cloud.network_offerings.shared_source_nat_service</code>. 
	 */
	public void setSharedSourceNatService(java.lang.Integer value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.shared_source_nat_service</code>. 
	 */
	@javax.persistence.Column(name = "shared_source_nat_service", nullable = false, precision = 10)
	public java.lang.Integer getSharedSourceNatService() {
		return (java.lang.Integer) getValue(18);
	}

	/**
	 * Setter for <code>cloud.network_offerings.sort_key</code>. 
	 */
	public void setSortKey(java.lang.Integer value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.sort_key</code>. 
	 */
	@javax.persistence.Column(name = "sort_key", nullable = false, precision = 10)
	public java.lang.Integer getSortKey() {
		return (java.lang.Integer) getValue(19);
	}

	/**
	 * Setter for <code>cloud.network_offerings.redundant_router_service</code>. 
	 */
	public void setRedundantRouterService(java.lang.Integer value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.redundant_router_service</code>. 
	 */
	@javax.persistence.Column(name = "redundant_router_service", nullable = false, precision = 10)
	public java.lang.Integer getRedundantRouterService() {
		return (java.lang.Integer) getValue(20);
	}

	/**
	 * Setter for <code>cloud.network_offerings.state</code>. 
	 */
	public void setState(java.lang.String value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.state</code>. 
	 */
	@javax.persistence.Column(name = "state", length = 32)
	public java.lang.String getState() {
		return (java.lang.String) getValue(21);
	}

	/**
	 * Setter for <code>cloud.network_offerings.guest_type</code>. 
	 */
	public void setGuestType(java.lang.String value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.guest_type</code>. 
	 */
	@javax.persistence.Column(name = "guest_type", length = 32)
	public java.lang.String getGuestType() {
		return (java.lang.String) getValue(22);
	}

	/**
	 * Setter for <code>cloud.network_offerings.elastic_ip_service</code>. 
	 */
	public void setElasticIpService(java.lang.Integer value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.elastic_ip_service</code>. 
	 */
	@javax.persistence.Column(name = "elastic_ip_service", nullable = false, precision = 10)
	public java.lang.Integer getElasticIpService() {
		return (java.lang.Integer) getValue(23);
	}

	/**
	 * Setter for <code>cloud.network_offerings.eip_associate_public_ip</code>. 
	 */
	public void setEipAssociatePublicIp(java.lang.Integer value) {
		setValue(24, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.eip_associate_public_ip</code>. 
	 */
	@javax.persistence.Column(name = "eip_associate_public_ip", nullable = false, precision = 10)
	public java.lang.Integer getEipAssociatePublicIp() {
		return (java.lang.Integer) getValue(24);
	}

	/**
	 * Setter for <code>cloud.network_offerings.elastic_lb_service</code>. 
	 */
	public void setElasticLbService(java.lang.Integer value) {
		setValue(25, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.elastic_lb_service</code>. 
	 */
	@javax.persistence.Column(name = "elastic_lb_service", nullable = false, precision = 10)
	public java.lang.Integer getElasticLbService() {
		return (java.lang.Integer) getValue(25);
	}

	/**
	 * Setter for <code>cloud.network_offerings.specify_ip_ranges</code>. 
	 */
	public void setSpecifyIpRanges(java.lang.Integer value) {
		setValue(26, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.specify_ip_ranges</code>. 
	 */
	@javax.persistence.Column(name = "specify_ip_ranges", nullable = false, precision = 10)
	public java.lang.Integer getSpecifyIpRanges() {
		return (java.lang.Integer) getValue(26);
	}

	/**
	 * Setter for <code>cloud.network_offerings.inline</code>. 
	 */
	public void setInline(java.lang.Integer value) {
		setValue(27, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.inline</code>. 
	 */
	@javax.persistence.Column(name = "inline", nullable = false, precision = 10)
	public java.lang.Integer getInline() {
		return (java.lang.Integer) getValue(27);
	}

	/**
	 * Setter for <code>cloud.network_offerings.is_persistent</code>. 
	 */
	public void setIsPersistent(java.lang.Integer value) {
		setValue(28, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.is_persistent</code>. 
	 */
	@javax.persistence.Column(name = "is_persistent", nullable = false, precision = 10)
	public java.lang.Integer getIsPersistent() {
		return (java.lang.Integer) getValue(28);
	}

	/**
	 * Setter for <code>cloud.network_offerings.internal_lb</code>. 
	 */
	public void setInternalLb(java.lang.Integer value) {
		setValue(29, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.internal_lb</code>. 
	 */
	@javax.persistence.Column(name = "internal_lb", nullable = false, precision = 10)
	public java.lang.Integer getInternalLb() {
		return (java.lang.Integer) getValue(29);
	}

	/**
	 * Setter for <code>cloud.network_offerings.public_lb</code>. 
	 */
	public void setPublicLb(java.lang.Integer value) {
		setValue(30, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.public_lb</code>. 
	 */
	@javax.persistence.Column(name = "public_lb", nullable = false, precision = 10)
	public java.lang.Integer getPublicLb() {
		return (java.lang.Integer) getValue(30);
	}

	/**
	 * Setter for <code>cloud.network_offerings.egress_default_policy</code>. 
	 */
	public void setEgressDefaultPolicy(java.lang.Boolean value) {
		setValue(31, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.egress_default_policy</code>. 
	 */
	@javax.persistence.Column(name = "egress_default_policy", precision = 1)
	public java.lang.Boolean getEgressDefaultPolicy() {
		return (java.lang.Boolean) getValue(31);
	}

	/**
	 * Setter for <code>cloud.network_offerings.concurrent_connections</code>. 
	 */
	public void setConcurrentConnections(java.lang.Integer value) {
		setValue(32, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.concurrent_connections</code>. 
	 */
	@javax.persistence.Column(name = "concurrent_connections", precision = 10)
	public java.lang.Integer getConcurrentConnections() {
		return (java.lang.Integer) getValue(32);
	}

	/**
	 * Setter for <code>cloud.network_offerings.keep_alive_enabled</code>. 
	 */
	public void setKeepAliveEnabled(java.lang.Integer value) {
		setValue(33, value);
	}

	/**
	 * Getter for <code>cloud.network_offerings.keep_alive_enabled</code>. 
	 */
	@javax.persistence.Column(name = "keep_alive_enabled", nullable = false, precision = 10)
	public java.lang.Integer getKeepAliveEnabled() {
		return (java.lang.Integer) getValue(33);
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
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached NetworkOfferingsRecord
	 */
	public NetworkOfferingsRecord() {
		super(org.apache.cloudstack.db.jooq.generated.tables.NetworkOfferings.NETWORK_OFFERINGS);
	}

	/**
	 * Create a detached, initialised NetworkOfferingsRecord
	 */
	public NetworkOfferingsRecord(java.lang.Long id, java.lang.String name, java.lang.String uuid, java.lang.String uniqueName, java.lang.String displayText, java.lang.Short nwRate, java.lang.Short mcRate, java.lang.String trafficType, java.lang.String tags, java.lang.Integer systemOnly, java.lang.Integer specifyVlan, java.lang.Long serviceOfferingId, java.lang.Integer conserveMode, java.sql.Timestamp created, java.sql.Timestamp removed, java.lang.Integer default_, java.lang.String availability, java.lang.Integer dedicatedLbService, java.lang.Integer sharedSourceNatService, java.lang.Integer sortKey, java.lang.Integer redundantRouterService, java.lang.String state, java.lang.String guestType, java.lang.Integer elasticIpService, java.lang.Integer eipAssociatePublicIp, java.lang.Integer elasticLbService, java.lang.Integer specifyIpRanges, java.lang.Integer inline, java.lang.Integer isPersistent, java.lang.Integer internalLb, java.lang.Integer publicLb, java.lang.Boolean egressDefaultPolicy, java.lang.Integer concurrentConnections, java.lang.Integer keepAliveEnabled) {
		super(org.apache.cloudstack.db.jooq.generated.tables.NetworkOfferings.NETWORK_OFFERINGS);

		setValue(0, id);
		setValue(1, name);
		setValue(2, uuid);
		setValue(3, uniqueName);
		setValue(4, displayText);
		setValue(5, nwRate);
		setValue(6, mcRate);
		setValue(7, trafficType);
		setValue(8, tags);
		setValue(9, systemOnly);
		setValue(10, specifyVlan);
		setValue(11, serviceOfferingId);
		setValue(12, conserveMode);
		setValue(13, created);
		setValue(14, removed);
		setValue(15, default_);
		setValue(16, availability);
		setValue(17, dedicatedLbService);
		setValue(18, sharedSourceNatService);
		setValue(19, sortKey);
		setValue(20, redundantRouterService);
		setValue(21, state);
		setValue(22, guestType);
		setValue(23, elasticIpService);
		setValue(24, eipAssociatePublicIp);
		setValue(25, elasticLbService);
		setValue(26, specifyIpRanges);
		setValue(27, inline);
		setValue(28, isPersistent);
		setValue(29, internalLb);
		setValue(30, publicLb);
		setValue(31, egressDefaultPolicy);
		setValue(32, concurrentConnections);
		setValue(33, keepAliveEnabled);
	}
}
