package com.summer.iot.core.message.device;

import cn.hutool.json.JSONUtil;
import org.springframework.lang.NonNull;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <p>
 * 设备Message, 包括 设备接入平台发送的消息和 平台发送到设备的消息,空实现getType，交给具体的消息处理
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public abstract class AbstractDeviceMessage implements DeviceMessage  {

	public static final String ERROR_MSG = "failed to convert Message into JSON , DeviceCode = {}. messageId = {}";
	//TODO logger

	/**
	 * 消息ID
	 */
	private String messageId;

	/**
	 * 设备CODE
	 */
	private String deviceCode;

	/**
	 * 设备集唯一标识
	 */
	private String deviceSetId;

	/**
	 * 消息头
	 */
	private Map<String, Object> headers;

	/**
	 * 时间戳
	 */
	private long timestamp = System.currentTimeMillis();

	/**
	 * 消息内容
	 */
	private String content;


	@Override
	public synchronized DeviceMessage addHeader(String header, Object value) {
		if (headers == null) {
			this.headers = new ConcurrentHashMap<>(16);
		}
		if (header != null && value != null) {
			this.headers.put(header, value);
		}
		return this;
	}

	@Override
	public synchronized DeviceMessage addHeaderIfAbsent(String header, Object value) {
		if (headers == null) {
			this.headers = new ConcurrentHashMap<>(16);
		}
		if (header != null && value != null) {
			this.headers.putIfAbsent(header, value);
		}
		return this;
	}

	@Override
	public DeviceMessage removeHeader(String header) {
		if (this.headers != null) {
			this.headers.remove(header);
		}
		return this;
	}

	@Override
	public String toJsonStr() {
		return JSONUtil.toJsonStr(this);
	}

	@Override
	public AbstractDeviceMessage ofJsonStr(String jsonStr) {
		return JSONUtil.toBean(jsonStr, AbstractDeviceMessage.class);
	}

	@Override
	public String toString() {
		return toJsonStr();
	}


	@Override
	public String getMessageId() {
		return messageId;
	}

	public AbstractDeviceMessage setMessageId(String messageId) {
		this.messageId = messageId;
		return this;
	}

	@NonNull
	@Override
	public String getDeviceCode() {
		return deviceCode;
	}

	public AbstractDeviceMessage setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
		return this;
	}

	@NonNull
	@Override
	public Map<String, Object> getHeaders() {
		return headers;
	}

	public AbstractDeviceMessage setHeaders(Map<String, Object> headers) {
		this.headers = headers;
		return this;
	}

	@Override
	public long getTimestamp() {
		return timestamp;
	}

	public AbstractDeviceMessage setTimestamp(long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	public String getContent() {
		return content;
	}

	public AbstractDeviceMessage setContent(String content) {
		this.content = content;
		return this;
	}

	public String getDeviceSetId() {
		return deviceSetId;
	}

	public void setDeviceSetId(String deviceSetId) {
		this.deviceSetId = deviceSetId;
	}

}
