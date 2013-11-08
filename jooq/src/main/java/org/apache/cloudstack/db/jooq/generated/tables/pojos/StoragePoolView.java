/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "storage_pool_view", schema = "cloud")
public class StoragePoolView implements java.io.Serializable {

	private static final long serialVersionUID = -1129625184;

	private java.lang.Long     id;
	private java.lang.String   uuid;
	private java.lang.String   name;
	private java.lang.String   status;
	private java.lang.String   path;
	private java.lang.String   poolType;
	private java.lang.String   hostAddress;
	private java.sql.Timestamp created;
	private java.sql.Timestamp removed;
	private java.lang.Long     capacityBytes;
	private java.lang.Long     capacityIops;
	private java.lang.String   scope;
	private java.lang.String   hypervisor;
	private java.lang.String   storageProviderName;
	private java.lang.Long     clusterId;
	private java.lang.String   clusterUuid;
	private java.lang.String   clusterName;
	private java.lang.String   clusterType;
	private java.lang.Long     dataCenterId;
	private java.lang.String   dataCenterUuid;
	private java.lang.String   dataCenterName;
	private java.lang.String   dataCenterType;
	private java.lang.Long     podId;
	private java.lang.String   podUuid;
	private java.lang.String   podName;
	private java.lang.String   tag;
	private java.lang.Long     diskUsedCapacity;
	private java.lang.Long     diskReservedCapacity;
	private java.lang.Long     jobId;
	private java.lang.String   jobUuid;
	private java.lang.Integer  jobStatus;
	private java.lang.Long     jobAccountId;

	public StoragePoolView() {}

	public StoragePoolView(
		java.lang.Long     id,
		java.lang.String   uuid,
		java.lang.String   name,
		java.lang.String   status,
		java.lang.String   path,
		java.lang.String   poolType,
		java.lang.String   hostAddress,
		java.sql.Timestamp created,
		java.sql.Timestamp removed,
		java.lang.Long     capacityBytes,
		java.lang.Long     capacityIops,
		java.lang.String   scope,
		java.lang.String   hypervisor,
		java.lang.String   storageProviderName,
		java.lang.Long     clusterId,
		java.lang.String   clusterUuid,
		java.lang.String   clusterName,
		java.lang.String   clusterType,
		java.lang.Long     dataCenterId,
		java.lang.String   dataCenterUuid,
		java.lang.String   dataCenterName,
		java.lang.String   dataCenterType,
		java.lang.Long     podId,
		java.lang.String   podUuid,
		java.lang.String   podName,
		java.lang.String   tag,
		java.lang.Long     diskUsedCapacity,
		java.lang.Long     diskReservedCapacity,
		java.lang.Long     jobId,
		java.lang.String   jobUuid,
		java.lang.Integer  jobStatus,
		java.lang.Long     jobAccountId
	) {
		this.id = id;
		this.uuid = uuid;
		this.name = name;
		this.status = status;
		this.path = path;
		this.poolType = poolType;
		this.hostAddress = hostAddress;
		this.created = created;
		this.removed = removed;
		this.capacityBytes = capacityBytes;
		this.capacityIops = capacityIops;
		this.scope = scope;
		this.hypervisor = hypervisor;
		this.storageProviderName = storageProviderName;
		this.clusterId = clusterId;
		this.clusterUuid = clusterUuid;
		this.clusterName = clusterName;
		this.clusterType = clusterType;
		this.dataCenterId = dataCenterId;
		this.dataCenterUuid = dataCenterUuid;
		this.dataCenterName = dataCenterName;
		this.dataCenterType = dataCenterType;
		this.podId = podId;
		this.podUuid = podUuid;
		this.podName = podName;
		this.tag = tag;
		this.diskUsedCapacity = diskUsedCapacity;
		this.diskReservedCapacity = diskReservedCapacity;
		this.jobId = jobId;
		this.jobUuid = jobUuid;
		this.jobStatus = jobStatus;
		this.jobAccountId = jobAccountId;
	}

	@javax.persistence.Column(name = "id", nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "uuid", length = 255)
	public java.lang.String getUuid() {
		return this.uuid;
	}

	public void setUuid(java.lang.String uuid) {
		this.uuid = uuid;
	}

	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	@javax.persistence.Column(name = "status", length = 32)
	public java.lang.String getStatus() {
		return this.status;
	}

	public void setStatus(java.lang.String status) {
		this.status = status;
	}

	@javax.persistence.Column(name = "path", nullable = false, length = 255)
	public java.lang.String getPath() {
		return this.path;
	}

	public void setPath(java.lang.String path) {
		this.path = path;
	}

	@javax.persistence.Column(name = "pool_type", nullable = false, length = 32)
	public java.lang.String getPoolType() {
		return this.poolType;
	}

	public void setPoolType(java.lang.String poolType) {
		this.poolType = poolType;
	}

	@javax.persistence.Column(name = "host_address", nullable = false, length = 255)
	public java.lang.String getHostAddress() {
		return this.hostAddress;
	}

	public void setHostAddress(java.lang.String hostAddress) {
		this.hostAddress = hostAddress;
	}

	@javax.persistence.Column(name = "created")
	public java.sql.Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(java.sql.Timestamp created) {
		this.created = created;
	}

	@javax.persistence.Column(name = "removed")
	public java.sql.Timestamp getRemoved() {
		return this.removed;
	}

	public void setRemoved(java.sql.Timestamp removed) {
		this.removed = removed;
	}

	@javax.persistence.Column(name = "capacity_bytes", precision = 20)
	public java.lang.Long getCapacityBytes() {
		return this.capacityBytes;
	}

