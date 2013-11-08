/**
 * This class is generated by jOOQ
 */
package org.apache.cloudstack.db.jooq.generated.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "op_lock", schema = "cloud")
public class OpLock implements java.io.Serializable {

	private static final long serialVersionUID = 125753159;

	private java.lang.String   key;
	private java.lang.String   mac;
	private java.lang.String   ip;
	private java.lang.String   thread;
	private java.sql.Timestamp acquiredOn;
	private java.lang.Integer  waiters;

	public OpLock() {}

	public OpLock(
		java.lang.String   key,
		java.lang.String   mac,
		java.lang.String   ip,
		java.lang.String   thread,
		java.sql.Timestamp acquiredOn,
		java.lang.Integer  waiters
	) {
		this.key = key;
		this.mac = mac;
		this.ip = ip;
		this.thread = thread;
		this.acquiredOn = acquiredOn;
		this.waiters = waiters;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "key", unique = true, nullable = false, length = 128)
	public java.lang.String getKey() {
		return this.key;
	}

	public void setKey(java.lang.String key) {
		this.key = key;
	}

	@javax.persistence.Column(name = "mac", nullable = false, length = 17)
	public java.lang.String getMac() {
		return this.mac;
	}

	public void setMac(java.lang.String mac) {
		this.mac = mac;
	}

	@javax.persistence.Column(name = "ip", nullable = false, length = 40)
	public java.lang.String getIp() {
		return this.ip;
	}

	public void setIp(java.lang.String ip) {
		this.ip = ip;
	}

	@javax.persistence.Column(name = "thread", nullable = false, length = 255)
	public java.lang.String getThread() {
		return this.thread;
	}

	public void setThread(java.lang.String thread) {
		this.thread = thread;
	}

	@javax.persistence.Column(name = "acquired_on", nullable = false)
	public java.sql.Timestamp getAcquiredOn() {
		return this.acquiredOn;
	}

	public void setAcquiredOn(java.sql.Timestamp acquiredOn) {
		this.acquiredOn = acquiredOn;
	}

	@javax.persistence.Column(name = "waiters", nullable = false, precision = 10)
	public java.lang.Integer getWaiters() {
		return this.waiters;
	}

	public void setWaiters(java.lang.Integer waiters) {
		this.waiters = waiters;
	}
}
