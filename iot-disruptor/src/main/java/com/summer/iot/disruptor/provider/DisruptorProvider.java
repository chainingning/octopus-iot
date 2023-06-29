package com.summer.iot.disruptor.provider;

import com.lmax.disruptor.EventTranslatorOneArg;
import com.lmax.disruptor.EventTranslatorTwoArg;
import com.lmax.disruptor.RingBuffer;
import com.lmax.disruptor.dsl.Disruptor;
import com.summer.iot.disruptor.event.DataEvent;
import com.summer.iot.disruptor.event.OrderlyDataEvent;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

/**
 * <p>
 * 生产者定义
 * <p>
 * @param <T> 参数类型
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class DisruptorProvider<T> {
	private final Logger logger = LoggerFactory.getLogger(DisruptorProvider.class);


	private final RingBuffer<DataEvent<T>> ringBuffer;

	private final Disruptor<DataEvent<T>> disruptor;

	private final boolean isOrderly;

	private final EventTranslatorOneArg<DataEvent<T>, T> translatorOneArg = (event, sequence, t) -> event.setData(t);

	private final EventTranslatorTwoArg<DataEvent<T>, T, String> orderlyArg = (event, sequence, t, orderly) -> {
		if (event instanceof OrderlyDataEvent) {
			((OrderlyDataEvent<T>) event).setHash(orderly);
		}
		event.setData(t);
	};

	/**
	 * Instantiates a new Disruptor provider.
	 *
	 * @param ringBuffer the ring buffer
	 * @param disruptor  the disruptor
	 * @param isOrderly  the orderly Whether to execute sequentially.
	 */
	public DisruptorProvider(final RingBuffer<DataEvent<T>> ringBuffer, final Disruptor<DataEvent<T>> disruptor, final boolean isOrderly) {
		this.ringBuffer = ringBuffer;
		this.disruptor = disruptor;
		this.isOrderly = isOrderly;
	}


	/**
	 *  装载数据
	 * @param data 需要发送的数据
	 */
	public void onData(final T data){
		if(isOrderly){
			throw new IllegalArgumentException("当前提供程序是有序类型。请使用onOrderlyData方法。");
		}

		try {
			ringBuffer.publishEvent(translatorOneArg, data);
		} catch (Exception ex) {
			logger.error("ex", ex);
		}

	}

	/**
	 * 有序数据
	 *
	 * @param data
	 * @param hashArray
	 */
	public void onOrderlyData(final T data, final String... hashArray) {
		if (!this.isOrderly) {
			throw new IllegalArgumentException("The current provider is not of orderly type. Please use onData() method.");
		}
		try {
			String hash = String.join(":", hashArray);
			ringBuffer.publishEvent(orderlyArg, data, hash);
		} catch (Exception ex) {
			logger.error("ex", ex);
		}
	}


	public void shutdown() {
		if (null != disruptor) {
			disruptor.shutdown();
		}
	}

}
