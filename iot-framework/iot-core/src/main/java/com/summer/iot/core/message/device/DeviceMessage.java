package com.summer.iot.core.message.device;

import com.summer.iot.core.message.Message;
import org.springframework.lang.NonNull;

import java.util.Collections;
import java.util.Map;

/**
 * <p>
 * 设备消息
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface DeviceMessage extends Message {
	/**
	 * 获取 设备CODE, 是设备的唯一标识
	 *
	 * @return 唯一标识 设备CODE
	 */
	@NonNull
	String getDeviceCode();

	/**
	 * 获取请求头
	 *
	 * @return 请求头
	 */
	@NonNull
	@Override
	default Map<String, Object> getHeaders() {
		return Collections.emptyMap();
	}

	/**
	 * 添加请求头
	 *
	 * @param header 请求头key
	 * @param value  值
	 * @return 消息
	 */
	@Override
	default Message addHeader(String header, Object value) {
		return this;
	}


	/**
	 * 不存在则添加
	 *
	 * @param header header key
	 * @param value  header 值
	 * @return 消息
	 */
	@Override
	default Message addHeaderIfAbsent(String header, Object value) {
		return this;
	}

	/**
	 * 删除头
	 *
	 * @param header header
	 * @return 消息
	 */
	@Override
	default Message removeHeader(String header) {
		return this;
	}
}
