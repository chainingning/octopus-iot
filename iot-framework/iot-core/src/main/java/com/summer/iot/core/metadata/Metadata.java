package com.summer.iot.core.metadata;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

/**
 * <p>
 * 元数据顶层接口 , 元数据, <code>expand</code> 字段是每一个元数据都有的弹性域
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface Metadata {

	String KEY_EXPANDS = "expands";
	String KEY_DATA_TYPE = "dataType";
	String KEY_TYPE = "type";

	/**
	 * 获取源数据的唯一标识
	 *
	 * @return 获取元数据信息的ID
	 */
	String getId();

	/**
	 * 获取元数据的名称
	 *
	 * @return 元数据
	 */
	default String getName() {
		return getId();
	}

	/**
	 * 设置名称
	 *
	 * @param name 名称
	 */
	default void setName(String name) {
	}


	/**
	 * 获取描述
	 *
	 * @return 元数据表述
	 */
	String getDescription();

	/**
	 * 设置描述
	 *
	 * @param description 设置描述
	 */
	default void setDescription(String description) {
	}

	/**
	 * 根据拓展字段名称获取拓展字段类型
	 *
	 * @param name 属性名
	 * @return 对象
	 */
	default Optional<Object> getExpand(String name) {
		return Optional.ofNullable(getExpands())
				.map(map -> map.get(name));
	}

	/**
	 * 获取拓展字段
	 *
	 * @return 拓展字段
	 */
	default Map<String, Object> getExpands() {
		return Collections.emptyMap();
	}

	/**
	 * 设置拓展
	 *
	 * @param expands 拓展
	 */
	default void setExpands(Map<String, Object> expands) {
	}


}
