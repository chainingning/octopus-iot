package com.summer.iot.core.metadata.type;

import com.summer.iot.core.format.TypeFormat;
import com.summer.iot.core.metadata.unit.DataTypeUnit;
import com.summer.iot.core.metadata.unit.UnitSupported;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 数值类型默认实现类
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
@Getter
@Setter
public abstract class AbstractNumberType<N extends Number> extends AbstractType<AbstractNumberType<N>>
		implements UnitSupported, TypeConverter<N>, TypeFormat {

	/**
	 * 最大值
	 */
	private Number max;

	/**
	 * 最小值
	 */
	private Number min;

	/**
	 * 单位
	 */
	private DataTypeUnit unit;

	public AbstractNumberType<N> unit(DataTypeUnit unit) {
		this.unit = unit;
		return this;
	}

	public AbstractNumberType<N> max(Number max) {
		this.max = max;
		return this;
	}

	public AbstractNumberType<N> min(Number min) {
		this.min = min;
		return this;
	}

	@Override
	public Object format(Object value) {
		if (value == null) {
			return null;
		}
		DataTypeUnit unit = getUnit();
		if (unit == null) {
			return value;
		}
		return unit.format(value);
	}


}
