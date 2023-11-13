package com.summer.iot.core.device.listener;

import com.summer.iot.core.device.instance.DeviceDefinition;
import com.summer.iot.core.device.instance.DeviceInstance;

/**
 * <p>
 * 设备状态监听器
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface DeviceLifecycleListener {

	/**
	 * 设备创建前
	 *
	 * @param deviceDefinition 设备信息
	 */
	default void beforeCreation(DeviceDefinition deviceDefinition) {
	}


	/**
	 * DeviceInstance创建后回调
	 *
	 * @param deviceDefinition 设备信息
	 * @param deviceInstance   设备实例
	 * @return 设备实例
	 */
	default DeviceInstance afterCreation(DeviceDefinition deviceDefinition, DeviceInstance deviceInstance) {
		return deviceInstance;
	}
}
