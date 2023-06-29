package com.summer.iot.rule.engine.facts;

import java.util.Objects;

/**
 * <p>
 *  对象之间及对象属性之间的关系,用于表示规则执行过程中的事实或数据。具体看{@link Facts}
 * <p>
 * @param <T> 事实类型
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class Fact<T> {
	private final String name;
	private final T value;


	public Fact(String name, T value) {
		Objects.requireNonNull(name, "name must not be null");
		Objects.requireNonNull(value, "value must not be null");
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public T getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Fact{" +
				"name='" + name + '\'' +
				", value=" + value +
				'}';
	}

	/**
	 * 每个事实都有一个唯一的名称,so，equals/hashcode是故意仅根据事实名称计算的。
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Fact<?> fact = (Fact<?>) o;
		return name.equals(fact.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
