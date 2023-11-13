package com.summer.iot.core.network.types;

/**
 * <p>
 * 连接类型顶层抽象
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface NetworkType {

	/**
	 * 获取网络连接类型的唯一标识
	 *
	 * @return 唯一标识
	 */
	String getId();

	/**
	 * 获取网络连接的名称
	 *
	 * @return 名称
	 */
	default String getName() {
		return getId();
	}

	/**
	 * 使用指定的ID创建一个NetworkType
	 *
	 * @param id ID
	 * @return NetworkType
	 */
	static NetworkType of(String id) {
		return () -> id;
	}
}
