/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VpnUsers extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.VpnUsersRecord> {

	private static final long serialVersionUID = -486166145;

	/**
	 * The singleton instance of <code>cloud.vpn_users</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.VpnUsers VPN_USERS = new org.apache.cloudstack.db.jooq.generated.tables.VpnUsers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.VpnUsersRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.VpnUsersRecord.class;
	}

	/**
	 * The column <code>cloud.vpn_users.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VpnUsersRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.vpn_users.uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VpnUsersRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.vpn_users.owner_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VpnUsersRecord, java.lang.Long> OWNER_ID = createField("owner_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.vpn_users.domain_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VpnUsersRecord, java.lang.Long> DOMAIN_ID = createField("domain_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.vpn_users.username</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VpnUsersRecord, java.lang.String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.vpn_users.password</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VpnUsersRecord, java.lang.String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.vpn_users.state</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.VpnUsersRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this);

	/**
	 * Create a <code>cloud.vpn_users</code> table reference
	 */
	public VpnUsers() {
		super("vpn_users", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.vpn_users</code> table reference
	 */
	public VpnUsers(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.VpnUsers.VPN_USERS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.VpnUsersRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_VPN_USERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VpnUsersRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_VPN_USERS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VpnUsersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.VpnUsersRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_VPN_USERS_PRIMARY, org.apache.cloudstack.db.jooq.generated.Keys.KEY_VPN_USERS_UC_VPN_USERS__UUID, org.apache.cloudstack.db.jooq.generated.Keys.KEY_VPN_USERS_I_VPN_USERS__ACCOUNT_ID__USERNAME);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.VpnUsersRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.VpnUsersRecord, ?>>asList(org.apache.cloudstack.db.jooq.generated.Keys.FK_VPN_USERS__OWNER_ID, org.apache.cloudstack.db.jooq.generated.Keys.FK_VPN_USERS__DOMAIN_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.VpnUsers as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.VpnUsers(alias);
	}
}
