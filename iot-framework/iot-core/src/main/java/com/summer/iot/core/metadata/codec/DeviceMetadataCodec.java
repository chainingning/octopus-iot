package com.summer.iot.core.metadata.codec;

import com.summer.iot.core.metadata.device.DeviceMetadata;

import java.util.Optional;

/**
 * <p>
 * 物模型编解码器,用于将物模型与字符串进行互相转换
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface DeviceMetadataCodec {

	/**
	 * 获取物模型标识
	 *
	 * @return 物模型标识
	 */
	default String getId() {
		return this.getClass().getSimpleName();
	}

	/**
	 * 获取物模型名称
	 *
	 * @return 物模型名称
	 */
	default String getName() {
		return getId();
	}

	/**
	 * 将String类型的数据解码为物模型
	 *
	 * @param source 数据
	 * @return 物模型
	 */
	Optional<DeviceMetadata> decode(String source);

	/**
	 * 将物模型编码为字符串
	 *
	 * @param metadata 物模型
	 * @return 物模型字符串
	 */
	Optional<String> encode(DeviceMetadata metadata);

}
