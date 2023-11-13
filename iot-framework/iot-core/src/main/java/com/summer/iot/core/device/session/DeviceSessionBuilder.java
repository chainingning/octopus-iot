package com.summer.iot.core.device.session;

import com.summer.iot.core.device.instance.DeviceInstance;
import java.util.function.Function;

@FunctionalInterface
public interface DeviceSessionBuilder extends Function<DeviceInstance, DeviceSession> {

}
