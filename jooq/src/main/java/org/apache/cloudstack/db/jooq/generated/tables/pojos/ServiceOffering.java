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
@javax.persistence.Table(name = "service_offering", schema = "cloud")
public class ServiceOffering implements java.io.Serializable {

	private static final long serialVersionUID = -1824742434;

	private java.lang.Long    id;
	private java.lang.Integer cpu;
	private java.lang.Integer speed;
	private java.lang.Long    ramSize;
	private java.lang.Short   nwRate;
	private java.lang.Short   mcRate;
	private java.lang.Boolean haEnabled;
	private java.lang.Boolean limitCpuUse;
	private java.lang.String  hostTag;
	private java.lang.Boolean defaultUse;
	private java.lang.String  vmType;
	private java.lang.Integer sortKey;
	private java.lang.Boolean isVolatile;
	private java.lang.String  deploymentPlanner;

	public ServiceOffering() {}

	public ServiceOffering(
		java.lang.Long    id,
		java.lang.Integer cpu,
		java.lang.Integer speed,
		java.lang.Long    ramSize,
		java.lang.Short   nwRate,
		java.lang.Short   mcRate,
		java.lang.Boolean haEnabled,
		java.lang.Boolean limitCpuUse,
		java.lang.String  hostTag,
		java.lang.Boolean defaultUse,
		java.lang.String  vmType,
		java.lang.Integer sortKey,
		java.lang.Boolean isVolatile,
		java.lang.String  deploymentPlanner
	) {
		this.id = id;
		this.cpu = cpu;
		this.speed = speed;
		this.ramSize = ramSize;
		this.nwRate = nwRate;
		this.mcRate = mcRate;
		this.haEnabled = haEnabled;
		this.limitCpuUse = limitCpuUse;
		this.hostTag = hostTag;
		this.defaultUse = defaultUse;
		this.vmType = vmType;
		this.sortKey = sortKey;
		this.isVolatile = isVolatile;
		this.deploymentPlanner = deploymentPlanner;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "cpu", nullable = false, precision = 10)
	public java.lang.Integer getCpu() {
		return this.cpu;
	}

	public void setCpu(java.lang.Integer cpu) {
		this.cpu = cpu;
	}

	@javax.persistence.Column(name = "speed", nullable = false, precision = 10)
	public java.lang.Integer getSpeed() {
		return this.speed;
	}

	public void setSpeed(java.lang.Integer speed) {
		this.speed = speed;
	}

	@javax.persistence.Column(name = "ram_size", nullable = false, precision = 20)
	public java.lang.Long getRamSize() {
		return this.ramSize;
	}

	public void setRamSize(java.lang.Long ramSize) {
		this.ramSize = ramSize;
	}

	@javax.persistence.Column(name = "nw_rate", precision = 5)
	public java.lang.Short getNwRate() {
		return this.nwRate;
	}

	public void setNwRate(java.lang.Short nwRate) {
		this.nwRate = nwRate;
	}

	@javax.persistence.Column(name = "mc_rate", precision = 5)
	public java.lang.Short getMcRate() {
		return this.mcRate;
	}

	public void setMcRate(java.lang.Short mcRate) {
		this.mcRate = mcRate;
	}

	@javax.persistence.Column(name = "ha_enabled", nullable = false, precision = 1)
	public java.lang.Boolean getHaEnabled() {
		return this.haEnabled;
	}

	public void setHaEnabled(java.lang.Boolean haEnabled) {
		this.haEnabled = haEnabled;
	}

	@javax.persistence.Column(name = "limit_cpu_use", nullable = false, precision = 1)
	public java.lang.Boolean getLimitCpuUse() {
		return this.limitCpuUse;
	}

	public void setLimitCpuUse(java.lang.Boolean limitCpuUse) {
		this.limitCpuUse = limitCpuUse;
	}

	@javax.persistence.Column(name = "host_tag", length = 255)
	public java.lang.String getHostTag() {
		return this.hostTag;
	}

	public void setHostTag(java.lang.String hostTag) {
		this.hostTag = hostTag;
	}

	@javax.persistence.Column(name = "default_use", nullable = false, precision = 1)
	public java.lang.Boolean getDefaultUse() {
		return this.defaultUse;
	}

	public void setDefaultUse(java.lang.Boolean defaultUse) {
		this.defaultUse = defaultUse;
	}

	@javax.persistence.Column(name = "vm_type", length = 32)
	public java.lang.String getVmType() {
		return this.vmType;
	}

	public void setVmType(java.lang.String vmType) {
		this.vmType = vmType;
	}

	@javax.persistence.Column(name = "sort_key", nullable = false, precision = 10)
	public java.lang.Integer getSortKey() {
		return this.sortKey;
	}

	public void setSortKey(java.lang.Integer sortKey) {
		this.sortKey = sortKey;
	}

	@javax.persistence.Column(name = "is_volatile", nullable = false, precision = 1)
	public java.lang.Boolean getIsVolatile() {
		return this.isVolatile;
	}

	public void setIsVolatile(java.lang.Boolean isVolatile) {
		this.isVolatile = isVolatile;
	}

	@javax.persistence.Column(name = "deployment_planner", length = 255)
	public java.lang.String getDeploymentPlanner() {
		return this.deploymentPlanner;
	}

	public void setDeploymentPlanner(java.lang.String deploymentPlanner) {
		this.deploymentPlanner = deploymentPlanner;
	}
}
