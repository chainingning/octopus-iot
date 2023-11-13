package com.summer.iot.core.device.sender.param;

import cn.hutool.core.util.IdUtil;
import com.summer.iot.core.message.device.attribute.DeviceReadAttributeMessage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 下发后去属性参数
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class PropertyReadParam extends DeviceRpcParam{
	/**
	 * 设备读取属性消息
	 */
	private final DeviceReadAttributeMessage deviceReadAttributeMessage;

	private PropertyReadParam(DeviceReadAttributeMessage deviceReadAttributeMessage) {
		this.deviceReadAttributeMessage = deviceReadAttributeMessage;
	}

	public static Builder builder() {
		return new Builder();
	}

	/**
	 * 构建器
	 */
	public static class Builder {
		/**
		 * 属性
		 */
		private final List<String> properties = new ArrayList<>();
		/**
		 * 设备CODE
		 */
		private String deviceCode;
		/**
		 * 消息ID
		 */
		private String messageId = IdUtil.simpleUUID();
		/**
		 * 时间戳
		 */
		private long timestamp = System.currentTimeMillis();
		/**
		 * 消息头
		 */
		private Map<String, Object> headers;

		public Builder deviceCode(String deviceCode) {
			this.deviceCode = deviceCode;
			return this;
		}

		public Builder property(String property) {
			this.properties.add(property);
			return this;
		}

		public Builder properties(List<String> properties) {
			this.properties.addAll(properties);
			return this;
		}

		public Builder messageId(String messageId) {
			this.messageId = messageId;
			return this;
		}

		public Builder timestamp(long timestamp) {
			this.timestamp = timestamp;
			return this;
		}

		public Builder headers(Map<String, Object> headers) {
			this.headers = headers;
			return this;
		}

		public PropertyReadParam build() {
			DeviceReadAttributeMessage deviceReadAttributeMessage = new DeviceReadAttributeMessage();
			deviceReadAttributeMessage.setProperties(properties)
					.setMessageId(messageId)
					.setTimestamp(timestamp)
					.setHeaders(headers)
					.setDeviceCode(deviceCode);
			return new PropertyReadParam(deviceReadAttributeMessage);
		}

	}
}
