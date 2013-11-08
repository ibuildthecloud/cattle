/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BaremetalDhcpDevicesDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.BaremetalDhcpDevicesRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.BaremetalDhcpDevices, java.lang.Long> {

	/**
	 * Create a new BaremetalDhcpDevicesDao without any configuration
	 */
	public BaremetalDhcpDevicesDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES, org.apache.cloudstack.db.jooq.generated.tables.pojos.BaremetalDhcpDevices.class);
	}

	/**
	 * Create a new BaremetalDhcpDevicesDao with an attached configuration
	 */
	public BaremetalDhcpDevicesDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES, org.apache.cloudstack.db.jooq.generated.tables.pojos.BaremetalDhcpDevices.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.BaremetalDhcpDevices object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.BaremetalDhcpDevices> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.BaremetalDhcpDevices fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES.ID, value);
	}

	/**
	 * Fetch records that have <code>uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.BaremetalDhcpDevices> fetchByUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES.UUID, values);
	}

	/**
	 * Fetch a unique record that has <code>uuid = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.BaremetalDhcpDevices fetchOneByUuid(java.lang.String value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES.UUID, value);
	}

	/**
	 * Fetch records that have <code>nsp_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.BaremetalDhcpDevices> fetchByNspId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES.NSP_ID, values);
	}

	/**
	 * Fetch records that have <code>pod_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.BaremetalDhcpDevices> fetchByPodId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES.POD_ID, values);
	}

	/**
	 * Fetch records that have <code>device_type IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.BaremetalDhcpDevices> fetchByDeviceType(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES.DEVICE_TYPE, values);
	}

	/**
	 * Fetch records that have <code>physical_network_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.BaremetalDhcpDevices> fetchByPhysicalNetworkId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES.PHYSICAL_NETWORK_ID, values);
	}

	/**
	 * Fetch records that have <code>host_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.BaremetalDhcpDevices> fetchByHostId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.BaremetalDhcpDevices.BAREMETAL_DHCP_DEVICES.HOST_ID, values);
	}
}
