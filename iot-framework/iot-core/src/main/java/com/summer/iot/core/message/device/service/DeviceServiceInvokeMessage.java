package com.summer.iot.core.message.device.service;

import com.summer.iot.core.message.MessageType;
import com.summer.iot.core.message.device.AbstractDeviceMessage;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 服务调用
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class DeviceServiceInvokeMessage extends AbstractDeviceMessage{
	/**
	 * 目标设备唯一标识
	 */
	private String targetDeviceCode;
	/**
	 * 服务标识符
	 */
	private String serviceCode;
	/**
	 * 输入参数
	 */
	private Map<String, Object> inputs = new HashMap<>();

	/**
	 * 获取消息类型
	 *
	 * @return 消息类型
	 */
	@Override
	public MessageType getMessageType() {
		return MessageType.INVOKE_SERVICE;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public DeviceServiceInvokeMessage setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
		return this;
	}

	public Map<String, Object> getInputs() {
		return inputs;
	}

	public DeviceServiceInvokeMessage setInputs(Map<String, Object> inputs) {
		this.inputs = inputs;
		return this;
	}

	public String getTargetDeviceCode() {
		return targetDeviceCode;
	}

	public DeviceServiceInvokeMessage setTargetDeviceCode(String targetDeviceCode) {
		this.targetDeviceCode = targetDeviceCode;
		return this;
	}
}
