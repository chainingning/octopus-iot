package com.summer.iot.core.metadata.unit;

import java.util.List;
import java.util.Optional;

/**
 * <p>
 * 数据类型单位 提供者
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface DataTypeUnitSupplier {

	/**
	 * 根据id 获取DataType
	 *
	 * @param id DataTypeId
	 * @return 单位
	 */
	Optional<DataTypeUnit> getById(String id);

	/**
	 * 获取所有
	 *
	 * @return 所有数据类型单位
	 */
	List<DataTypeUnit> getAll();
}
