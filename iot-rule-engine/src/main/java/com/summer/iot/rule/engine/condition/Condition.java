package com.summer.iot.rule.engine.condition;

import com.summer.iot.rule.engine.facts.Facts;

/**
 * <p>
 * 规则的条件接口，返回结果为True或False
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
@FunctionalInterface
public interface Condition {

	/**
	 * 根据条件来判断是否需要执行某个事实
	 * @param facts 事实
	 * @return 需要触发规则返回true，否则返回false
	 */
	boolean evaluate(Facts facts);

	/**
	 * A NoOp {@link Condition} that always returns false.
	 */
	Condition FALSE = facts -> false;

	/**
	 * A NoOp {@link Condition} that always returns true.
	 */
	Condition TRUE = facts -> true;

}
