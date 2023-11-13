package com.summer.iot.core.metadata.type;

import com.summer.iot.core.protocol.OperatingResult;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class FloatType extends AbstractNumberType<Float> {

	public static final String ID = "float";
	public static final FloatType INSTANCE = new FloatType();

	@Override
	public String getId() {
		return ID;
	}

	@Override
	public Float convert(Object source) {
		return null;
	}

	@Override
	public OperatingResult validate(Object value) {
		return null;
	}
}
