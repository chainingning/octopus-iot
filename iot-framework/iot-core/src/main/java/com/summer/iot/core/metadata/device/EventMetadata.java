package com.summer.iot.core.metadata.device;

import com.summer.iot.core.message.Jsonable;
import com.summer.iot.core.metadata.Metadata;
import com.summer.iot.core.metadata.type.DataType;
import com.summer.iot.core.metadata.type.DataTypes;

/**
 * <p>
 * 事件物模型
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface EventMetadata extends Metadata, Jsonable {

	/**
	 * 获取数据类型, 返回数据类型
	 *
	 * @return 数据类型
	 * @see DataTypes
	 */
	DataType getDataType();

}
