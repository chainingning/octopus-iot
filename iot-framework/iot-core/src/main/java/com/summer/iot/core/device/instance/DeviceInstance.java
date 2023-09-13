package com.summer.iot.core.device.instance;

import org.springframework.core.AttributeAccessor;

/**
 * <p>
 * 设备实例抽象
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface DeviceInstance extends AttributeAccessor {
	/**
	 * 获取设备的唯一标识
	 *
	 * @return 设备唯一标识
	 */
	String getDeviceId();


}
