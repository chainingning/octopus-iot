package com.summer.iot.core.message.codec;

import com.summer.iot.core.context.TransportContext;
import com.summer.iot.core.message.EncodedMessage;
import com.summer.iot.core.message.device.DeviceMessage;

/**
 * <p>
 * 消息编码器 , 将转给设备接受或者发出的, 已经编码过的消息 {@link EncodedMessage} 换成 平台统一的消息 {@link DeviceMessage}
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface DeviceMessageDecoder {

	/**
	 * 设备可以认识的, 经过协议编码后发给设备的报文 -----> Platform统一消息格式
	 *
	 * @param context 消息解码上下文
	 * @param data    数据
	 * @param hints   hints
	 * @return Octopus统一消息格式
	 */
	DeviceMessage decode(TransportContext context, Object data, Object... hints);

}
