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
@javax.persistence.Table(name = "s2s_customer_gateway", schema = "cloud")
public class S2sCustomerGateway implements java.io.Serializable {

	private static final long serialVersionUID = 587373152;

	private java.lang.Long     id;
	private java.lang.String   uuid;
	private java.lang.String   name;
	private java.lang.String   gatewayIp;
	private java.lang.String   guestCidrList;
	private java.lang.String   ipsecPsk;
	private java.lang.String   ikePolicy;
	private java.lang.String   espPolicy;
	private java.lang.Integer  ikeLifetime;
	private java.lang.Integer  espLifetime;
	private java.lang.Integer  dpd;
	private java.lang.Long     domainId;
	private java.lang.Long     accountId;
	private java.sql.Timestamp removed;

	public S2sCustomerGateway() {}

	public S2sCustomerGateway(
		java.lang.Long     id,
		java.lang.String   uuid,
		java.lang.String   name,
		java.lang.String   gatewayIp,
		java.lang.String   guestCidrList,
		java.lang.String   ipsecPsk,
		java.lang.String   ikePolicy,
		java.lang.String   espPolicy,
		java.lang.Integer  ikeLifetime,
		java.lang.Integer  espLifetime,
		java.lang.Integer  dpd,
		java.lang.Long     domainId,
		java.lang.Long     accountId,
		java.sql.Timestamp removed
	) {
		this.id = id;
		this.uuid = uuid;
		this.name = name;
		this.gatewayIp = gatewayIp;
		this.guestCidrList = guestCidrList;
		this.ipsecPsk = ipsecPsk;
		this.ikePolicy = ikePolicy;
		this.espPolicy = espPolicy;
		this.ikeLifetime = ikeLifetime;
		this.espLifetime = espLifetime;
		this.dpd = dpd;
		this.domainId = domainId;
		this.accountId = accountId;
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

	@javax.persistence.Column(name = "name", nullable = false, length = 255)
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	@javax.persistence.Column(name = "gateway_ip", nullable = false, length = 40)
	public java.lang.String getGatewayIp() {
		return this.gatewayIp;
	}

	public void setGatewayIp(java.lang.String gatewayIp) {
		this.gatewayIp = gatewayIp;
	}

	@javax.persistence.Column(name = "guest_cidr_list", nullable = false, length = 200)
	public java.lang.String getGuestCidrList() {
		return this.guestCidrList;
	}

	public void setGuestCidrList(java.lang.String guestCidrList) {
		this.guestCidrList = guestCidrList;
	}

	@javax.persistence.Column(name = "ipsec_psk", length = 256)
	public java.lang.String getIpsecPsk() {
		return this.ipsecPsk;
	}

	public void setIpsecPsk(java.lang.String ipsecPsk) {
		this.ipsecPsk = ipsecPsk;
	}

	@javax.persistence.Column(name = "ike_policy", nullable = false, length = 30)
	public java.lang.String getIkePolicy() {
		return this.ikePolicy;
	}

	public void setIkePolicy(java.lang.String ikePolicy) {
		this.ikePolicy = ikePolicy;
	}

	@javax.persistence.Column(name = "esp_policy", nullable = false, length = 30)
	public java.lang.String getEspPolicy() {
		return this.espPolicy;
	}

	public void setEspPolicy(java.lang.String espPolicy) {
		this.espPolicy = espPolicy;
	}

	@javax.persistence.Column(name = "ike_lifetime", nullable = false, precision = 10)
	public java.lang.Integer getIkeLifetime() {
		return this.ikeLifetime;
	}

	public void setIkeLifetime(java.lang.Integer ikeLifetime) {
		this.ikeLifetime = ikeLifetime;
	}

	@javax.persistence.Column(name = "esp_lifetime", nullable = false, precision = 10)
	public java.lang.Integer getEspLifetime() {
		return this.espLifetime;
	}

	public void setEspLifetime(java.lang.Integer espLifetime) {
		this.espLifetime = espLifetime;
	}

	@javax.persistence.Column(name = "dpd", nullable = false, precision = 10)
	public java.lang.Integer getDpd() {
		return this.dpd;
	}

	public void setDpd(java.lang.Integer dpd) {
		this.dpd = dpd;
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

	@javax.persistence.Column(name = "removed")
	public java.sql.Timestamp getRemoved() {
		return this.removed;
	}

	public void setRemoved(java.sql.Timestamp removed) {
		this.removed = removed;
	}
}
