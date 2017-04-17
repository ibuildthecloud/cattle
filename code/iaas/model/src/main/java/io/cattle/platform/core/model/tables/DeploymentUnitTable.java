/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DeploymentUnitTable extends org.jooq.impl.TableImpl<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord> {

	private static final long serialVersionUID = 1765987953;

	/**
	 * The singleton instance of <code>cattle.deployment_unit</code>
	 */
	public static final io.cattle.platform.core.model.tables.DeploymentUnitTable DEPLOYMENT_UNIT = new io.cattle.platform.core.model.tables.DeploymentUnitTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord> getRecordType() {
		return io.cattle.platform.core.model.tables.records.DeploymentUnitRecord.class;
	}

	/**
	 * The column <code>cattle.deployment_unit.id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>cattle.deployment_unit.name</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.deployment_unit.account_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.deployment_unit.kind</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>cattle.deployment_unit.uuid</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.deployment_unit.description</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>cattle.deployment_unit.state</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.deployment_unit.created</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, java.util.Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.deployment_unit.removed</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, java.util.Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.deployment_unit.remove_time</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, java.util.Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.deployment_unit.data</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(65535).asConvertedDataType(new io.cattle.platform.db.jooq.converter.DataConverter()), this, "");

	/**
	 * The column <code>cattle.deployment_unit.service_index</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, java.lang.String> SERVICE_INDEX = createField("service_index", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.deployment_unit.service_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, java.lang.Long> SERVICE_ID = createField("service_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.deployment_unit.cleanup</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, java.lang.Boolean> CLEANUP = createField("cleanup", org.jooq.impl.SQLDataType.BIT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>cattle.deployment_unit.revision_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, java.lang.Long> REVISION_ID = createField("revision_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.deployment_unit.cleanup_time</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, java.util.Date> CLEANUP_TIME = createField("cleanup_time", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.deployment_unit.health_state</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, java.lang.String> HEALTH_STATE = createField("health_state", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

	/**
	 * The column <code>cattle.deployment_unit.environment_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, java.lang.Long> STACK_ID = createField("environment_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>cattle.deployment_unit</code> table reference
	 */
	public DeploymentUnitTable() {
		this("deployment_unit", null);
	}

	/**
	 * Create an aliased <code>cattle.deployment_unit</code> table reference
	 */
	public DeploymentUnitTable(java.lang.String alias) {
		this(alias, io.cattle.platform.core.model.tables.DeploymentUnitTable.DEPLOYMENT_UNIT);
	}

	private DeploymentUnitTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord> aliased) {
		this(alias, aliased, null);
	}

	private DeploymentUnitTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.cattle.platform.core.model.CattleTable.CATTLE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, java.lang.Long> getIdentity() {
		return io.cattle.platform.core.model.Keys.IDENTITY_DEPLOYMENT_UNIT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord> getPrimaryKey() {
		return io.cattle.platform.core.model.Keys.KEY_DEPLOYMENT_UNIT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord>>asList(io.cattle.platform.core.model.Keys.KEY_DEPLOYMENT_UNIT_PRIMARY, io.cattle.platform.core.model.Keys.KEY_DEPLOYMENT_UNIT_IDX_DEPLOYMENT_UNIT_UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.DeploymentUnitRecord, ?>>asList(io.cattle.platform.core.model.Keys.FK_DEPLOYMENT_UNIT__ACCOUNT_ID, io.cattle.platform.core.model.Keys.FK_DEPLOYMENT_UNIT__SERVICE_ID, io.cattle.platform.core.model.Keys.FK_DEPLOYMENT_UNIT__REVISION_ID, io.cattle.platform.core.model.Keys.FK_DEPLOYMENT_UNIT__ENVIRONMENT_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.cattle.platform.core.model.tables.DeploymentUnitTable as(java.lang.String alias) {
		return new io.cattle.platform.core.model.tables.DeploymentUnitTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.cattle.platform.core.model.tables.DeploymentUnitTable rename(java.lang.String name) {
		return new io.cattle.platform.core.model.tables.DeploymentUnitTable(name, null);
	}
}
