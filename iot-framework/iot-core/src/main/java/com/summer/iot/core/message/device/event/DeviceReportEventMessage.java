package com.summer.iot.core.message.device.event;

import com.summer.iot.core.message.MessageType;
import com.summer.iot.core.message.device.AbstractDeviceMessage;

/**
 * <p>
 * Device -> Platform
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class DeviceReportEventMessage extends AbstractDeviceMessage {
	/**
	 * 事件唯一标识
	 */
	private String eventCode;
	/**
	 * 输出值
	 */
	private String data;

	public String getEventCode() {
		return eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public MessageType getMessageType() {
		return null;
	}
}
