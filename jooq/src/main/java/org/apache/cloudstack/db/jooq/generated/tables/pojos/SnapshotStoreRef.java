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
@javax.persistence.Table(name = "snapshot_store_ref", schema = "cloud")
public class SnapshotStoreRef implements java.io.Serializable {

	private static final long serialVersionUID = -1401632214;

	private java.lang.Long     id;
	private java.lang.Long     storeId;
	private java.lang.Long     snapshotId;
	private java.sql.Timestamp created;
	private java.sql.Timestamp lastUpdated;
	private java.lang.String   jobId;
	private java.lang.String   storeRole;
	private java.lang.Long     size;
	private java.lang.Long     physicalSize;
	private java.lang.Long     parentSnapshotId;
	private java.lang.String   installPath;
	private java.lang.String   state;
	private java.lang.Long     updateCount;
	private java.lang.Long     refCnt;
	private java.sql.Timestamp updated;
	private java.lang.Long     volumeId;

	public SnapshotStoreRef() {}

	public SnapshotStoreRef(
		java.lang.Long     id,
		java.lang.Long     storeId,
		java.lang.Long     snapshotId,
		java.sql.Timestamp created,
		java.sql.Timestamp lastUpdated,
		java.lang.String   jobId,
		java.lang.String   storeRole,
		java.lang.Long     size,
		java.lang.Long     physicalSize,
		java.lang.Long     parentSnapshotId,
		java.lang.String   installPath,
		java.lang.String   state,
		java.lang.Long     updateCount,
		java.lang.Long     refCnt,
		java.sql.Timestamp updated,
		java.lang.Long     volumeId
	) {
		this.id = id;
		this.storeId = storeId;
		this.snapshotId = snapshotId;
		this.created = created;
		this.lastUpdated = lastUpdated;
		this.jobId = jobId;
		this.storeRole = storeRole;
		this.size = size;
		this.physicalSize = physicalSize;
		this.parentSnapshotId = parentSnapshotId;
		this.installPath = installPath;
		this.state = state;
		this.updateCount = updateCount;
		this.refCnt = refCnt;
		this.updated = updated;
		this.volumeId = volumeId;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "store_id", nullable = false, precision = 20)
	public java.lang.Long getStoreId() {
		return this.storeId;
	}

	public void setStoreId(java.lang.Long storeId) {
		this.storeId = storeId;
	}

	@javax.persistence.Column(name = "snapshot_id", nullable = false, precision = 20)
	public java.lang.Long getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(java.lang.Long snapshotId) {
		this.snapshotId = snapshotId;
	}

	@javax.persistence.Column(name = "created", nullable = false)
	public java.sql.Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(java.sql.Timestamp created) {
		this.created = created;
	}

	@javax.persistence.Column(name = "last_updated")
	public java.sql.Timestamp getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(java.sql.Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@javax.persistence.Column(name = "job_id", length = 255)
	public java.lang.String getJobId() {
		return this.jobId;
	}

	public void setJobId(java.lang.String jobId) {
		this.jobId = jobId;
	}

	@javax.persistence.Column(name = "store_role", length = 255)
	public java.lang.String getStoreRole() {
		return this.storeRole;
	}

	public void setStoreRole(java.lang.String storeRole) {
		this.storeRole = storeRole;
	}

	@javax.persistence.Column(name = "size", precision = 20)
	public java.lang.Long getSize() {
		return this.size;
	}

	public void setSize(java.lang.Long size) {
		this.size = size;
	}

	@javax.persistence.Column(name = "physical_size", precision = 20)
	public java.lang.Long getPhysicalSize() {
		return this.physicalSize;
	}

	public void setPhysicalSize(java.lang.Long physicalSize) {
		this.physicalSize = physicalSize;
	}

	@javax.persistence.Column(name = "parent_snapshot_id", precision = 20)
	public java.lang.Long getParentSnapshotId() {
		return this.parentSnapshotId;
	}

	public void setParentSnapshotId(java.lang.Long parentSnapshotId) {
		this.parentSnapshotId = parentSnapshotId;
	}

	@javax.persistence.Column(name = "install_path", length = 255)
	public java.lang.String getInstallPath() {
		return this.installPath;
	}

	public void setInstallPath(java.lang.String installPath) {
		this.installPath = installPath;
	}

	@javax.persistence.Column(name = "state", nullable = false, length = 255)
	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	@javax.persistence.Column(name = "update_count", precision = 20)
	public java.lang.Long getUpdateCount() {
		return this.updateCount;
	}

	public void setUpdateCount(java.lang.Long updateCount) {
		this.updateCount = updateCount;
	}

	@javax.persistence.Column(name = "ref_cnt", precision = 20)
	public java.lang.Long getRefCnt() {
		return this.refCnt;
	}

	public void setRefCnt(java.lang.Long refCnt) {
		this.refCnt = refCnt;
	}

	@javax.persistence.Column(name = "updated")
	public java.sql.Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(java.sql.Timestamp updated) {
		this.updated = updated;
	}

	@javax.persistence.Column(name = "volume_id", precision = 20)
	public java.lang.Long getVolumeId() {
		return this.volumeId;
	}

	public void setVolumeId(java.lang.Long volumeId) {
		this.volumeId = volumeId;
	}
}
