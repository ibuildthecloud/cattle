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
@javax.persistence.Table(name = "affinity_group_view", schema = "cloud")
public class AffinityGroupView implements java.io.Serializable {

	private static final long serialVersionUID = -885407316;

	private java.lang.Long    id;
	private java.lang.String  name;
	private java.lang.String  type;
	private java.lang.String  description;
	private java.lang.String  uuid;
	private java.lang.String  aclType;
	private java.lang.Long    accountId;
	private java.lang.String  accountUuid;
	private java.lang.String  accountName;
	private java.lang.Integer accountType;
	private java.lang.Long    domainId;
	private java.lang.String  domainUuid;
	private java.lang.String  domainName;
	private java.lang.String  domainPath;
	private java.lang.Long    vmId;
	private java.lang.String  vmUuid;
	private java.lang.String  vmName;
	private java.lang.String  vmState;
	private java.lang.String  vmDisplayName;

	public AffinityGroupView() {}

	public AffinityGroupView(
		java.lang.Long    id,
		java.lang.String  name,
		java.lang.String  type,
		java.lang.String  description,
		java.lang.String  uuid,
		java.lang.String  aclType,
		java.lang.Long    accountId,
		java.lang.String  accountUuid,
		java.lang.String  accountName,
		java.lang.Integer accountType,
		java.lang.Long    domainId,
		java.lang.String  domainUuid,
		java.lang.String  domainName,
		java.lang.String  domainPath,
		java.lang.Long    vmId,
		java.lang.String  vmUuid,
		java.lang.String  vmName,
		java.lang.String  vmState,
		java.lang.String  vmDisplayName
	) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.description = description;
		this.uuid = uuid;
		this.aclType = aclType;
		this.accountId = accountId;
		this.accountUuid = accountUuid;
		this.accountName = accountName;
		this.accountType = accountType;
		this.domainId = domainId;
		this.domainUuid = domainUuid;
		this.domainName = domainName;
		this.domainPath = domainPath;
		this.vmId = vmId;
		this.vmUuid = vmUuid;
		this.vmName = vmName;
		this.vmState = vmState;
		this.vmDisplayName = vmDisplayName;
	}

	@javax.persistence.Column(name = "id", nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "name", nullable = false, length = 255)
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	@javax.persistence.Column(name = "type", nullable = false, length = 255)
	public java.lang.String getType() {
		return this.type;
	}

	public void setType(java.lang.String type) {
		this.type = type;
	}

	@javax.persistence.Column(name = "description", length = 4096)
	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	@javax.persistence.Column(name = "uuid", length = 40)
	public java.lang.String getUuid() {
		return this.uuid;
	}

	public void setUuid(java.lang.String uuid) {
		this.uuid = uuid;
	}

	@javax.persistence.Column(name = "acl_type", nullable = false, length = 15)
	public java.lang.String getAclType() {
		return this.aclType;
	}

	public void setAclType(java.lang.String aclType) {
		this.aclType = aclType;
	}

	@javax.persistence.Column(name = "account_id", nullable = false, precision = 20)
	public java.lang.Long getAccountId() {
		return this.accountId;
	}

	public void setAccountId(java.lang.Long accountId) {
		this.accountId = accountId;
	}

	@javax.persistence.Column(name = "account_uuid", length = 40)
	public java.lang.String getAccountUuid() {
		return this.accountUuid;
	}

	public void setAccountUuid(java.lang.String accountUuid) {
		this.accountUuid = accountUuid;
	}

	@javax.persistence.Column(name = "account_name", length = 100)
	public java.lang.String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(java.lang.String accountName) {
		this.accountName = accountName;
	}

	@javax.persistence.Column(name = "account_type", nullable = false, precision = 10)
	public java.lang.Integer getAccountType() {
		return this.accountType;
	}

	public void setAccountType(java.lang.Integer accountType) {
		this.accountType = accountType;
	}

	@javax.persistence.Column(name = "domain_id", nullable = false, precision = 20)
	public java.lang.Long getDomainId() {
		return this.domainId;
	}

	public void setDomainId(java.lang.Long domainId) {
		this.domainId = domainId;
	}

	@javax.persistence.Column(name = "domain_uuid", length = 40)
	public java.lang.String getDomainUuid() {
		return this.domainUuid;
	}

	public void setDomainUuid(java.lang.String domainUuid) {
		this.domainUuid = domainUuid;
	}

	@javax.persistence.Column(name = "domain_name", length = 255)
	public java.lang.String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(java.lang.String domainName) {
		this.domainName = domainName;
	}

	@javax.persistence.Column(name = "domain_path", nullable = false, length = 255)
	public java.lang.String getDomainPath() {
		return this.domainPath;
	}

	public void setDomainPath(java.lang.String domainPath) {
		this.domainPath = domainPath;
	}

	@javax.persistence.Column(name = "vm_id", precision = 20)
	public java.lang.Long getVmId() {
		return this.vmId;
	}

	public void setVmId(java.lang.Long vmId) {
		this.vmId = vmId;
	}

	@javax.persistence.Column(name = "vm_uuid", length = 40)
	public java.lang.String getVmUuid() {
		return this.vmUuid;
	}

	public void setVmUuid(java.lang.String vmUuid) {
		this.vmUuid = vmUuid;
	}

	@javax.persistence.Column(name = "vm_name", length = 255)
	public java.lang.String getVmName() {
		return this.vmName;
	}

	public void setVmName(java.lang.String vmName) {
		this.vmName = vmName;
	}

	@javax.persistence.Column(name = "vm_state", length = 32)
	public java.lang.String getVmState() {
		return this.vmState;
	}

	public void setVmState(java.lang.String vmState) {
		this.vmState = vmState;
	}

	@javax.persistence.Column(name = "vm_display_name", length = 255)
	public java.lang.String getVmDisplayName() {
		return this.vmDisplayName;
	}

	public void setVmDisplayName(java.lang.String vmDisplayName) {
		this.vmDisplayName = vmDisplayName;
	}
}
