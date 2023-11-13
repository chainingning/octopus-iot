package com.summer.iot.core.device.listener;

import com.summer.iot.core.device.instance.DeviceDefinition;
import com.summer.iot.core.device.instance.DeviceInstance;
import com.summer.iot.core.device.registry.DeviceRegistry;

/**
 * <p>
 * 设备注册监听器
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface DeviceRegistryAwareListener extends DeviceLifecycleListener{

	/**
	 * 设备注册回调
	 *
	 * @param deviceDefinition 注册信息
	 * @param deviceRegistry   注册中心
	 */
	default void onRegistry(DeviceDefinition deviceDefinition, DeviceRegistry deviceRegistry) {

	}


	/**
	 * 注销回调
	 *
	 * @param deviceInstance 设备实例
	 * @param deviceRegistry 设备注册中心
	 */
	default void onUnregister(DeviceInstance deviceInstance, DeviceRegistry deviceRegistry) {

	}
}
