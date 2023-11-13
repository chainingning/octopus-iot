package com.summer.iot.core.device.sender;

import com.summer.iot.core.device.sender.param.PropertyReadParam;
import com.summer.iot.core.device.sender.param.ServiceInvokeParam;
import com.summer.iot.core.message.device.DeviceMessageReply;
import lombok.NonNull;

import java.util.function.Consumer;

/**
 * <p>
 * DeviceMessageSender
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface DeviceMessageSender {
	/**
	 * 执行设备服务, 无回调
	 *
	 * @param serviceInvokeParam 参数
	 */
	void invokeService(@NonNull ServiceInvokeParam serviceInvokeParam);

	/**
	 * 执行设备服务
	 *
	 * @param serviceInvokeParam 参数
	 * @param replyConsumer      the Consumer of the Device response
	 */
	void invokeService(@NonNull ServiceInvokeParam serviceInvokeParam, @NonNull Consumer<DeviceMessageReply> replyConsumer);

	/**
	 * 下发读取设备属性
	 *
	 * @param propertyReadParam 透传参数
	 * @param replyConsumer     the Consumer of the Device response
	 */
	void readProperty(@NonNull PropertyReadParam propertyReadParam, @NonNull Consumer<DeviceMessageReply> replyConsumer);

}
