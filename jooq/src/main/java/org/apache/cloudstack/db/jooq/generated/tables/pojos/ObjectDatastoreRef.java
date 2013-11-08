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
@javax.persistence.Table(name = "object_datastore_ref", schema = "cloud")
public class ObjectDatastoreRef implements java.io.Serializable {

	private static final long serialVersionUID = 953827580;

	private java.lang.Long     id;
	private java.lang.String   datastoreUuid;
	private java.lang.String   datastoreRole;
	private java.lang.String   objectUuid;
	private java.lang.String   objectType;
	private java.sql.Timestamp created;
	private java.sql.Timestamp lastUpdated;
	private java.lang.String   jobId;
	private java.lang.Integer  downloadPct;
	private java.lang.String   downloadState;
	private java.lang.String   url;
	private java.lang.String   format;
	private java.lang.String   checksum;
	private java.lang.String   errorStr;
	private java.lang.String   localPath;
	private java.lang.String   installPath;
	private java.lang.Long     size;
	private java.lang.String   state;
	private java.lang.Long     updateCount;
	private java.sql.Timestamp updated;

	public ObjectDatastoreRef() {}

	public ObjectDatastoreRef(
		java.lang.Long     id,
		java.lang.String   datastoreUuid,
		java.lang.String   datastoreRole,
		java.lang.String   objectUuid,
		java.lang.String   objectType,
		java.sql.Timestamp created,
		java.sql.Timestamp lastUpdated,
		java.lang.String   jobId,
		java.lang.Integer  downloadPct,
		java.lang.String   downloadState,
		java.lang.String   url,
		java.lang.String   format,
		java.lang.String   checksum,
		java.lang.String   errorStr,
		java.lang.String   localPath,
		java.lang.String   installPath,
		java.lang.Long     size,
		java.lang.String   state,
		java.lang.Long     updateCount,
		java.sql.Timestamp updated
	) {
		this.id = id;
		this.datastoreUuid = datastoreUuid;
		this.datastoreRole = datastoreRole;
		this.objectUuid = objectUuid;
		this.objectType = objectType;
		this.created = created;
		this.lastUpdated = lastUpdated;
		this.jobId = jobId;
		this.downloadPct = downloadPct;
		this.downloadState = downloadState;
		this.url = url;
		this.format = format;
		this.checksum = checksum;
		this.errorStr = errorStr;
		this.localPath = localPath;
		this.installPath = installPath;
		this.size = size;
		this.state = state;
		this.updateCount = updateCount;
		this.updated = updated;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "datastore_uuid", nullable = false, length = 255)
	public java.lang.String getDatastoreUuid() {
		return this.datastoreUuid;
	}

	public void setDatastoreUuid(java.lang.String datastoreUuid) {
		this.datastoreUuid = datastoreUuid;
	}

	@javax.persistence.Column(name = "datastore_role", nullable = false, length = 255)
	public java.lang.String getDatastoreRole() {
		return this.datastoreRole;
	}

	public void setDatastoreRole(java.lang.String datastoreRole) {
		this.datastoreRole = datastoreRole;
	}

	@javax.persistence.Column(name = "object_uuid", nullable = false, length = 255)
	public java.lang.String getObjectUuid() {
		return this.objectUuid;
	}

	public void setObjectUuid(java.lang.String objectUuid) {
		this.objectUuid = objectUuid;
	}

	@javax.persistence.Column(name = "object_type", nullable = false, length = 255)
	public java.lang.String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(java.lang.String objectType) {
		this.objectType = objectType;
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

	@javax.persistence.Column(name = "download_pct", precision = 10)
	public java.lang.Integer getDownloadPct() {
		return this.downloadPct;
	}

	public void setDownloadPct(java.lang.Integer downloadPct) {
		this.downloadPct = downloadPct;
	}

	@javax.persistence.Column(name = "download_state", length = 255)
	public java.lang.String getDownloadState() {
		return this.downloadState;
	}

	public void setDownloadState(java.lang.String downloadState) {
		this.downloadState = downloadState;
	}

	@javax.persistence.Column(name = "url", length = 255)
	public java.lang.String getUrl() {
		return this.url;
	}

	public void setUrl(java.lang.String url) {
		this.url = url;
	}

	@javax.persistence.Column(name = "format", length = 255)
	public java.lang.String getFormat() {
		return this.format;
	}

	public void setFormat(java.lang.String format) {
		this.format = format;
	}

	@javax.persistence.Column(name = "checksum", length = 255)
	public java.lang.String getChecksum() {
		return this.checksum;
	}

	public void setChecksum(java.lang.String checksum) {
		this.checksum = checksum;
	}

	@javax.persistence.Column(name = "error_str", length = 255)
	public java.lang.String getErrorStr() {
		return this.errorStr;
	}

	public void setErrorStr(java.lang.String errorStr) {
		this.errorStr = errorStr;
	}

	@javax.persistence.Column(name = "local_path", length = 255)
	public java.lang.String getLocalPath() {
		return this.localPath;
	}

	public void setLocalPath(java.lang.String localPath) {
		this.localPath = localPath;
	}

	@javax.persistence.Column(name = "install_path", length = 255)
	public java.lang.String getInstallPath() {
		return this.installPath;
	}

	public void setInstallPath(java.lang.String installPath) {
		this.installPath = installPath;
	}

	@javax.persistence.Column(name = "size", precision = 20)
	public java.lang.Long getSize() {
		return this.size;
	}

	public void setSize(java.lang.Long size) {
		this.size = size;
	}

	@javax.persistence.Column(name = "state", nullable = false, length = 255)
	public java.lang.String getState() {
		return this.state;
	}

	public void setState(java.lang.String state) {
		this.state = state;
	}

	@javax.persistence.Column(name = "update_count", nullable = false, precision = 20)
	public java.lang.Long getUpdateCount() {
		return this.updateCount;
	}

	public void setUpdateCount(java.lang.Long updateCount) {
		this.updateCount = updateCount;
	}

	@javax.persistence.Column(name = "updated")
	public java.sql.Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(java.sql.Timestamp updated) {
		this.updated = updated;
	}
}
