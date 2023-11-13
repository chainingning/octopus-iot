package com.summer.iot.core.message.device.lifecycle;

import com.summer.iot.core.message.MessageType;
import com.summer.iot.core.message.device.AbstractDeviceMessage;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class DeviceHeatBeatMessage extends AbstractDeviceMessage {

	@Override
	public MessageType getMessageType() {
		return MessageType.HEAT_BEAT;
	}
}
