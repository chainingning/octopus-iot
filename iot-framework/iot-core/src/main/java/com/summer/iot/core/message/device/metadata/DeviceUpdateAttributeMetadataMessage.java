package com.summer.iot.core.message.device.metadata;

import com.summer.iot.core.message.MessageType;
import com.summer.iot.core.message.device.AbstractDeviceMessage;

/**
 * <p>
 * platform -> device
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class DeviceUpdateAttributeMetadataMessage extends AbstractDeviceMessage {

	@Override
	public MessageType getMessageType() {
		return MessageType.UPDATE_META_PROPERTY;
	}
}
