package com.summer.iot.core.context;

import com.summer.iot.core.device.registry.DeviceRegistry;
import com.summer.iot.core.device.session.DeviceSessionManager;
import com.summer.iot.core.message.handler.MessageHandlerManager;
import com.summer.iot.core.network.Network;
import com.summer.iot.core.protocol.Protocol;

/**
 * <p>
 * TransportContext上下文
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface TransportContext {
	/**
	 * 获取Network
	 *
	 * @return network
	 */
	Network getNetwork();

	/**
	 * 获取MessageHandlerManager
	 *
	 * @return MessageHandlerManager
	 */
	MessageHandlerManager getMessageHandlerManager();

	/**
	 * 设备注册中心
	 *
	 * @return 设备注册中心
	 */
	DeviceRegistry getDeviceRegistry();

	/**
	 * 设备Session管理器
	 *
	 * @return 设备Session管理器
	 */
	DeviceSessionManager getDeviceSessionManager();

	/**
	 * 获取协议
	 *
	 * @return 协议
	 */
	Protocol getProtocol();
}
