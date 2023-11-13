package com.summer.iot.core.message;

import com.summer.iot.core.message.device.lifecycle.DeviceRegisterMessage;

import java.util.function.Supplier;

/**
 * <p>
 * MessageTypes
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public enum MessageType {

	/**
	 * 设备注册
	 */
	REGISTER(DeviceRegisterMessage::new),

	/**
	 * 设备注销
	 */
	UN_REGISTER(DeviceRegisterMessage::new),

	/**
	 * 设备上线
	 */
	ONLINE(DeviceRegisterMessage::new),

	/**
	 * 设备离线
	 */
	OFFLINE(DeviceRegisterMessage::new),

	/**
	 * 心跳包
	 */
	HEAT_BEAT(DeviceRegisterMessage::new),

	/**
	 * 设备上报属性
	 */
	REPORT_ATTRIBUTE(DeviceRegisterMessage::new),

	/**
	 * 设备上报事件
	 */
	REPORT_EVENT(DeviceRegisterMessage::new),

	/**
	 * 读取设备属性
	 */
	READ_ATTRIBUTE(DeviceRegisterMessage::new),

	/**
	 * 调用设备服务
	 */
	INVOKE_SERVICE(DeviceRegisterMessage::new),

	/**
	 * 设备更新或追加Octopus系统中的事件模型
	 */
	UPDATE_META_EVENT(DeviceRegisterMessage::new),

	/**
	 * 设备更新或追加Octopus系统中的属性信息
	 */
	UPDATE_META_PROPERTY(DeviceRegisterMessage::new),

	/**
	 * 设备更新或追加Octopus系统中的服务模型
	 */
	UPDATE_META_SERVICE(DeviceRegisterMessage::new),

	/**
	 * 服务回调 replay
	 */
	SERVICE_INVOKE_REPLY(DeviceRegisterMessage::new),

	/**
	 * 请求成功 replay
	 */
	REQUEST_OK_REPLAY(DeviceRegisterMessage::new),

	/**
	 * 请求失败 replay
	 */
	REQUEST_ERR_REPLAY(DeviceRegisterMessage::new),

	/**
	 * 下行子设备消息
	 */
	CHILD(DeviceRegisterMessage::new),

	/**
	 * 上行子设备回复消息
	 */
	CHILD_REPLAY(DeviceRegisterMessage::new);

	/**
	 * 属性实例
	 */
	private Supplier<? extends Message> newInstance;


	MessageType(Supplier<? extends Message> newInstance) {
		this.newInstance = newInstance;
	}
}
