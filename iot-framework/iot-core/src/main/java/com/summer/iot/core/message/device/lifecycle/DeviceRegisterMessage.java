package com.summer.iot.core.message.device.lifecycle;

import com.summer.iot.core.message.MessageType;
import com.summer.iot.core.message.device.AbstractDeviceMessage;

/**
 * <p>
 * DeviceRegisterMessage
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class DeviceRegisterMessage extends AbstractDeviceMessage {

	@Override
	public MessageType getMessageType() {
		return MessageType.REGISTER;
	}
}
