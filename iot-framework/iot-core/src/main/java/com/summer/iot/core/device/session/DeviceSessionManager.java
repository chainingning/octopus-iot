package com.summer.iot.core.device.session;

import com.summer.iot.core.device.listener.DeviceSessionAwareListener;

import java.util.Optional;

/**
 * <p>
 * SessionManager, 管理设备Session , 负责设备Session整个生命周期的管理,
 * </p>
 * 当需要对设备Session的声明周期进行监听时, 使用 {@link DeviceSessionAwareListener}实现, 并注册为Spring bean
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface DeviceSessionManager {
	/**
	 * 获取设备Session
	 *
	 * @param sessionId 设备编码
	 * @return DeviceSession
	 */
	Optional<DeviceSession> getDeviceSession(String sessionId);

	/**
	 * 获取设备Session
	 *
	 * @param deviceId   设备编码
	 * @param childrenId 子设备编码
	 * @return DeviceSession
	 */
	Optional<DeviceSession> getChildDeviceSession(String deviceId, String childrenId);

	/**
	 * 注册DeviceSession
	 *
	 * @param session session
	 */
	void register(DeviceSession session);

	/**
	 * 注册子设备DeviceSession
	 *
	 * @param deviceId   deviceId
	 * @param childrenId childrenId
	 */
	void registerChildren(String deviceId, String childrenId);

	/**
	 * 设备Session是否存活
	 *
	 * @param sessionId sessionId
	 * @return 是否存活
	 */
	boolean isAlive(String sessionId);

	/**
	 * 注销
	 *
	 * @param sessionId 设备SessionId
	 */
	void unregister(String sessionId);

	/**
	 * 注销子设备
	 *
	 * @param sessionId  设备SessionId
	 * @param childrenId 子设备SessionId
	 */
	void unregisterChildren(String sessionId, String childrenId);

	/**
	 * 添加设备Session监听器
	 *
	 * @param deviceSessionAwareListener 设备Session监听器
	 */
	void addDeviceSessionListener(DeviceSessionAwareListener deviceSessionAwareListener);

	/**
	 * 初始化
	 */
	void init();

	/**
	 * 销毁
	 */
	void shutdown();
}
