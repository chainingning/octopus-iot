package com.summer.iot.core.device.session;

import com.summer.iot.core.device.session.DeviceSession;

import java.util.Optional;

/**
 * <p>
 * HierarchicalDeviceSession
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface HierarchicalDeviceSession extends DeviceSession {
	/**
	 * 获取父DeviceSession, 如果是网关子设备, 那么他的父Session是网关设备
	 *
	 * @return 获取父DeviceSession
	 */
	Optional<DeviceSession> getParent();
}
