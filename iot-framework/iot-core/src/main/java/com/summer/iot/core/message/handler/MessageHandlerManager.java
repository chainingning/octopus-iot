package com.summer.iot.core.message.handler;

import com.summer.iot.core.context.TransportContext;
import com.summer.iot.core.message.Message;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface MessageHandlerManager {
	/**
	 * 处理消息
	 *
	 * @param transportContext 连接上下文
	 * @param message          消息DeviceMessageDecoder
	 * @param hints            hints
	 */
	void handleMessage(TransportContext transportContext, Message message, Object... hints);

}
