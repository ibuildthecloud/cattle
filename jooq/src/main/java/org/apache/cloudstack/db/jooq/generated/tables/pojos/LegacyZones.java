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
@javax.persistence.Table(name = "legacy_zones", schema = "cloud")
public class LegacyZones implements java.io.Serializable {

	private static final long serialVersionUID = -230409909;

	private java.lang.Long id;
	private java.lang.Long zoneId;

	public LegacyZones() {}

	public LegacyZones(
		java.lang.Long id,
		java.lang.Long zoneId
	) {
		this.id = id;
		this.zoneId = zoneId;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "zone_id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(java.lang.Long zoneId) {
		this.zoneId = zoneId;
	}
}
