/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "ntwk_offering_service_map", schema = "cloud", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"network_offering_id", "service", "provider"})
})
public class NtwkOfferingServiceMap implements java.io.Serializable {

	private static final long serialVersionUID = -961678629;

	private java.lang.Long     id;
	private java.lang.Long     networkOfferingId;
	private java.lang.String   service;
	private java.lang.String   provider;
	private java.sql.Timestamp created;

	public NtwkOfferingServiceMap() {}

	public NtwkOfferingServiceMap(
		java.lang.Long     id,
		java.lang.Long     networkOfferingId,
		java.lang.String   service,
		java.lang.String   provider,
		java.sql.Timestamp created
	) {
		this.id = id;
		this.networkOfferingId = networkOfferingId;
		this.service = service;
		this.provider = provider;
		this.created = created;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "network_offering_id", nullable = false, precision = 20)
	public java.lang.Long getNetworkOfferingId() {
		return this.networkOfferingId;
	}

	public void setNetworkOfferingId(java.lang.Long networkOfferingId) {
		this.networkOfferingId = networkOfferingId;
	}

	@javax.persistence.Column(name = "service", nullable = false, length = 255)
	public java.lang.String getService() {
		return this.service;
	}

	public void setService(java.lang.String service) {
		this.service = service;
	}

	@javax.persistence.Column(name = "provider", length = 255)
	public java.lang.String getProvider() {
		return this.provider;
	}

	public void setProvider(java.lang.String provider) {
		this.provider = provider;
	}

	@javax.persistence.Column(name = "created")
	public java.sql.Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(java.sql.Timestamp created) {
		this.created = created;
	}
}
