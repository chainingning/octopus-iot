package com.summer.iot.core.message.device;

/**
 * <p>
 * 设备消息的回复
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface DeviceMessageReply extends DeviceMessage{
	/**
	 * 请求是否成功
	 *
	 * @return 是否成功
	 */
	boolean isSuccess();

	/**
	 * 错误编码
	 *
	 * @return 错误编码
	 */
	String getCode();

	/**
	 * 错误消息
	 *
	 * @return 错误消息
	 */
	String getMessage();
}
