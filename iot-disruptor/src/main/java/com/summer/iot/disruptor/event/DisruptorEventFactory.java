package com.summer.iot.disruptor.event;

import com.lmax.disruptor.EventFactory;

/**
 * <p>
 * 创建一个EventFactory，用于填充RingBuffer中的对象，避免过多垃圾回收
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class DisruptorEventFactory<T> implements EventFactory<DataEvent<T>> {

	@Override
	public DataEvent<T> newInstance() {
		return new DataEvent<>();
	}
}
