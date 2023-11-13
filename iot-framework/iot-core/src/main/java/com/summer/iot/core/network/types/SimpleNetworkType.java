package com.summer.iot.core.network.types;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * <p>
 * SimpleNetworkType
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
@Getter
@AllArgsConstructor(staticName = "of")
public class SimpleNetworkType  implements NetworkType {
	private final String id;

	/**
	 * 获取网络连接的名称
	 *
	 * @return 名称
	 */
	@Override
	public String getName() {
		return getId();
	}
}
