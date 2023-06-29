package com.summer.iot.disruptor.event;

/**
 * <p>
 * 数据载体
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class DataEvent<T> {
	public T data;

	public T getData() {return data;}

	public void setData(T data) {this.data = data;}

}
