package com.summer.iot.core.device.instance;

import lombok.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 设备定义
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeviceDefinition implements Serializable {
	/**
	 * 设备 ID
	 */
	private String deviceId;
	/**
	 * 父设备 ID
	 */
	private String parentDeviceId;
	/**
	 * 产品ID
	 */
	private Integer productId;

	/**
	 * 设备协议
	 *
	 * @see Protocol#getId()
	 */
	private String protocolId;

	/**
	 * 元数据(物模型JSON)数据
	 */
	private String metadata;

	/**
	 * 设备相关的其他配置
	 */
	private Map<String, Object> configuration = new HashMap<>();
}
