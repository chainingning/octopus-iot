package com.summer.iot.core.device.instance;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public enum DeviceStateEnum {
	/**
	 * 在线状态
	 */
	ONLINE("online"),

	/**
	 * 离线状态
	 */
	OFFLINE("offline"),

	/**
	 * 未知
	 */
	UNKNOWN("unknown"),

	/**
	 * 超时
	 */
	TIMEOUT("timeout"),

	/**
	 * 未激活
	 */
	INACTIVE("inactive");


	private String state;

	DeviceStateEnum(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}
