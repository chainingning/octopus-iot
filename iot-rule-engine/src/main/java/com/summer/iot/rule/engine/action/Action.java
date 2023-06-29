package com.summer.iot.rule.engine.action;

import com.summer.iot.rule.engine.facts.Facts;

/**
 * <p>
 *
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
@FunctionalInterface
public interface Action {

	void execute(Facts facts) throws Exception;

}
