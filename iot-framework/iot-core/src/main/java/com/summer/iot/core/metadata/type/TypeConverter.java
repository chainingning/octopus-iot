package com.summer.iot.core.metadata.type;

/**
 * <p>
 * 数据类型转换器
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface TypeConverter<T> {

	/**
	 * convert source to T
	 *
	 * @param source 转换源
	 * @return 转后
	 */
	T convert(Object source);
}