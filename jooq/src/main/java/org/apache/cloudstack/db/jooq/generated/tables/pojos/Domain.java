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
@javax.persistence.Table(name = "domain", schema = "cloud", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"parent", "name", "removed"})
})
public class Domain implements java.io.Serializable {

	private static final long serialVersionUID = -477545811;

	private java.lang.Long     id;
	private java.lang.Long     parent;
	private java.lang.String   name;
	private java.lang.String   uuid;
	private java.lang.Long     owner;
	private java.lang.String   path;
	private java.lang.Integer  level;
	private java.lang.Integer  childCount;
	private java.lang.Long     nextChildSeq;
	private java.sql.Timestamp removed;
	private java.lang.String   state;
	private java.lang.String   networkDomain;
	private java.lang.String   type;

	public Domain() {}

	public Domain(
		java.lang.Long     id,
		java.lang.Long     parent,
		java.lang.String   name,
		java.lang.String   uuid,
		java.lang.Long     owner,
		java.lang.String   path,
		java.lang.Integer  level,
		java.lang.Integer  childCount,
		java.lang.Long     nextChildSeq,
		java.sql.Timestamp removed,
		java.lang.String   state,
		java.lang.String   networkDomain,
		java.lang.String   type
	) {
		this.id = id;
		this.parent = parent;
		this.name = name;
		this.uuid = uuid;
		this.owner = owner;
		this.path = path;
		this.level = level;
		this.childCount = childCount;
		this.nextChildSeq = nextChildSeq;
		this.removed = removed;
		this.state = state;
		this.networkDomain = networkDomain;
		this.type = type;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "parent", precision = 20)
	public java.lang.Long getParent() {
		return this.parent;
	}

	public void setParent(java.lang.Long parent) {
		this.parent = parent;
	}

	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	@javax.persistence.Column(name = "uuid", unique = true, length = 40)
	public java.lang.String getUuid() {
		return this.uuid;
	}

	public void setUuid(java.lang.String uuid) {
		this.uuid = uuid;
	}

	@javax.persistence.Column(name = "owner", nullable = false, precision = 20)
	public java.lang.Long getOwner() {
		return this.owner;
	}

	public void setOwner(java.lang.Long owner) {
		this.owner = owner;
	}

	@javax.persistence.Column(name = "path", nullable = false, length = 255)
	public java.lang.String getPath() {
		return this.path;
	}

	public void setPath(java.lang.String path) {
		this.path = path;
	}

	@javax.persistence.Column(name = "level", nullable = false, precision = 10)
	public java.lang.Integer getLevel() {
		return this.level;
	}

	public void setLevel(java.lang.Integer level) {
		this.level = level;
	}

	@javax.persistence.Column(name = "child_count", nullable = false, precision = 10)
	public java.lang.Integer getChildCount() {
		return this.childCount;
	}

	public void setChildCount(java.lang.Integer childCount) {
		this.childCount = childCount;
	}

	@javax.persistence.Column(name = "next_child_seq", nullable = false, precision = 20)
	public java.lang.Long getNextChildSeq() {
		return this.nextChildSeq;
	}

	public void setNextChildSeq(java.lang.Long nextChildSeq) {
		this.nextChildSeq = nextChildSeq;
	}

	@javax.persistence.Column(name = "removed")
	public java.sql.Timestamp getRemoved() {
		return this.removed;
	}

	public void setRemoved(java.sql.Timestamp removed) {
		this.removed = removed;
	}

	@javax.persistence.Column(name = "state", nullable = false, length = 32)
	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	@javax.persistence.Column(name = "network_domain", length = 255)
	public java.lang.String getNetworkDomain() {
		return this.networkDomain;
	}

	public void setNetworkDomain(java.lang.String networkDomain) {
		this.networkDomain = networkDomain;
	}

	@javax.persistence.Column(name = "type", nullable = false, length = 255)
	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}
}
