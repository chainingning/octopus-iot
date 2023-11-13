package com.summer.iot.core.message.codec;

import com.summer.iot.core.context.TransportContext;
import com.summer.iot.core.message.EncodedMessage;
import com.summer.iot.core.message.Message;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface DeviceMessageEncoder {

	/**
	 * Octopus统一消息格式 -----> 设备可以认识的, 经过协议编码后发给设备的报文
	 *
	 * @param message 消息
	 * @param context 消息编码上下文
	 * @return 编码后的报文
	 */
	EncodedMessage encode(TransportContext context, Message message, Object... hints);

	/**
	 * Octopus统一消息格式 -----> 设备可以认识的, 经过协议编码后发给设备的报文
	 *
	 * @param message 消息
	 * @return 编码后的报文
	 */
	default EncodedMessage encode(Message message) {
		return encode(null, message);
	}

}
