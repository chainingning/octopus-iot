package com.summer.iot.core.format;

/**
 * <p>
 * 数据类型格式化,根据自己想要的结果去拼装或者转换
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface TypeFormat {

	/**
	 * 将Source转换成指定类型
	 *
	 * @param source 源
	 * @return 转后的值
	 */
	Object format(Object source);
}
