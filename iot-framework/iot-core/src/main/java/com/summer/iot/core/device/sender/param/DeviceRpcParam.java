package com.summer.iot.core.device.sender.param;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class DeviceRpcParam {
	/**
	 * 过期时间(超时等待)时间
	 */
	private long expirationTime = 0L;

	public long getExpirationTime() {
		return expirationTime;
	}

	public void setExpirationTime(long expirationTime) {
		this.expirationTime = expirationTime;
	}
}
