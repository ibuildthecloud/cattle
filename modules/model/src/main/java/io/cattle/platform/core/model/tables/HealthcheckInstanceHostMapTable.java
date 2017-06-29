/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables;


import io.cattle.platform.core.model.CattleTable;
import io.cattle.platform.core.model.Keys;
import io.cattle.platform.core.model.tables.records.HealthcheckInstanceHostMapRecord;
import io.cattle.platform.db.jooq.converter.DataConverter;
import io.cattle.platform.db.jooq.converter.DateConverter;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HealthcheckInstanceHostMapTable extends TableImpl<HealthcheckInstanceHostMapRecord> {

    private static final long serialVersionUID = -492955729;

    /**
     * The reference instance of <code>cattle.healthcheck_instance_host_map</code>
     */
    public static final HealthcheckInstanceHostMapTable HEALTHCHECK_INSTANCE_HOST_MAP = new HealthcheckInstanceHostMapTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HealthcheckInstanceHostMapRecord> getRecordType() {
        return HealthcheckInstanceHostMapRecord.class;
    }

    /**
     * The column <code>cattle.healthcheck_instance_host_map.id</code>.
     */
    public final TableField<HealthcheckInstanceHostMapRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cattle.healthcheck_instance_host_map.name</code>.
     */
    public final TableField<HealthcheckInstanceHostMapRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.healthcheck_instance_host_map.account_id</code>.
     */
    public final TableField<HealthcheckInstanceHostMapRecord, Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.healthcheck_instance_host_map.kind</code>.
     */
    public final TableField<HealthcheckInstanceHostMapRecord, String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>cattle.healthcheck_instance_host_map.uuid</code>.
     */
    public final TableField<HealthcheckInstanceHostMapRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.healthcheck_instance_host_map.description</code>.
     */
    public final TableField<HealthcheckInstanceHostMapRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>cattle.healthcheck_instance_host_map.state</code>.
     */
    public final TableField<HealthcheckInstanceHostMapRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.healthcheck_instance_host_map.created</code>.
     */
    public final TableField<HealthcheckInstanceHostMapRecord, Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.healthcheck_instance_host_map.removed</code>.
     */
    public final TableField<HealthcheckInstanceHostMapRecord, Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.healthcheck_instance_host_map.remove_time</code>.
     */
    public final TableField<HealthcheckInstanceHostMapRecord, Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.healthcheck_instance_host_map.data</code>.
     */
    public final TableField<HealthcheckInstanceHostMapRecord, Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB, this, "", new DataConverter());

    /**
     * The column <code>cattle.healthcheck_instance_host_map.healthcheck_instance_id</code>.
     */
    public final TableField<HealthcheckInstanceHostMapRecord, Long> HEALTHCHECK_INSTANCE_ID = createField("healthcheck_instance_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.healthcheck_instance_host_map.host_id</code>.
     */
    public final TableField<HealthcheckInstanceHostMapRecord, Long> HOST_ID = createField("host_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.healthcheck_instance_host_map.external_timestamp</code>.
     */
    public final TableField<HealthcheckInstanceHostMapRecord, Long> EXTERNAL_TIMESTAMP = createField("external_timestamp", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.healthcheck_instance_host_map.health_state</code>.
     */
    public final TableField<HealthcheckInstanceHostMapRecord, String> HEALTH_STATE = createField("health_state", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

    /**
     * The column <code>cattle.healthcheck_instance_host_map.instance_id</code>.
     */
    public final TableField<HealthcheckInstanceHostMapRecord, Long> INSTANCE_ID = createField("instance_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>cattle.healthcheck_instance_host_map</code> table reference
     */
    public HealthcheckInstanceHostMapTable() {
        this("healthcheck_instance_host_map", null);
    }

    /**
     * Create an aliased <code>cattle.healthcheck_instance_host_map</code> table reference
     */
    public HealthcheckInstanceHostMapTable(String alias) {
        this(alias, HEALTHCHECK_INSTANCE_HOST_MAP);
    }

    private HealthcheckInstanceHostMapTable(String alias, Table<HealthcheckInstanceHostMapRecord> aliased) {
        this(alias, aliased, null);
    }

    private HealthcheckInstanceHostMapTable(String alias, Table<HealthcheckInstanceHostMapRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return CattleTable.CATTLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<HealthcheckInstanceHostMapRecord, Long> getIdentity() {
        return Keys.IDENTITY_HEALTHCHECK_INSTANCE_HOST_MAP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HealthcheckInstanceHostMapRecord> getPrimaryKey() {
        return Keys.KEY_HEALTHCHECK_INSTANCE_HOST_MAP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HealthcheckInstanceHostMapRecord>> getKeys() {
        return Arrays.<UniqueKey<HealthcheckInstanceHostMapRecord>>asList(Keys.KEY_HEALTHCHECK_INSTANCE_HOST_MAP_PRIMARY, Keys.KEY_HEALTHCHECK_INSTANCE_HOST_MAP_IDX_HEALTHCHECK_INSTANCE_HOST_MAP_UUID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<HealthcheckInstanceHostMapRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<HealthcheckInstanceHostMapRecord, ?>>asList(Keys.FK_HEALTHCHECK_INSTANCE_HOST_MAP__ACCOUNT_ID, Keys.FK_HEALTHCHECK_INSTANCE_HOST_MAP__HEALTHCHECK_INSTANCE_ID, Keys.FK_HEALTHCHECK_INSTANCE_HOST_MAP__HOST_ID, Keys.FK_HEALTHCHECK_INSTANCE_HOST_MAP_INSTANCE_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HealthcheckInstanceHostMapTable as(String alias) {
        return new HealthcheckInstanceHostMapTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HealthcheckInstanceHostMapTable rename(String name) {
        return new HealthcheckInstanceHostMapTable(name, null);
    }
}