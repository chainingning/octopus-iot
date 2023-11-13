package com.summer.iot.core.message.device;

import cn.hutool.json.JSONUtil;
import org.springframework.lang.Nullable;

/**
 * <p>
 * 抽象设备消息, 用于封装通用的属性与操作
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public abstract class AbstractDeviceMessageReply extends AbstractDeviceMessage implements DeviceMessageReply {
	/**
	 * 是否成功
	 */
	private boolean isSuccess;
	/**
	 * 消息ID
	 */
	private String messageId;
	/**
	 * 消息结果
	 */
	private String code;
	/**
	 * 回复消息内容
	 */
	private String message;
	/**
	 * 时间戳
	 */
	private long timestamp;
	/**
	 * 目标设备唯一标识
	 */
	private String targetDeviceCode;

	/**
	 * 消息是否成功
	 *
	 * @return 消息是否成功
	 */
	@Override
	public boolean isSuccess() {
		return this.isSuccess;
	}

	public AbstractDeviceMessageReply setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
		return this;
	}

	@Nullable
	@Override
	public String getCode() {
		return this.code;
	}

	public AbstractDeviceMessageReply setCode(String code) {
		this.code = code;
		return this;
	}

	@Nullable
	@Override
	public String getMessage() {
		return this.message;
	}

	public AbstractDeviceMessageReply setMessage(String message) {
		this.message = message;
		return this;
	}

	@Override
	public AbstractDeviceMessageReply ofJsonStr(String jsonStr) {
		return JSONUtil.toBean(jsonStr, AbstractDeviceMessageReply.class);
	}

	@Override
	public String getMessageId() {
		return messageId;
	}

	@Override
	public AbstractDeviceMessageReply setMessageId(String messageId) {
		this.messageId = messageId;
		return this;
	}

	@Override
	public String toJsonStr() {
		return JSONUtil.toJsonStr(this);
	}

	@Override
	public long getTimestamp() {
		return this.timestamp;
	}

	@Override
	public AbstractDeviceMessageReply setTimestamp(long timestamp) {
		//设置时间戳
		this.timestamp = timestamp;
		return this;
	}

	public String getTargetDeviceCode() {
		return targetDeviceCode;
	}

	public AbstractDeviceMessageReply setTargetDeviceCode(String targetDeviceCode) {
		this.targetDeviceCode = targetDeviceCode;
		return this;
	}
}
