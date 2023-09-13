package com.summer.iot.core.metadata.unit;

/**
 * <p>
 * 有单位的类型
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface UnitSupported {

	/**
	 * 获取单位信息
	 *
	 * @return 单位信息
	 */
	DataTypeUnit getUnit();

	/**
	 * 设置单位
	 *
	 * @param unit 单位
	 */
	void setUnit(DataTypeUnit unit);
}
