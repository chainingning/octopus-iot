package com.summer.iot.core.device.registry;

import com.summer.iot.core.device.instance.DeviceDefinition;
import com.summer.iot.core.device.instance.DeviceInstance;
import com.summer.iot.core.device.listener.DeviceRegistryAwareListener;

import java.util.Optional;

/**
 * <p>
 * 设备注册中心
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface DeviceRegistry {
	/**
	 * 获取设备操作对象
	 *
	 * @param deviceCode 设备唯一标识
	 * @return 设备操作实例
	 */
	Optional<DeviceInstance> getDevice(String deviceCode);

	/**
	 * 注册设备
	 *
	 * @param deviceDefinition 设备信息
	 * @return 设备操作实例
	 */
	DeviceInstance register(DeviceDefinition deviceDefinition);

	/**
	 * 根据设备
	 *
	 * @param deviceCode 设备唯一标识
	 */
	void unregisterDevice(String deviceCode);

	/**
	 * 添加监听器
	 *
	 * @param deviceRegistryAwareListener 设备注册监听器
	 */
	void addDeviceRegistryListeners(DeviceRegistryAwareListener deviceRegistryAwareListener);

}
