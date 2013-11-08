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
public class ResourceTags extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagsRecord> {

	private static final long serialVersionUID = -1242016799;

	/**
	 * The singleton instance of <code>cloud.resource_tags</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.ResourceTags RESOURCE_TAGS = new org.apache.cloudstack.db.jooq.generated.tables.ResourceTags();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagsRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagsRecord.class;
	}

	/**
	 * The column <code>cloud.resource_tags.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagsRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.resource_tags.uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagsRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.resource_tags.key</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagsRecord, java.lang.String> KEY = createField("key", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.resource_tags.value</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagsRecord, java.lang.String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.resource_tags.resource_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagsRecord, java.lang.Long> RESOURCE_ID = createField("resource_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.resource_tags.resource_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagsRecord, java.lang.String> RESOURCE_UUID = createField("resource_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.resource_tags.resource_type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagsRecord, java.lang.String> RESOURCE_TYPE = createField("resource_type", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.resource_tags.customer</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagsRecord, java.lang.String> CUSTOMER = createField("customer", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.resource_tags.domain_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagsRecord, java.lang.Long> DOMAIN_ID = createField("domain_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.resource_tags.account_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagsRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * Create a <code>cloud.resource_tags</code> table reference
	 */
	public ResourceTags() {
		super("resource_tags", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.resource_tags</code> table reference
	 */
	public ResourceTags(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.ResourceTags.RESOURCE_TAGS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagsRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_RESOURCE_TAGS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagsRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_RESOURCE_TAGS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagsRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_RESOURCE_TAGS_PRIMARY, org.apache.cloudstack.db.jooq.generated.Keys.KEY_RESOURCE_TAGS_UC_RESOURCE_TAGS__UUID, org.apache.cloudstack.db.jooq.generated.Keys.KEY_RESOURCE_TAGS_I_TAGS__RESOURCE_ID__RESOURCE_TYPE__KEY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagsRecord, ?>>asList(org.apache.cloudstack.db.jooq.generated.Keys.FK_TAGS__DOMAIN_ID, org.apache.cloudstack.db.jooq.generated.Keys.FK_TAGS__ACCOUNT_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.ResourceTags as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.ResourceTags(alias);
	}
}
