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
@javax.persistence.Table(name = "op_host_upgrade", schema = "cloud")
public class OpHostUpgrade implements java.io.Serializable {

	private static final long serialVersionUID = -1707872529;

	private java.lang.Long   hostId;
	private java.lang.String version;
	private java.lang.String state;

	public OpHostUpgrade() {}

	public OpHostUpgrade(
		java.lang.Long   hostId,
		java.lang.String version,
		java.lang.String state
	) {
		this.hostId = hostId;
		this.version = version;
		this.state = state;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "host_id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getHostId() {
		return this.hostId;
	}

	public void setHostId(java.lang.Long hostId) {
		this.hostId = hostId;
	}

	@javax.persistence.Column(name = "version", nullable = false, length = 20)
	public java.lang.String getVersion() {
		return this.version;
	}

	public void setVersion(java.lang.String version) {
		this.version = version;
	}

	@javax.persistence.Column(name = "state", nullable = false, length = 20)
	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}
}
