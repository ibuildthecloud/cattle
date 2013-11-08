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
@javax.persistence.Table(name = "load_balancer_vm_map", schema = "cloud", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"load_balancer_id", "instance_id"})
})
public class LoadBalancerVmMap implements java.io.Serializable {

	private static final long serialVersionUID = -1587895409;

	private java.lang.Long    id;
	private java.lang.Long    loadBalancerId;
	private java.lang.Long    instanceId;
	private java.lang.Boolean revoke;
	private java.lang.String  state;

	public LoadBalancerVmMap() {}

	public LoadBalancerVmMap(
		java.lang.Long    id,
		java.lang.Long    loadBalancerId,
		java.lang.Long    instanceId,
		java.lang.Boolean revoke,
		java.lang.String  state
	) {
		this.id = id;
		this.loadBalancerId = loadBalancerId;
		this.instanceId = instanceId;
		this.revoke = revoke;
		this.state = state;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "load_balancer_id", nullable = false, precision = 20)
	public java.lang.Long getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(java.lang.Long loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
	}

	@javax.persistence.Column(name = "instance_id", nullable = false, precision = 20)
	public java.lang.Long getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(java.lang.Long instanceId) {
		this.instanceId = instanceId;
	}

	@javax.persistence.Column(name = "revoke", nullable = false, precision = 1)
	public java.lang.Boolean getRevoke() {
		return this.revoke;
	}

	public void setRevoke(java.lang.Boolean revoke) {
		this.revoke = revoke;
	}

	@javax.persistence.Column(name = "state", length = 40)
	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}
}
