package com.summer.iot.disruptor.event;

/**
 * <p>
 * 相同散列保证顺序的事件
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class OrderlyDataEvent<T> extends DataEvent<T>  {
	private String hash;

	/**
	 *
	 * @return the hash
	 */
	public String getHash() {
		return hash;
	}

	/**
	 *
	 * @param hash the hash
	 */
	public void setHash(final String hash) {
		this.hash = hash;
	}
}