	public void setCapacityBytes(java.lang.Long capacityBytes) {
		this.capacityBytes = capacityBytes;
	}

	@javax.persistence.Column(name = "capacity_iops", precision = 20)
	public java.lang.Long getCapacityIops() {
		return this.capacityIops;
	}

	public void setCapacityIops(java.lang.Long capacityIops) {
		this.capacityIops = capacityIops;
	}

	@javax.persistence.Column(name = "scope", length = 255)
	public java.lang.String getScope() {
		return this.scope;
	}

	public void setScope(java.lang.String scope) {
		this.scope = scope;
	}

	@javax.persistence.Column(name = "hypervisor", length = 32)
	public java.lang.String getHypervisor() {
		return this.hypervisor;
	}

	public void setHypervisor(java.lang.String hypervisor) {
		this.hypervisor = hypervisor;
	}

	@javax.persistence.Column(name = "storage_provider_name", length = 255)
	public java.lang.String getStorageProviderName() {
		return this.storageProviderName;
	}

	public void setStorageProviderName(java.lang.String storageProviderName) {
		this.storageProviderName = storageProviderName;
	}

	@javax.persistence.Column(name = "cluster_id", precision = 20)
	public java.lang.Long getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(java.lang.Long clusterId) {
		this.clusterId = clusterId;
	}

	@javax.persistence.Column(name = "cluster_uuid", length = 40)
	public java.lang.String getClusterUuid() {
		return this.clusterUuid;
	}

	public void setClusterUuid(java.lang.String clusterUuid) {
		this.clusterUuid = clusterUuid;
	}

	@javax.persistence.Column(name = "cluster_name", length = 255)
	public java.lang.String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(java.lang.String clusterName) {
		this.clusterName = clusterName;
	}

	@javax.persistence.Column(name = "cluster_type", length = 64)
	public java.lang.String getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(java.lang.String clusterType) {
		this.clusterType = clusterType;
	}

	@javax.persistence.Column(name = "data_center_id", precision = 20)
	public java.lang.Long getDataCenterId() {
		return this.dataCenterId;
	}

	public void setDataCenterId(java.lang.Long dataCenterId) {
		this.dataCenterId = dataCenterId;
	}

	@javax.persistence.Column(name = "data_center_uuid", length = 40)
	public java.lang.String getDataCenterUuid() {
		return this.dataCenterUuid;
	}

	public void setDataCenterUuid(java.lang.String dataCenterUuid) {
		this.dataCenterUuid = dataCenterUuid;
	}

	@javax.persistence.Column(name = "data_center_name", length = 255)
	public java.lang.String getDataCenterName() {
		return this.dataCenterName;
	}

	public void setDataCenterName(java.lang.String dataCenterName) {
		this.dataCenterName = dataCenterName;
	}

	@javax.persistence.Column(name = "data_center_type", length = 255)
	public java.lang.String getDataCenterType() {
		return this.dataCenterType;
	}

	public void setDataCenterType(java.lang.String dataCenterType) {
		this.dataCenterType = dataCenterType;
	}

	@javax.persistence.Column(name = "pod_id", precision = 20)
	public java.lang.Long getPodId() {
		return this.podId;
	}

	public void setPodId(java.lang.Long podId) {
		this.podId = podId;
	}

	@javax.persistence.Column(name = "pod_uuid", length = 40)
	public java.lang.String getPodUuid() {
		return this.podUuid;
	}

	public void setPodUuid(java.lang.String podUuid) {
		this.podUuid = podUuid;
	}

	@javax.persistence.Column(name = "pod_name", length = 255)
	public java.lang.String getPodName() {
		return this.podName;
	}

	public void setPodName(java.lang.String podName) {
		this.podName = podName;
	}

	@javax.persistence.Column(name = "tag", length = 255)
	public java.lang.String getTag() {
		return this.tag;
	}

	public void setTag(java.lang.String tag) {
		this.tag = tag;
	}

	@javax.persistence.Column(name = "disk_used_capacity", precision = 19)
	public java.lang.Long getDiskUsedCapacity() {
		return this.diskUsedCapacity;
	}

	public void setDiskUsedCapacity(java.lang.Long diskUsedCapacity) {
		this.diskUsedCapacity = diskUsedCapacity;
	}

	@javax.persistence.Column(name = "disk_reserved_capacity", precision = 19)
	public java.lang.Long getDiskReservedCapacity() {
		return this.diskReservedCapacity;
	}

	public void setDiskReservedCapacity(java.lang.Long diskReservedCapacity) {
		this.diskReservedCapacity = diskReservedCapacity;
	}

	@javax.persistence.Column(name = "job_id", precision = 20)
	public java.lang.Long getJobId() {
		return this.jobId;
	}

	public void setJobId(java.lang.Long jobId) {
		this.jobId = jobId;
	}

	@javax.persistence.Column(name = "job_uuid", length = 40)
	public java.lang.String getJobUuid() {
		return this.jobUuid;
	}

	public void setJobUuid(java.lang.String jobUuid) {
		this.jobUuid = jobUuid;
	}

	@javax.persistence.Column(name = "job_status", precision = 10)
	public java.lang.Integer getJobStatus() {
		return this.jobStatus;
	}

	public void setJobStatus(java.lang.Integer jobStatus) {
		this.jobStatus = jobStatus;
	}

	@javax.persistence.Column(name = "job_account_id", precision = 20)
	public java.lang.Long getJobAccountId() {
		return this.jobAccountId;
	}

	public void setJobAccountId(java.lang.Long jobAccountId) {
		this.jobAccountId = jobAccountId;
	}
}
