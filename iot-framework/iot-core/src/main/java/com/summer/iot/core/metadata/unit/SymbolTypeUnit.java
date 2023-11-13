package com.summer.iot.core.metadata.unit;

import lombok.AllArgsConstructor;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
@AllArgsConstructor(staticName = "of")
public class SymbolTypeUnit  implements DataTypeUnit {

	private final String symbol;

	@Override
	public String getSymbol() {
		return symbol;
	}

	@Override
	public Object format(Object value) {
		if (value == null) {
			return null;
		}
		return value + "" + symbol;
	}

	@Override
	public String getId() {
		return symbol;
	}

	@Override
	public String getName() {
		return symbol;
	}

	@Override
	public String getDescription() {
		return symbol;
	}
}
