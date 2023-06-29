package com.summer.iot.rule.engine.listener;

import com.summer.iot.rule.engine.core.ThingModelMessage;

import java.util.List;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface Listener<T> {

	String getType();

	List<T> getConditions();

	boolean execute(ThingModelMessage msg);
}
