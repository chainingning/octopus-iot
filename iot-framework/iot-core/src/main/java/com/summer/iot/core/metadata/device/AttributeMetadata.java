package com.summer.iot.core.metadata.device;

import com.summer.iot.core.message.Jsonable;
import com.summer.iot.core.metadata.Metadata;
import com.summer.iot.core.metadata.type.DataType;

/**
 * <p>
 * 属性物模型数据
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface AttributeMetadata extends Metadata, Jsonable {

	/**
	 * 获取数据类型
	 *
	 * @return 数据类型
	 * @see DataTypes
	 */
	DataType getDataType();
}
