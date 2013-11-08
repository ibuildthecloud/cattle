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
@javax.persistence.Table(name = "autoscale_vmprofiles", schema = "cloud")
public class AutoscaleVmprofiles implements java.io.Serializable {

	private static final long serialVersionUID = -957814544;

	private java.lang.Long     id;
	private java.lang.String   uuid;
	private java.lang.Long     zoneId;
	private java.lang.Long     domainId;
	private java.lang.Long     accountId;
	private java.lang.Long     autoscaleUserId;
	private java.lang.Long     serviceOfferingId;
	private java.lang.Long     templateId;
	private java.lang.String   otherDeployParams;
	private java.lang.Integer  destroyVmGracePeriod;
	private java.lang.String   counterParams;
	private java.sql.Timestamp created;
	private java.sql.Timestamp removed;

	public AutoscaleVmprofiles() {}

	public AutoscaleVmprofiles(
		java.lang.Long     id,
		java.lang.String   uuid,
		java.lang.Long     zoneId,
		java.lang.Long     domainId,
		java.lang.Long     accountId,
		java.lang.Long     autoscaleUserId,
		java.lang.Long     serviceOfferingId,
		java.lang.Long     templateId,
		java.lang.String   otherDeployParams,
		java.lang.Integer  destroyVmGracePeriod,
		java.lang.String   counterParams,
		java.sql.Timestamp created,
		java.sql.Timestamp removed
	) {
		this.id = id;
		this.uuid = uuid;
		this.zoneId = zoneId;
		this.domainId = domainId;
		this.accountId = accountId;
		this.autoscaleUserId = autoscaleUserId;
		this.serviceOfferingId = serviceOfferingId;
		this.templateId = templateId;
		this.otherDeployParams = otherDeployParams;
		this.destroyVmGracePeriod = destroyVmGracePeriod;
		this.counterParams = counterParams;
		this.created = created;
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

	@javax.persistence.Column(name = "uuid", unique = true, length = 40)
	public java.lang.String getUuid() {
		return this.uuid;
	}

	public void setUuid(java.lang.String uuid) {
		this.uuid = uuid;
	}

	@javax.persistence.Column(name = "zone_id", nullable = false, precision = 20)
	public java.lang.Long getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(java.lang.Long zoneId) {
		this.zoneId = zoneId;
	}

	@javax.persistence.Column(name = "domain_id", nullable = false, precision = 20)
	public java.lang.Long getDomainId() {
		return this.domainId;
	}

	public void setDomainId(java.lang.Long domainId) {
		this.domainId = domainId;
	}

	@javax.persistence.Column(name = "account_id", nullable = false, precision = 20)
	public java.lang.Long getAccountId() {
		return this.accountId;
	}

	public void setAccountId(java.lang.Long accountId) {
		this.accountId = accountId;
	}

	@javax.persistence.Column(name = "autoscale_user_id", nullable = false, precision = 20)
	public java.lang.Long getAutoscaleUserId() {
		return this.autoscaleUserId;
	}

	public void setAutoscaleUserId(java.lang.Long autoscaleUserId) {
		this.autoscaleUserId = autoscaleUserId;
	}

	@javax.persistence.Column(name = "service_offering_id", nullable = false, precision = 20)
	public java.lang.Long getServiceOfferingId() {
		return this.serviceOfferingId;
	}

	public void setServiceOfferingId(java.lang.Long serviceOfferingId) {
		this.serviceOfferingId = serviceOfferingId;
	}

	@javax.persistence.Column(name = "template_id", nullable = false, precision = 20)
	public java.lang.Long getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(java.lang.Long templateId) {
		this.templateId = templateId;
	}

	@javax.persistence.Column(name = "other_deploy_params", length = 1024)
	public java.lang.String getOtherDeployParams() {
		return this.otherDeployParams;
	}

	public void setOtherDeployParams(java.lang.String otherDeployParams) {
		this.otherDeployParams = otherDeployParams;
	}

	@javax.persistence.Column(name = "destroy_vm_grace_period", precision = 10)
	public java.lang.Integer getDestroyVmGracePeriod() {
		return this.destroyVmGracePeriod;
	}

	public void setDestroyVmGracePeriod(java.lang.Integer destroyVmGracePeriod) {
		this.destroyVmGracePeriod = destroyVmGracePeriod;
	}

	@javax.persistence.Column(name = "counter_params", length = 1024)
	public java.lang.String getCounterParams() {
		return this.counterParams;
	}

	public void setCounterParams(java.lang.String counterParams) {
		this.counterParams = counterParams;
	}

	@javax.persistence.Column(name = "created", nullable = false)
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
}
