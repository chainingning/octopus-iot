package com.summer.iot.core.network.property;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  Properties of Network
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
@Data
public class NetworkProperties implements Serializable {

	/**
	 * 配置id
	 */
	private String id;

	/**
	 * 额外配置内容，不同的网络组件，配置内容不同
	 */
	private Map<String, Object> configurations = new HashMap<>();

	/**
	 * 网络类型
	 */
	private String networkType;

	/**
	 * 协议
	 */
	private String protocolCode;


	public Object getConfig(String key) {
		return configurations.get(key);
	}

	public void putConfig(String key, Object val) {
		configurations.put(key, val);
	}
}
