package com.summer.iot.core.metadata.type;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class DataTypes {
	private final static Map<String, Supplier<DataType>> SUPPORTS = new ConcurrentHashMap<>();

	static {
//		SUPPORTS.put(BooleanType.ID, BooleanType::new);
//		SUPPORTS.put(DateTimeType.ID, DateTimeType::new);
//		SUPPORTS.put(EnumType.ID, EnumType::new);
		SUPPORTS.put(FloatType.ID, FloatType::new);
//		SUPPORTS.put(IntType.ID, IntType::new);
//		SUPPORTS.put(LongType.ID, LongType::new);
//		SUPPORTS.put(ObjectType.ID, ObjectType::new);
//		SUPPORTS.put(StringType.ID, StringType::new);
//		SUPPORTS.put("text", StringType::new);
	}

	/**
	 * 注册Supplier
	 *
	 * @param id       类型ID
	 * @param supplier Supplier
	 */
	public static void register(String id, Supplier<DataType> supplier) {
		SUPPORTS.put(id, supplier);
	}

	/**
	 * 查找
	 *
	 * @param id 类型ID
	 * @return Supplier
	 */
	public static Supplier<DataType> lookup(String id) {
		if (id == null) {
			return null;
		}
		return SUPPORTS.get(id);
	}
}
