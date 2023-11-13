package com.summer.iot.core.message;

import io.netty.buffer.ByteBuf;

/**
 * <p>
 * 已编码的消息,通常为来自设备或者发向设备的原始报文
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface EncodedMessage {
	/**
	 * 获取
	 * @return
	 */
	ByteBuf getPayload();
}
