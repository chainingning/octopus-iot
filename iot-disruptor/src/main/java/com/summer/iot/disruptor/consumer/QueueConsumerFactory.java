package com.summer.iot.disruptor.consumer;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public interface QueueConsumerFactory<T> {

	QueueConsumerExecutor<T> create();

	String fixName();

}
