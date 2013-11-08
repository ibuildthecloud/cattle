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
@javax.persistence.Table(name = "load_balancing_rules", schema = "cloud")
public class LoadBalancingRules implements java.io.Serializable {

	private static final long serialVersionUID = 1259191544;

	private java.lang.Long    id;
	private java.lang.String  name;
	private java.lang.String  description;
	private java.lang.Integer defaultPortStart;
	private java.lang.Integer defaultPortEnd;
	private java.lang.String  algorithm;
	private java.lang.String  sourceIpAddress;
	private java.lang.Long    sourceIpAddressNetworkId;
	private java.lang.String  scheme;

	public LoadBalancingRules() {}

	public LoadBalancingRules(
		java.lang.Long    id,
		java.lang.String  name,
		java.lang.String  description,
		java.lang.Integer defaultPortStart,
		java.lang.Integer defaultPortEnd,
		java.lang.String  algorithm,
		java.lang.String  sourceIpAddress,
		java.lang.Long    sourceIpAddressNetworkId,
		java.lang.String  scheme
	) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.defaultPortStart = defaultPortStart;
		this.defaultPortEnd = defaultPortEnd;
		this.algorithm = algorithm;
		this.sourceIpAddress = sourceIpAddress;
		this.sourceIpAddressNetworkId = sourceIpAddressNetworkId;
		this.scheme = scheme;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
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

	@javax.persistence.Column(name = "description", length = 4096)
	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	@javax.persistence.Column(name = "default_port_start", nullable = false, precision = 10)
	public java.lang.Integer getDefaultPortStart() {
		return this.defaultPortStart;
	}

	public void setDefaultPortStart(java.lang.Integer defaultPortStart) {
		this.defaultPortStart = defaultPortStart;
	}

	@javax.persistence.Column(name = "default_port_end", nullable = false, precision = 10)
	public java.lang.Integer getDefaultPortEnd() {
		return this.defaultPortEnd;
	}

	public void setDefaultPortEnd(java.lang.Integer defaultPortEnd) {
		this.defaultPortEnd = defaultPortEnd;
	}

	@javax.persistence.Column(name = "algorithm", nullable = false, length = 255)
	public java.lang.String getAlgorithm() {
		return this.algorithm;
	}

	public void setAlgorithm(java.lang.String algorithm) {
		this.algorithm = algorithm;
	}

	@javax.persistence.Column(name = "source_ip_address", length = 40)
	public java.lang.String getSourceIpAddress() {
		return this.sourceIpAddress;
	}

	public void setSourceIpAddress(java.lang.String sourceIpAddress) {
		this.sourceIpAddress = sourceIpAddress;
	}

	@javax.persistence.Column(name = "source_ip_address_network_id", precision = 20)
	public java.lang.Long getSourceIpAddressNetworkId() {
		return this.sourceIpAddressNetworkId;
	}

	public void setSourceIpAddressNetworkId(java.lang.Long sourceIpAddressNetworkId) {
		this.sourceIpAddressNetworkId = sourceIpAddressNetworkId;
	}

	@javax.persistence.Column(name = "scheme", nullable = false, length = 40)
	public java.lang.String getScheme() {
		return this.scheme;
	}

	public void setScheme(java.lang.String scheme) {
		this.scheme = scheme;
	}
}
