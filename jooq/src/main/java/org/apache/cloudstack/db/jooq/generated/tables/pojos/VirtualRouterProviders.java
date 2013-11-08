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
@javax.persistence.Table(name = "virtual_router_providers", schema = "cloud")
public class VirtualRouterProviders implements java.io.Serializable {

	private static final long serialVersionUID = -520012081;

	private java.lang.Long     id;
	private java.lang.Long     nspId;
	private java.lang.String   uuid;
	private java.lang.String   type;
	private java.lang.Integer  enabled;
	private java.sql.Timestamp removed;

	public VirtualRouterProviders() {}

	public VirtualRouterProviders(
		java.lang.Long     id,
		java.lang.Long     nspId,
		java.lang.String   uuid,
		java.lang.String   type,
		java.lang.Integer  enabled,
		java.sql.Timestamp removed
	) {
		this.id = id;
		this.nspId = nspId;
		this.uuid = uuid;
		this.type = type;
		this.enabled = enabled;
		this.removed = removed;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "nsp_id", nullable = false, precision = 20)
	public java.lang.Long getNspId() {
		return this.nspId;
	}

	public void setNspId(java.lang.Long nspId) {
		this.nspId = nspId;
	}

	@javax.persistence.Column(name = "uuid", unique = true, length = 40)
	public java.lang.String getUuid() {
		return this.uuid;
	}

	public void setUuid(java.lang.String uuid) {
		this.uuid = uuid;
	}

	@javax.persistence.Column(name = "type", nullable = false, length = 255)
	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	@javax.persistence.Column(name = "enabled", nullable = false, precision = 10)
	public java.lang.Integer getEnabled() {
		return this.enabled;
	}

	public void setEnabled(java.lang.Integer enabled) {
		this.enabled = enabled;
	}

	@javax.persistence.Column(name = "removed")
	public java.sql.Timestamp getRemoved() {
		return this.removed;
	}

	public void setRemoved(java.sql.Timestamp removed) {
		this.removed = removed;
	}
}
