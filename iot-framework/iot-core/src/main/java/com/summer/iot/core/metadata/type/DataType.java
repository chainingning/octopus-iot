package com.summer.iot.core.metadata.type;
import com.summer.iot.core.format.TypeFormat;
import com.summer.iot.core.metadata.Metadata;
import com.summer.iot.core.protocol.OperatingResult;

/**
 * <p>
 * 物模型数据类型,进行数据校验
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface DataType extends Metadata, TypeFormat {

	/**
	 * 验证是否合法
	 *
	 * @param value 值
	 * @return ValidateResult
	 */
	OperatingResult validate(Object value);
}
