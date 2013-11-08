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
public class ClusterDetails extends org.jooq.impl.TableImpl<org.apache.cloudstack.db.jooq.generated.tables.records.ClusterDetailsRecord> {

	private static final long serialVersionUID = -1594454093;

	/**
	 * The singleton instance of <code>cloud.cluster_details</code>
	 */
	public static final org.apache.cloudstack.db.jooq.generated.tables.ClusterDetails CLUSTER_DETAILS = new org.apache.cloudstack.db.jooq.generated.tables.ClusterDetails();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.apache.cloudstack.db.jooq.generated.tables.records.ClusterDetailsRecord> getRecordType() {
		return org.apache.cloudstack.db.jooq.generated.tables.records.ClusterDetailsRecord.class;
	}

	/**
	 * The column <code>cloud.cluster_details.id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ClusterDetailsRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.cluster_details.cluster_id</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ClusterDetailsRecord, java.lang.Long> CLUSTER_ID = createField("cluster_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>cloud.cluster_details.name</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ClusterDetailsRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this);

	/**
	 * The column <code>cloud.cluster_details.value</code>. 
	 */
	public final org.jooq.TableField<org.apache.cloudstack.db.jooq.generated.tables.records.ClusterDetailsRecord, java.lang.String> VALUE = createField("value", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * Create a <code>cloud.cluster_details</code> table reference
	 */
	public ClusterDetails() {
		super("cluster_details", org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD);
	}

	/**
	 * Create an aliased <code>cloud.cluster_details</code> table reference
	 */
	public ClusterDetails(java.lang.String alias) {
		super(alias, org.apache.cloudstack.db.jooq.generated.Cloud.CLOUD, org.apache.cloudstack.db.jooq.generated.tables.ClusterDetails.CLUSTER_DETAILS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.apache.cloudstack.db.jooq.generated.tables.records.ClusterDetailsRecord, java.lang.Long> getIdentity() {
		return org.apache.cloudstack.db.jooq.generated.Keys.IDENTITY_CLUSTER_DETAILS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.ClusterDetailsRecord> getPrimaryKey() {
		return org.apache.cloudstack.db.jooq.generated.Keys.KEY_CLUSTER_DETAILS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.ClusterDetailsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.apache.cloudstack.db.jooq.generated.tables.records.ClusterDetailsRecord>>asList(org.apache.cloudstack.db.jooq.generated.Keys.KEY_CLUSTER_DETAILS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.ClusterDetailsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.apache.cloudstack.db.jooq.generated.tables.records.ClusterDetailsRecord, ?>>asList(org.apache.cloudstack.db.jooq.generated.Keys.FK_CLUSTER_DETAILS__CLUSTER_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.apache.cloudstack.db.jooq.generated.tables.ClusterDetails as(java.lang.String alias) {
		return new org.apache.cloudstack.db.jooq.generated.tables.ClusterDetails(alias);
	}
}
