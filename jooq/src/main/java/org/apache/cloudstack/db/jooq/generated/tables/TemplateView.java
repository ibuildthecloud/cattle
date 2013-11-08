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
public class TemplateView extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord> {

	private static final long serialVersionUID = 282171209;

	/**
	 * The singleton instance of <code>cloud.template_view</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.TemplateView TEMPLATE_VIEW = new org.apache.cloudstack.db.jooq.generated.tables.TemplateView();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord.class;
	}

	/**
	 * The column <code>cloud.template_view.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.template_view.uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.template_view.unique_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> UNIQUE_NAME = createField("unique_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.template_view.name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.template_view.public</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Integer> PUBLIC = createField("public", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>cloud.template_view.featured</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Integer> FEATURED = createField("featured", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>cloud.template_view.type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR.length(32), this);

	/**
	 * The column <code>cloud.template_view.hvm</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Integer> HVM = createField("hvm", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>cloud.template_view.bits</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Integer> BITS = createField("bits", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>cloud.template_view.url</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> URL = createField("url", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.template_view.format</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> FORMAT = createField("format", org.jooq.impl.SQLDataType.VARCHAR.length(32).nullable(false), this);

	/**
	 * The column <code>cloud.template_view.created</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.sql.Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this);

	/**
	 * The column <code>cloud.template_view.checksum</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> CHECKSUM = createField("checksum", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.template_view.display_text</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> DISPLAY_TEXT = createField("display_text", org.jooq.impl.SQLDataType.VARCHAR.length(4096), this);

	/**
	 * The column <code>cloud.template_view.enable_password</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Integer> ENABLE_PASSWORD = createField("enable_password", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.template_view.dynamically_scalable</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Boolean> DYNAMICALLY_SCALABLE = createField("dynamically_scalable", org.jooq.impl.SQLDataType.BIT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.template_view.guest_os_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Long> GUEST_OS_ID = createField("guest_os_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.template_view.guest_os_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> GUEST_OS_UUID = createField("guest_os_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.template_view.guest_os_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> GUEST_OS_NAME = createField("guest_os_name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.template_view.bootable</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Integer> BOOTABLE = createField("bootable", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.template_view.prepopulate</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Integer> PREPOPULATE = createField("prepopulate", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.template_view.cross_zones</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Integer> CROSS_ZONES = createField("cross_zones", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.template_view.hypervisor_type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> HYPERVISOR_TYPE = createField("hypervisor_type", org.jooq.impl.SQLDataType.VARCHAR.length(32), this);

	/**
	 * The column <code>cloud.template_view.extractable</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Integer> EXTRACTABLE = createField("extractable", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.template_view.template_tag</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> TEMPLATE_TAG = createField("template_tag", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.template_view.sort_key</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Integer> SORT_KEY = createField("sort_key", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.template_view.removed</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.sql.Timestamp> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>cloud.template_view.enable_sshkey</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Integer> ENABLE_SSHKEY = createField("enable_sshkey", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.template_view.source_template_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Long> SOURCE_TEMPLATE_ID = createField("source_template_id", org.jooq.impl.SQLDataType.BIGINT.defaulted(true), this);

	/**
	 * The column <code>cloud.template_view.source_template_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> SOURCE_TEMPLATE_UUID = createField("source_template_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.template_view.account_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.template_view.account_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> ACCOUNT_UUID = createField("account_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.template_view.account_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> ACCOUNT_NAME = createField("account_name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this);

	/**
	 * The column <code>cloud.template_view.account_type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Integer> ACCOUNT_TYPE = createField("account_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>cloud.template_view.domain_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Long> DOMAIN_ID = createField("domain_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>cloud.template_view.domain_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> DOMAIN_UUID = createField("domain_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.template_view.domain_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> DOMAIN_NAME = createField("domain_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.template_view.domain_path</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> DOMAIN_PATH = createField("domain_path", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.template_view.project_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Long> PROJECT_ID = createField("project_id", org.jooq.impl.SQLDataType.BIGINT.defaulted(true), this);

	/**
	 * The column <code>cloud.template_view.project_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> PROJECT_UUID = createField("project_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.template_view.project_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> PROJECT_NAME = createField("project_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.template_view.data_center_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Long> DATA_CENTER_ID = createField("data_center_id", org.jooq.impl.SQLDataType.BIGINT.defaulted(true), this);

	/**
	 * The column <code>cloud.template_view.data_center_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> DATA_CENTER_UUID = createField("data_center_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.template_view.data_center_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> DATA_CENTER_NAME = createField("data_center_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.template_view.lp_account_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Long> LP_ACCOUNT_ID = createField("lp_account_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.template_view.store_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Long> STORE_ID = createField("store_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.template_view.store_scope</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> STORE_SCOPE = createField("store_scope", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.template_view.state</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.template_view.download_state</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> DOWNLOAD_STATE = createField("download_state", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.template_view.download_pct</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Integer> DOWNLOAD_PCT = createField("download_pct", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>cloud.template_view.error_str</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> ERROR_STR = createField("error_str", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.template_view.size</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Long> SIZE = createField("size", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.template_view.destroyed</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Boolean> DESTROYED = createField("destroyed", org.jooq.impl.SQLDataType.BIT, this);

	/**
	 * The column <code>cloud.template_view.created_on_store</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.sql.Timestamp> CREATED_ON_STORE = createField("created_on_store", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>cloud.template_view.detail_name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> DETAIL_NAME = createField("detail_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.template_view.detail_value</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> DETAIL_VALUE = createField("detail_value", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this);

	/**
	 * The column <code>cloud.template_view.tag_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Long> TAG_ID = createField("tag_id", org.jooq.impl.SQLDataType.BIGINT.defaulted(true), this);

	/**
	 * The column <code>cloud.template_view.tag_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> TAG_UUID = createField("tag_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.template_view.tag_key</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> TAG_KEY = createField("tag_key", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.template_view.tag_value</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> TAG_VALUE = createField("tag_value", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.template_view.tag_domain_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Long> TAG_DOMAIN_ID = createField("tag_domain_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.template_view.tag_account_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Long> TAG_ACCOUNT_ID = createField("tag_account_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.template_view.tag_resource_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.Long> TAG_RESOURCE_ID = createField("tag_resource_id", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>cloud.template_view.tag_resource_uuid</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> TAG_RESOURCE_UUID = createField("tag_resource_uuid", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>cloud.template_view.tag_resource_type</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> TAG_RESOURCE_TYPE = createField("tag_resource_type", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.template_view.tag_customer</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> TAG_CUSTOMER = createField("tag_customer", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>cloud.template_view.temp_zone_pair</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.TemplateViewRecord, java.lang.String> TEMP_ZONE_PAIR = createField("temp_zone_pair", org.jooq.impl.SQLDataType.VARCHAR.length(42), this);

	/**
	 * Create a <code>cloud.template_view</code> table reference
	 */
	public TemplateView() {
		super("template_view", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.template_view</code> table reference
	 */
	public TemplateView(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.TemplateView.TEMPLATE_VIEW);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.TemplateView as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.TemplateView(alias);
	}
}
