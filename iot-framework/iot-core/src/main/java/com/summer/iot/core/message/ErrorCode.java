package com.summer.iot.core.message;

/**
 * <p>
 * 内置消息错误代码
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public enum ErrorCode {
	/**
	 * 解析消息错误
	 */
	ERROR_PARSE_MESSAGE("Error Parse Message", "Message format is wrong"),
	/**
	 * 不合法的帧头
	 */
	INVALID_FRAME_HEADER("Invalid Frame Header", "Frame header must start with 0xef"),
	/**
	 * 不合法的帧类型
	 */
	INVALID_FRAME_TYPE("Invalid Frame Type", "Not found the provided frame type"),
	/**
	 * CRC校验位值错误
	 */
	ERROR_CRC_VALUE("Error Crc Value", "Crc value is wrong"),
	/**
	 * 不合法的设备标识符
	 */
	INVALID_DEVICE_CODE("Invalid DeviceCode", "DeviceCode is null or invalid"),
	/**
	 * 不合法的事件标识符
	 */
	INVALID_EVENT_CODE("Invalid EventCode", "EventCode is null or invalid"),
	/**
	 * 不合法的服务标识符
	 */
	INVALID_SERVICE_CODE("Invalid ServiceCode", "ServiceCode is null or invalid"),
	/**
	 * 错误的消息内容
	 */
	ERROR_MESSAGE_CONTENT("Error Message Content", "Message content is not valid"),
	/**
	 * 设备没有登录
	 */
	ERROR_NOT_LOGIN("Device not login", "Device not login"),
	/**
	 * 目标设备没有登录
	 */
	ERROR_TARGET_DEVICE_NOT_LOGIN("Target device not login", "Target device not login"),
	/**
	 * 设备未注册
	 */
	ERROR_DEVICE_NOT_REGISTER("Device not register", "Device Not Register , Register first"),
	/**
	 * 设备透传目标设备未注册
	 */
	ERROR_TARGET_DEVICE_NOT_REGISTER("Target Device not register", "Target Device Not Register , Send message failed"),
	/**
	 * 不合法的设备透传类型
	 */
	INVALID_PENETRATE_REQUEST_TYPE("Invalid penetrate request type", "Valid penetrate type DEVICE/URL"),
	/**
	 * 等待设备透传回复超时
	 */
	WAIT_PENETRATE_REPLAY_TIME_OUT("Wait penetrate replay time out", "Wait target device replay time out"),
	/**
	 * http请求类型错误
	 */
	INVALID_HTTP_REQUEST_TYPE("Invalid http request type","Only get/post valid"),
	/**
	 * URL格式错误
	 */
	INVALID_HTTP_URL("Invalid http url","Invalid http url"),
	/**
	 * http请求失败
	 */
	HTTP_REQUEST_FAILED("Http request failed","Http request failed");

	/**
	 * 错误代码
	 */
	private final String code;
	/**
	 * 错误消息
	 */
	private final String message;

	ErrorCode(String code, String message){
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public String getMessage() {
		return this.message;
	}

	public static ErrorCode of(String code) {
		if (code != null) {
			final ErrorCode[] values = values();
			for (ErrorCode value : values) {
				if (code.equals(value.getCode())) {
					return value;
				}
			}
		}
		return null;
	}

}
