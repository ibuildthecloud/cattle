/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ResourceTagView extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord> {

	private static final long serialVersionUID = 933864989;

	/**
	 * The singleton instance of <code>cloud.resource_tag_view</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.ResourceTagView RESOURCE_TAG_VIEW = new org.apache.cloudstack.db.jooq.generated.tables.ResourceTagView();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord.class;
	}

	/**
	 * The column <code>cloud.resource_tag_view.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.resource_tag_view.uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.resource_tag_view.key</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord, java.lang.String> KEY = createField("key", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.resource_tag_view.value</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord, java.lang.String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.resource_tag_view.resource_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord, java.lang.Long> RESOURCE_ID = createField("resource_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.resource_tag_view.resource_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord, java.lang.String> RESOURCE_UUID = createField("resource_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.resource_tag_view.resource_type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord, java.lang.String> RESOURCE_TYPE = createField("resource_type", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.resource_tag_view.customer</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord, java.lang.String> CUSTOMER = createField("customer", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.resource_tag_view.account_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.resource_tag_view.account_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord, java.lang.String> ACCOUNT_UUID = createField("account_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.resource_tag_view.account_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord, java.lang.String> ACCOUNT_NAME = createField("account_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * The column <code>cloud.resource_tag_view.account_type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord, java.lang.Integer> ACCOUNT_TYPE = createField("account_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>cloud.resource_tag_view.domain_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord, java.lang.Long> DOMAIN_ID = createField("domain_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.resource_tag_view.domain_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord, java.lang.String> DOMAIN_UUID = createField("domain_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.resource_tag_view.domain_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord, java.lang.String> DOMAIN_NAME = createField("domain_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.resource_tag_view.domain_path</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord, java.lang.String> DOMAIN_PATH = createField("domain_path", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.resource_tag_view.project_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord, java.lang.Long> PROJECT_ID = createField("project_id", org.jooq.impl.SQLDataType.BIGINT.defaulted(true), this);

	/**
	 * The column <code>cloud.resource_tag_view.project_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord, java.lang.String> PROJECT_UUID = createField("project_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.resource_tag_view.project_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ResourceTagViewRecord, java.lang.String> PROJECT_NAME = createField("project_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * Create a <code>cloud.resource_tag_view</code> table reference
	 */
	public ResourceTagView() {
		super("resource_tag_view", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.resource_tag_view</code> table reference
	 */
	public ResourceTagView(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.ResourceTagView.RESOURCE_TAG_VIEW);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.ResourceTagView as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.ResourceTagView(alias);
	}
}
