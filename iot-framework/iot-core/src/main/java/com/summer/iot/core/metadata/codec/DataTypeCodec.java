package com.summer.iot.core.metadata.codec;

import com.summer.iot.core.metadata.type.DataType;

import java.util.Map;

/**
 * <p>
 * 数据类型编解码器
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface DataTypeCodec <T extends DataType>{

	/**
	 * 类型ID
	 *
	 * @return 绑定的类型ID
	 */
	String getTypeId();

	/**
	 * 根据DataType解码
	 *
	 * @param type   类型
	 * @param config config
	 * @return T type
	 */
	T decode(T type, Map<String, Object> config);

	/**
	 * 编码
	 *
	 * @param type 类型
	 * @return map
	 */
	Map<String, Object> encode(T type);
}
