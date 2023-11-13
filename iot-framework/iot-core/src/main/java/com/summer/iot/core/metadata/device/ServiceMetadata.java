package com.summer.iot.core.metadata.device;

import com.summer.iot.core.message.Jsonable;
import com.summer.iot.core.metadata.Metadata;
import com.summer.iot.core.metadata.type.DataType;

import java.util.List;

/**
 * <p>
 * 服务物模型元数据
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface ServiceMetadata  extends Metadata, Jsonable {

	/**
	 * 获取服务调用中参数的定义
	 *
	 * @return 输入参数定义
	 */
	List<AttributeMetadata> getInputs();

	/**
	 * 获取服务调用中的输出参数定义
	 *
	 * @return 输出参数定义
	 */
	DataType getOutputs();

	/**
	 * 是否异步调用
	 *
	 * @return 同步<code>false</code>/ 异步<code>true</code>
	 */
	boolean isAsync();
}