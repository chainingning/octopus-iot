package com.summer.iot.core.network;

import com.summer.iot.core.network.property.NetworkProperties;
import com.summer.iot.core.network.types.NetworkType;

/**
 * <p>
 * 可连接组件顶层设计
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface Network {
	/**
	 * 该网络组件是否存活
	 *
	 * @return 是否存活
	 */
	boolean isAlive();

	/**
	 * 关闭网络组件
	 */
	void shutdown();

	/**
	 * 获取网络组件唯一标识
	 *
	 * @return 唯一标识
	 */
	String getId();

	/**
	 * 获取网络组件的连接类型
	 *
	 * @return 连接类型
	 */
	NetworkType getNetworkType();

	/**
	 * 获取网络组件配置
	 * @return 网络组件配置
	 */
	NetworkProperties getNetworkProperties();
}
