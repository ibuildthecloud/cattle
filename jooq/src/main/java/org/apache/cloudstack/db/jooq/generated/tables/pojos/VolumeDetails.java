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
@javax.persistence.Table(name = "volume_details", schema = "cloud")
public class VolumeDetails implements java.io.Serializable {

	private static final long serialVersionUID = -1035832060;

	private java.lang.Long    id;
	private java.lang.Long    volumeId;
	private java.lang.String  name;
	private java.lang.String  value;
	private java.lang.Boolean display;

	public VolumeDetails() {}

	public VolumeDetails(
		java.lang.Long    id,
		java.lang.Long    volumeId,
		java.lang.String  name,
		java.lang.String  value,
		java.lang.Boolean display
	) {
		this.id = id;
		this.volumeId = volumeId;
		this.name = name;
		this.value = value;
		this.display = display;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 20)
	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "volume_id", nullable = false, precision = 20)
	public java.lang.Long getVolumeId() {
		return this.volumeId;
	}

	public void setVolumeId(java.lang.Long volumeId) {
		this.volumeId = volumeId;
	}

	@javax.persistence.Column(name = "name", nullable = false, length = 255)
	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	@javax.persistence.Column(name = "value", nullable = false, length = 1024)
	public java.lang.String getValue() {
		return this.value;
	}

	public void setValue(java.lang.String value) {
		this.value = value;
	}

	@javax.persistence.Column(name = "display", nullable = false, precision = 1)
	public java.lang.Boolean getDisplay() {
		return this.display;
	}

	public void setDisplay(java.lang.Boolean display) {
		this.display = display;
	}
}
