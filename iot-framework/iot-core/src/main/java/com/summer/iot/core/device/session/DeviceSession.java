package com.summer.iot.core.device.session;

import com.summer.iot.core.device.instance.DeviceInstance;
import com.summer.iot.core.message.EncodedMessage;
import com.summer.iot.core.network.types.NetworkType;

/**
 * <p>
 * 设备Session
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface DeviceSession {
	/**
	 * 设备Session ID , 默认采用
	 *
	 * @return SessionId
	 */
	default String getSessionId() {
		return getDeviceCode();
	}

	/**
	 * 设备唯一标识CODE
	 *
	 * @return 设备唯一CODE
	 */
	String getDeviceCode();

	/**
	 * 获取网络类型
	 *
	 * @return 网络类型
	 */
	NetworkType getNetworkType();

	/**
	 * 是否还在激活状态
	 *
	 * @return 是否激活
	 */
	boolean isAlive();

	/**
	 * 获取上一次ping的时间
	 *
	 * @return 上一次ping的时间
	 */
	long getLastPingTime();

	/**
	 * 获取设备连接的时间
	 *
	 * @return 设备连接时间
	 */
	long getConnectTime();

	/**
	 * 获取设备操作
	 *
	 * @return 设备操作
	 */
	DeviceInstance getDeviceInstance();

	/**
	 * 发送消息给会话
	 *
	 * @param message 编码后消息
	 * @param args    args
	 */
	void send(EncodedMessage message, Object... args);

	/**
	 * 关闭session
	 */
	void close();

	/**
	 * ping 操作
	 */
	void ping();

	/**
	 * keepAlive
	 */
	default void keepAlive() {
		ping();
	}
}
