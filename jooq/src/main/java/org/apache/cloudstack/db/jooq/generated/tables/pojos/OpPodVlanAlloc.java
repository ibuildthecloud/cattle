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
@javax.persistence.Table(name = "op_pod_vlan_alloc", schema = "cloud")
public class OpPodVlanAlloc implements java.io.Serializable {

	private static final long serialVersionUID = 321874223;

	private java.lang.Long     id;
	private java.lang.String   vlan;
	private java.lang.Long     dataCenterId;
	private java.lang.Long     podId;
	private java.lang.Long     accountId;
	private java.sql.Timestamp taken;

	public OpPodVlanAlloc() {}

	public OpPodVlanAlloc(
		java.lang.Long     id,
		java.lang.String   vlan,
		java.lang.Long     dataCenterId,
		java.lang.Long     podId,
		java.lang.Long     accountId,
		java.sql.Timestamp taken
	) {
		this.id = id;
		this.vlan = vlan;
		this.dataCenterId = dataCenterId;
		this.podId = podId;
		this.accountId = accountId;
		this.taken = taken;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "vlan", nullable = false, length = 18)
	public java.lang.String getVlan() {
		return this.vlan;
	}

	public void setVlan(java.lang.String vlan) {
		this.vlan = vlan;
	}

	@javax.persistence.Column(name = "data_center_id", nullable = false, precision = 20)
	public java.lang.Long getDataCenterId() {
		return this.dataCenterId;
	}

	public void setDataCenterId(java.lang.Long dataCenterId) {
		this.dataCenterId = dataCenterId;
	}

	@javax.persistence.Column(name = "pod_id", nullable = false, precision = 20)
	public java.lang.Long getPodId() {
		return this.podId;
	}

	public void setPodId(java.lang.Long podId) {
		this.podId = podId;
	}

	@javax.persistence.Column(name = "account_id", precision = 20)
	public java.lang.Long getAccountId() {
		return this.accountId;
	}

	public void setAccountId(java.lang.Long accountId) {
		this.accountId = accountId;
	}

	@javax.persistence.Column(name = "taken")
	public java.sql.Timestamp getTaken() {
		return this.taken;
	}

	public void setTaken(java.sql.Timestamp taken) {
		this.taken = taken;
	}
}
