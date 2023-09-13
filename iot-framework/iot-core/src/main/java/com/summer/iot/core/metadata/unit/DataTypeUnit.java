package com.summer.iot.core.metadata.unit;

import com.summer.iot.core.format.TypeFormat;
import com.summer.iot.core.metadata.Metadata;

import java.io.Serializable;

/**
 * <p>
 * 单位
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface DataTypeUnit extends Metadata, TypeFormat, Serializable {
	/**
	 * 获取单位
	 *
	 * @return 单位
	 */
	String getSymbol();
}
