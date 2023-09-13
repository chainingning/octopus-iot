package com.summer.iot.core.metadata.type;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
@Getter
@Setter
public abstract class AbstractType<T> implements DataType {

	/**
	 * 类型描述
	 */
	private String description;

	/**
	 * 拓展属性
	 */
	private Map<String, Object> expands;


	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 获取拓展字段
	 *
	 * @return 拓展字段
	 */
	@Override
	public Map<String, Object> getExpands() {
		//如果 expands 不为 null，则返回 expands 的值，否则返回一个空的 Map
		return Optional.ofNullable(expands).orElseGet(Collections::emptyMap);
	}

	/**
	 * 添加拓展属性
	 *
	 * @param expands 拓展
	 * @return 属性对象
	 */
	@SuppressWarnings("all")
	public T expands(Map<String, Object> expands) {
		if (CollectionUtils.isEmpty(expands)) {
			return (T) this;
		}
		if (this.expands == null) {
			this.expands = new HashMap<>();
		}
		this.expands.putAll(expands);
		return (T) this;
	}
}
