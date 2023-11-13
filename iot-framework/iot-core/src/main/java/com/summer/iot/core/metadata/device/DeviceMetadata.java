package com.summer.iot.core.metadata.device;

import com.summer.iot.core.message.Jsonable;
import com.summer.iot.core.metadata.Metadata;

import java.util.List;
import java.util.Optional;

/**
 * <p>
 * 设备元数据, 物模型抽象, 物模型包括 属性 {@link AttributeMetadata} 、 服务{@link ServiceMetadata}
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface DeviceMetadata extends Metadata, Jsonable {

	/**
	 * 获取所有属性元数据
	 *
	 * @return 属性数据
	 */
	List<AttributeMetadata> getAttributeMetadata();

	/**
	 * 获取服务元数据
	 *
	 * @return 服务元数据列表
	 */
	List<ServiceMetadata> getServiceMetadata();

	/**
	 * 获取事件元数据模型
	 *
	 * @return 事件元数据模型列表
	 */
	List<EventMetadata> getEventMetadata();

	/**
	 * 根据属性标识,获取所有属性元数据
	 *
	 * @param attributeCode 属性CODE
	 * @return 属性数据
	 */
	Optional<AttributeMetadata> getAttributeMetadata(String attributeCode);

	/**
	 * 根据服务标识,获取服务元数据
	 *
	 * @param serviceCode 服务CODE
	 * @return 服务元数据列表
	 */
	Optional<ServiceMetadata> getServiceMetadata(String serviceCode);


	/**
	 * 根据事件标识,获取事件元数据模型
	 *
	 * @param eventCode 事件唯一标识
	 * @return 获取
	 */
	Optional<EventMetadata> getEventMetadata(String eventCode);
}
