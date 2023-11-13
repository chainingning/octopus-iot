package com.summer.iot.core.message.device.attribute;

import com.summer.iot.core.message.MessageType;
import com.summer.iot.core.message.device.AbstractDeviceMessageReply;
import com.summer.iot.core.message.device.DeviceMessageReply;

import java.util.Map;
import java.util.Optional;

/**
 * <p>
 * 设备属性上报
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class DeviceReportAttributeMessage extends AbstractDeviceMessageReply implements DeviceMessageReply {
	/**
	 * 设备上报的属性, key-> 设备集中定义的属性唯一标识, value 是响应的值
	 */
	private Map<String, Object> properties;

	/**
	 * 创建一个上报消息
	 *
	 * @return 上报消息
	 */
	public static DeviceReportAttributeMessage create() {
		return new DeviceReportAttributeMessage();
	}

	@Override
	public MessageType getMessageType() {
		return MessageType.REPORT_ATTRIBUTE;
	}

	public Map<String, Object> getProperties() {
		return properties;
	}

	public DeviceReportAttributeMessage setProperties(Map<String, Object> properties) {
		this.properties = properties;
		return this;
	}

	/**
	 * 获取上报属性
	 *
	 * @param property 上报属性key
	 * @return 上报属性对象
	 */
	public Optional<Object> getProperty(String property) {
		return Optional
				.ofNullable(properties)
				.map(map -> map.get(property));
	}
}
