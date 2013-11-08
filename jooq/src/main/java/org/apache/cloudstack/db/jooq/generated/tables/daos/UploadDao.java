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
public class UploadDao extends org.jooq.impl.DAOImpl<org.apache.cloudstack.db.jooq.generated.tables.records.UploadRecord, org.apache.cloudstack.db.jooq.generated.tables.pojos.Upload, java.lang.Long> {

	/**
	 * Create a new UploadDao without any configuration
	 */
	public UploadDao() {
		super(org.apache.cloudstack.db.jooq.generated.tables.Upload.UPLOAD, org.apache.cloudstack.db.jooq.generated.tables.pojos.Upload.class);
	}

	/**
	 * Create a new UploadDao with an attached configuration
	 */
	public UploadDao(org.jooq.Configuration configuration) {
		super(org.apache.cloudstack.db.jooq.generated.tables.Upload.UPLOAD, org.apache.cloudstack.db.jooq.generated.tables.pojos.Upload.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(org.apache.cloudstack.db.jooq.generated.tables.pojos.Upload object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Upload> fetchById(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Upload.UPLOAD.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.apache.cloudstack.db.jooq.generated.tables.pojos.Upload fetchOneById(java.lang.Long value) {
		return fetchOne(org.apache.cloudstack.db.jooq.generated.tables.Upload.UPLOAD.ID, value);
	}

	/**
	 * Fetch records that have <code>host_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Upload> fetchByHostId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Upload.UPLOAD.HOST_ID, values);
	}

	/**
	 * Fetch records that have <code>type_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Upload> fetchByTypeId(java.lang.Long... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Upload.UPLOAD.TYPE_ID, values);
	}

	/**
	 * Fetch records that have <code>type IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Upload> fetchByType(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Upload.UPLOAD.TYPE, values);
	}

	/**
	 * Fetch records that have <code>mode IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Upload> fetchByMode(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Upload.UPLOAD.MODE, values);
	}

	/**
	 * Fetch records that have <code>created IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Upload> fetchByCreated(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Upload.UPLOAD.CREATED, values);
	}

	/**
	 * Fetch records that have <code>last_updated IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Upload> fetchByLastUpdated(java.sql.Timestamp... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Upload.UPLOAD.LAST_UPDATED, values);
	}

	/**
	 * Fetch records that have <code>job_id IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Upload> fetchByJobId(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Upload.UPLOAD.JOB_ID, values);
	}

	/**
	 * Fetch records that have <code>upload_pct IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Upload> fetchByUploadPct(java.lang.Integer... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Upload.UPLOAD.UPLOAD_PCT, values);
	}

	/**
	 * Fetch records that have <code>upload_state IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Upload> fetchByUploadState(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Upload.UPLOAD.UPLOAD_STATE, values);
	}

	/**
	 * Fetch records that have <code>error_str IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Upload> fetchByErrorStr(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Upload.UPLOAD.ERROR_STR, values);
	}

	/**
	 * Fetch records that have <code>url IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Upload> fetchByUrl(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Upload.UPLOAD.URL, values);
	}

	/**
	 * Fetch records that have <code>install_path IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Upload> fetchByInstallPath(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Upload.UPLOAD.INSTALL_PATH, values);
	}

	/**
	 * Fetch records that have <code>uuid IN (values)</code>
	 */
	public java.util.List<org.apache.cloudstack.db.jooq.generated.tables.pojos.Upload> fetchByUuid(java.lang.String... values) {
		return fetch(org.apache.cloudstack.db.jooq.generated.tables.Upload.UPLOAD.UUID, values);
	}
}
