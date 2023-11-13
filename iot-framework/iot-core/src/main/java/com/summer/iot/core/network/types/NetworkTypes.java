package com.summer.iot.core.network.types;

/**
 * <p>
 * All Default NetworkTypes
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public enum NetworkTypes implements NetworkType {

	/**
	 * 网络组件类型 TCP客户端
	 */
	TCP_CLIENT("TCP_CLIENT", "TCP客户端"),
	/**
	 * 网络组件类型 TCP服务
	 */
	TCP_SERVER("TCP_SERVER", "TCP服务"),
	/**
	 * 网络组件类型 MQTT客户端
	 */
	MQTT_CLIENT("MQTT_CLIENT", "MQTT客户端"),
	/**
	 * 网络组件类型 MQTT服务
	 */
	MQTT_SERVER("MQTT_SERVER", "MQTT服务"),
	/**
	 * 网络组件类型 HTTP客户端
	 */
	HTTP_CLIENT("HTTP_CLIENT", "HTTP客户端"),
	/**
	 * 网络组件类型 HTTP服务
	 */
	HTTP_SERVER("HTTP_SERVER", "HTTP服务"),
	/**
	 * 网络组件类型 WebSocket客户端
	 */
	WEB_SOCKET_CLIENT("WEB_SOCKET_CLIENT", "WebSocket客户端"),
	/**
	 * 网络组件类型 WebSocket服务
	 */
	WEB_SOCKET_SERVER("WEB_SOCKET_SERVER", "WebSocket服务"),
	/**
	 * 网络组件类型 UDP
	 */
	UDP("UDP", "UDP"),
	/**
	 * 网络组件类型 CoAP客户端
	 */
	COAP_CLIENT("COAP_CLIENT", "CoAP客户端"),
	/**
	 * 网络组件类型 CoAP服务
	 */
	COAP_SERVER("COAP_SERVER", "CoAP服务");

	;
	private final String id;
	private final String name;

	NetworkTypes(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public String getName() {
		return this.name;
	}
}
