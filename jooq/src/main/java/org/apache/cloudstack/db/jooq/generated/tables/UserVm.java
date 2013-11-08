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
public class UserVm extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.UserVmRecord> {

	private static final long serialVersionUID = -1078211565;

	/**
	 * The singleton instance of <code>cloud.user_vm</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.UserVm USER_VM = new org.apache.cloudstack.db.jooq.generated.tables.UserVm();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.UserVmRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.UserVmRecord.class;
	}

	/**
	 * The column <code>cloud.user_vm.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.UserVmRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.user_vm.iso_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.UserVmRecord, java.lang.Long> ISO_ID = createField("iso_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.user_vm.display_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.UserVmRecord, java.lang.String> DISPLAY_NAME = createField("display_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.user_vm.user_data</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.UserVmRecord, java.lang.String> USER_DATA = createField("user_data", org.jooq.impl.SQLDataType.CLOB.length(16777215), this);

	/**
	 * The column <code>cloud.user_vm.update_parameters</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.UserVmRecord, java.lang.Boolean> UPDATE_PARAMETERS = createField("update_parameters", org.jooq.impl.SQLDataType.BIT.nullable(false).defaulted(true), this);

	/**
	 * Create a <code>cloud.user_vm</code> table reference
	 */
	public UserVm() {
		super("user_vm", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.user_vm</code> table reference
	 */
	public UserVm(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.UserVm.USER_VM);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.UserVmRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_USER_VM_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.UserVmRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.UserVmRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_USER_VM_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.UserVmRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.UserVmRecord, ?>>asList(org.apache.cloudstack.db.jooq.generated.Keys.FK_USER_VM__ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.UserVm as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.UserVm(alias);
	}
}
