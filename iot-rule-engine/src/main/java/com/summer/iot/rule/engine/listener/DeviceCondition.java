package com.summer.iot.rule.engine.listener;

import lombok.Data;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
@Data
public class DeviceCondition {

	private String device;

	private String type;

	private String identifier;

	private Object value;

	private String comparator;


}
