package com.summer.iot.core.message.handler;

import com.summer.iot.core.context.TransportContext;
import com.summer.iot.core.message.Message;
import com.summer.iot.core.network.types.NetworkType;
import lombok.NonNull;

import java.util.Set;

/**
 * <p>
 * 消息处理器, 具有优先顺序, 使用 {@link org.springframework.core.annotation.Order} 注解规定优先级,
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface MessageHandler {

	/**
	 * 获取支持的网络类型
	 *
	 * @return 网络类型
	 */
	Set<NetworkType> getNetworkTypes();

	/**
	 * 处理器是否支持对传入消息的处理
	 *
	 * @param message 消息
	 * @param hints   提示
	 * @return 是否支持
	 */
	default boolean supports(Message message,Object... hints){return false;}

	/**
	 * 处理消息
	 *
	 * @param transportContext 连接上下文 , 不能为空
	 * @param message          do nothing if null
	 * @param hints            hints
	 * @return 是否继续执行
	 */
	boolean handleMessage(@NonNull TransportContext transportContext, @NonNull Message message, Object... hints);

}
