package com.summer.iot.core.message;
import org.springframework.lang.Nullable;
import java.util.Map;

/**
 * <p>
 * 设备Message, 包括 设备接入平台发送的消息和 平台发送到设备的消息
 *
 * <p>
 * @see MessageType 消息类型
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface Message extends Jsonable{

	Message EMPTY_MESSAGE = new Message() {
		@Override
		public MessageType getMessageType() {
			return null;
		}

		@Override
		public String getMessageId() {
			return null;
		}

		@Override
		public long getTimestamp() {
			return 0;
		}

		@Nullable
		@Override
		public Map<String, Object> getHeaders() {
			return null;
		}

		@Override
		public Message addHeader(String header, Object value) {
			return null;
		}

		@Override
		public Message addHeaderIfAbsent(String header, Object value) {
			return null;
		}

		@Override
		public Message removeHeader(String header) {
			return null;
		}

		@Override
		public String toJsonStr() {
			return "";
		}

		@Override
		public Jsonable ofJsonStr(String jsonStr) {
			return this;
		}
	};

	/**
	 * 获取消息类型
	 *
	 * @return 消息类型
	 */
	MessageType getMessageType();

	/**
	 * 消息的唯一标识,用于在请求响应模式下对请求和响应进行关联.
	 * <p>
	 * 注意: 此消息ID为全系统唯一
	 *
	 * @return 消息ID
	 */
	String getMessageId();

	/**
	 * 获取毫秒时间戳
	 *
	 * @return 毫秒时间戳
	 * @see System#currentTimeMillis()
	 */
	long getTimestamp();

	/**
	 * 获取消息Headers ,见 [Octopus平台设备消息定义]
	 * 可选
	 *
	 * @return Map
	 */
	@Nullable
	Map<String, Object> getHeaders();

	/**
	 * 添加一个Header属性
	 *
	 * @param header header
	 * @param value  值
	 * @return 消息
	 */
	Message addHeader(String header, Object value);

	/**
	 * 添加header,如果header已存在则放弃
	 *
	 * @param header header key
	 * @param value  header 值
	 * @return this
	 */
	Message addHeaderIfAbsent(String header, Object value);

	/**
	 * 删除一个header
	 *
	 * @param header header
	 * @return this
	 */
	Message removeHeader(String header);
}
