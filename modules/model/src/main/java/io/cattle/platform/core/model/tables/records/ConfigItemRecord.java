/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables.records;


import io.cattle.platform.core.model.ConfigItem;
import io.cattle.platform.core.model.tables.ConfigItemTable;
import io.cattle.platform.db.jooq.utils.TableRecordJaxb;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
@Entity
@Table(name = "config_item", schema = "cattle")
public class ConfigItemRecord extends UpdatableRecordImpl<ConfigItemRecord> implements TableRecordJaxb, Record3<Long, String, String>, ConfigItem {

    private static final long serialVersionUID = -1446898675;

    /**
     * Setter for <code>cattle.config_item.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cattle.config_item.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 20)
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cattle.config_item.name</code>.
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cattle.config_item.name</code>.
     */
    @Column(name = "name", unique = true, nullable = false, length = 255)
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cattle.config_item.source_version</code>.
     */
    @Override
    public void setSourceVersion(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>cattle.config_item.source_version</code>.
     */
    @Column(name = "source_version", nullable = false, length = 1024)
    @Override
    public String getSourceVersion() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ConfigItemTable.CONFIG_ITEM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ConfigItemTable.CONFIG_ITEM.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ConfigItemTable.CONFIG_ITEM.SOURCE_VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSourceVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigItemRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigItemRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigItemRecord value3(String value) {
        setSourceVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ConfigItemRecord values(Long value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ConfigItem from) {
        setId(from.getId());
        setName(from.getName());
        setSourceVersion(from.getSourceVersion());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ConfigItem> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ConfigItemRecord
     */
    public ConfigItemRecord() {
        super(ConfigItemTable.CONFIG_ITEM);
    }

    /**
     * Create a detached, initialised ConfigItemRecord
     */
    public ConfigItemRecord(Long id, String name, String sourceVersion) {
        super(ConfigItemTable.CONFIG_ITEM);

        set(0, id);
        set(1, name);
        set(2, sourceVersion);
    }
}