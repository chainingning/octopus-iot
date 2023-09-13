package com.summer.iot.disruptor.consumer;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public abstract class QueueConsumerExecutor<T> implements Runnable{

	private T data;

	/**
	 * get data.
	 * @return data
	 */
	public T getData() {
		return data;
	}

	/**
	 * set data.
	 * @param data data
	 */
	public void setData(final T data) {
		this.data = data;
	}
}
