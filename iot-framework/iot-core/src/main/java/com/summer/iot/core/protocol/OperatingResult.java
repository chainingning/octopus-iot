package com.summer.iot.core.protocol;

import com.summer.iot.core.message.Message;
import com.summer.iot.core.message.device.DeviceMessage;

/**
 * <p>
 * 操作结果
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class OperatingResult {

	/**
	 * 校验是否成功
	 */
	private boolean isSuccess;

	/**
	 * 返回的消息， 如果校验不成功， 则用于返回给设备
	 */
	private Message answerMessage = Message.EMPTY_MESSAGE;

	public OperatingResult(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public static OperatingResult error(DeviceMessage error) {
		return new OperatingResult(false).setAnswerMessage(error);
	}

	public static OperatingResult success() {
		return new OperatingResult(true);
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public OperatingResult setSuccess(boolean success) {
		isSuccess = success;
		return this;
	}

	public Message getAnswerMessage() {
		return answerMessage;
	}

	public OperatingResult setAnswerMessage(Message answerMessage) {
		this.answerMessage = answerMessage;
		return this;
	}
}
