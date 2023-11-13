package com.summer.iot.core.message.device.service;

import com.summer.iot.core.message.MessageType;
import com.summer.iot.core.message.device.AbstractDeviceMessage;

/**
 * <p>
 * device -> platform
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class DeviceServiceInvokeMessageReply extends AbstractDeviceMessage {

	/**
	 * 服务标识符
	 */
	private String serviceCode;
	/**
	 * 是否成功
	 */
	private String success;
	/**
	 * 执行输出值
	 */
	private String output;

	@Override
	public MessageType getMessageType() {
		return MessageType.SERVICE_INVOKE_REPLY;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public DeviceServiceInvokeMessageReply setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
		return this;
	}

	public String getSuccess() {
		return success;
	}

	public DeviceServiceInvokeMessageReply setSuccess(String success) {
		this.success = success;
		return this;
	}

	public String getOutput() {
		return output;
	}

	public DeviceServiceInvokeMessageReply setOutputs(String output) {
		this.output = output;
		return this;
	}
}
