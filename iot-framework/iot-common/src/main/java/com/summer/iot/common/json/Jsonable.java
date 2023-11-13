package com.summer.iot.common.json;

import cn.hutool.json.JSONUtil;

/**
 * <p>
 * An Object that can turn into JSON or can create
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface Jsonable {
	/**
	 * turn Jsonable object to JSON
	 *
	 * @return JSON 串
	 */
	default String toJsonStr() {
		return JSONUtil.toJsonStr(this);
	}

	/**
	 * turn a JSON string to Jsonable
	 *
	 * @param jsonStr Json串
	 * @return Jsonable
	 */
	Jsonable ofJsonStr(String jsonStr);
}
