package com.summer.iot.core.metadata.unit;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
@AllArgsConstructor
public class JsonTypeUnit implements DataTypeUnit {

	private final String symbol;

	private final String name;


	public static JsonTypeUnit of(String jsonStr) {

		JSONObject json = JSON.parseObject(jsonStr);

		String symbol = json.getString("symbol");
		if (null == symbol) {
			return null;
		}

		return new JsonTypeUnit(symbol, (String) json.getOrDefault("name", symbol));
	}

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
		return "custom_" + symbol;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return symbol;
	}
}