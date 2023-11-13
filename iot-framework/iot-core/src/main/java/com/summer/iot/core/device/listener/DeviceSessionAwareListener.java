package com.summer.iot.core.device.listener;

import com.summer.iot.core.device.session.DeviceSession;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface DeviceSessionAwareListener extends DeviceLifecycleListener {
	/**
	 * 设备Session注册回调
	 *
	 * @param session              设备Session
	 * @param deviceSessionManager Session管理器
	 */
	default void onSessionRegister(DeviceSession session, DeviceSessionManager deviceSessionManager) {
	}


	/**
	 * 设备Session移除回调
	 *
	 * @param deviceSession        设备Session移除
	 * @param deviceSessionManager Session管理器
	 */
	default void onSessionUnregister(DeviceSession deviceSession, DeviceSessionManager deviceSessionManager) {
	}
}
