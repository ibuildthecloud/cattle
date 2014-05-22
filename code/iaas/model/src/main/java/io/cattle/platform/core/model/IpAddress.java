/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "ip_address", schema = "cattle")
public interface IpAddress extends java.io.Serializable {

	/**
	 * Setter for <code>cattle.ip_address.id</code>.
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.ip_address.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>cattle.ip_address.name</code>.
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>cattle.ip_address.name</code>.
	 */
	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName();

	/**
	 * Setter for <code>cattle.ip_address.account_id</code>.
	 */
	public void setAccountId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.ip_address.account_id</code>.
	 */
	@javax.persistence.Column(name = "account_id", precision = 19)
	public java.lang.Long getAccountId();

	/**
	 * Setter for <code>cattle.ip_address.kind</code>.
	 */
	public void setKind(java.lang.String value);

	/**
	 * Getter for <code>cattle.ip_address.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	public java.lang.String getKind();

	/**
	 * Setter for <code>cattle.ip_address.uuid</code>.
	 */
	public void setUuid(java.lang.String value);

	/**
	 * Getter for <code>cattle.ip_address.uuid</code>.
	 */
	@javax.persistence.Column(name = "uuid", unique = true, nullable = false, length = 128)
	public java.lang.String getUuid();

	/**
	 * Setter for <code>cattle.ip_address.description</code>.
	 */
	public void setDescription(java.lang.String value);

	/**
	 * Getter for <code>cattle.ip_address.description</code>.
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	public java.lang.String getDescription();

	/**
	 * Setter for <code>cattle.ip_address.state</code>.
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>cattle.ip_address.state</code>.
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	public java.lang.String getState();

	/**
	 * Setter for <code>cattle.ip_address.created</code>.
	 */
	public void setCreated(java.util.Date value);

	/**
	 * Getter for <code>cattle.ip_address.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	public java.util.Date getCreated();

	/**
	 * Setter for <code>cattle.ip_address.removed</code>.
	 */
	public void setRemoved(java.util.Date value);

	/**
	 * Getter for <code>cattle.ip_address.removed</code>.
	 */
	@javax.persistence.Column(name = "removed")
	public java.util.Date getRemoved();

	/**
	 * Setter for <code>cattle.ip_address.remove_time</code>.
	 */
	public void setRemoveTime(java.util.Date value);

	/**
	 * Getter for <code>cattle.ip_address.remove_time</code>.
	 */
	@javax.persistence.Column(name = "remove_time")
	public java.util.Date getRemoveTime();

	/**
	 * Setter for <code>cattle.ip_address.data</code>.
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>cattle.ip_address.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 65535)
	public java.util.Map<String,Object> getData();

	/**
	 * Setter for <code>cattle.ip_address.address</code>.
	 */
	public void setAddress(java.lang.String value);

	/**
	 * Getter for <code>cattle.ip_address.address</code>.
	 */
	@javax.persistence.Column(name = "address", length = 255)
	public java.lang.String getAddress();

	/**
	 * Setter for <code>cattle.ip_address.subnet_id</code>.
	 */
	public void setSubnetId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.ip_address.subnet_id</code>.
	 */
	@javax.persistence.Column(name = "subnet_id", precision = 19)
	public java.lang.Long getSubnetId();

	/**
	 * Setter for <code>cattle.ip_address.network_id</code>.
	 */
	public void setNetworkId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.ip_address.network_id</code>.
	 */
	@javax.persistence.Column(name = "network_id", precision = 19)
	public java.lang.Long getNetworkId();

	/**
	 * Setter for <code>cattle.ip_address.is_public</code>.
	 */
	public void setIsPublic(java.lang.Boolean value);

	/**
	 * Getter for <code>cattle.ip_address.is_public</code>.
	 */
	@javax.persistence.Column(name = "is_public", nullable = false, precision = 1)
	public java.lang.Boolean getIsPublic();

	/**
	 * Setter for <code>cattle.ip_address.role</code>.
	 */
	public void setRole(java.lang.String value);

	/**
	 * Getter for <code>cattle.ip_address.role</code>.
	 */
	@javax.persistence.Column(name = "role", length = 128)
	public java.lang.String getRole();

	/**
	 * Setter for <code>cattle.ip_address.hostname</code>.
	 */
	public void setHostname(java.lang.String value);

	/**
	 * Getter for <code>cattle.ip_address.hostname</code>.
	 */
	@javax.persistence.Column(name = "hostname", length = 255)
	public java.lang.String getHostname();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IpAddress
	 */
	public void from(io.cattle.platform.core.model.IpAddress from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IpAddress
	 */
	public <E extends io.cattle.platform.core.model.IpAddress> E into(E into);
}
