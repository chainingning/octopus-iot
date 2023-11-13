package com.summer.iot.core.message.device.attribute;

import com.summer.iot.core.message.MessageType;
import com.summer.iot.core.message.device.AbstractDeviceMessage;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 平台主动读取设备属性消息
 * <p>
 * @see com.summer.iot.core.message.device.service.DeviceServiceInvokeMessageReply 回复
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 *
 */
public class DeviceReadAttributeMessage extends AbstractDeviceMessage {
	private List<String> properties = new ArrayList<>();

	public DeviceReadAttributeMessage addProperties(List<String> properties) {
		this.properties.addAll(properties);
		return this;
	}

	@Override
	public MessageType getMessageType() {
		return MessageType.READ_ATTRIBUTE;
	}

	public List<String> getProperties() {
		return properties;
	}

	public DeviceReadAttributeMessage setProperties(List<String> properties) {
		this.properties = properties;
		return this;
	}
}
