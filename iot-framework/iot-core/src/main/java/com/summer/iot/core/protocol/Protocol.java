package com.summer.iot.core.protocol;

import com.summer.iot.core.context.TransportContext;
import com.summer.iot.core.device.model.entity.Device;
import com.summer.iot.core.device.registry.DeviceRegistry;
import com.summer.iot.core.message.codec.DeviceMessageCodec;
import com.summer.iot.core.message.device.lifecycle.DeviceOnlineMessage;
import com.summer.iot.core.metadata.codec.DeviceMetadataCodec;
import com.summer.iot.core.network.types.NetworkType;
import io.netty.channel.ChannelHandler;

import java.util.List;

/**
 * <p>
 * 协议 , {@link Device}
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface Protocol {
	/**
	 * 标准 TCP 协议
	 */
	String OFFICIAL_TCP = "OFFICIAL_TCP";
	/**
	 * 标准 MQTT 协议
	 */
	String OFFICIAL_MQTT = "OFFICIAL_MQTT";

	/**
	 * 协议名称
	 *
	 * @return 协议名称
	 */
	String getId();

	/**
	 * 获取设备编解码器
	 *
	 * @return 编解码器
	 */
	DeviceMessageCodec getMessageCodec();


	/**
	 * 获取协议校验器
	 *
	 * @param transportContext 上下文
	 * @return 校验器列表
	 */
	List<ChannelHandler> getValidatorChannelHandler(TransportContext transportContext);


	/**
	 * 获取设备物模型编解码器
	 *
	 * @return 编解码器
	 */
	DeviceMetadataCodec getDeviceMetadataCodec();


	/**
	 * online 认证校验与Session
	 *
	 * @param deviceOnlineMessage 设备上线消息
	 * @param deviceRegistry      设备注册中心
	 * @return 校验结果
	 */
	default OperatingResult authAndRegister(DeviceOnlineMessage deviceOnlineMessage, DeviceRegistry deviceRegistry) {
		return OperatingResult.success();
	}


	/**
	 * 获取支持的网络类型
	 *
	 * @return 网络类型
	 */
	NetworkType getSupportedNetwork();
}
