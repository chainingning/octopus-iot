package com.summer.iot.rule.engine.rule;

import com.summer.iot.rule.engine.facts.Facts;

import java.util.Objects;

/**
 * <p>
 * Basic rule implementation class that provides common methods.
 *
 * You can extend this class and override {@link BasicRule#evaluate(Facts)} and {@link BasicRule#execute(Facts)} to provide rule
 * conditions and actions logic.
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class BasicRule implements Rule {

	/**
	 * 规则引擎名称
	 */
	protected String name;

	/**
	 * 描述
	 */
	protected String description;

	/**
	 * 优先级，默认最低
	 */
	protected int priority;

	public BasicRule(final String name, final String description, final int priority) {
		this.name = name;
		this.description = description;
		this.priority = priority;
	}

	public BasicRule() {
		this(Rule.DEFAULT_NAME, Rule.DEFAULT_DESCRIPTION, Rule.DEFAULT_PRIORITY);
	}
	public BasicRule(final String name) {
		this(name, Rule.DEFAULT_DESCRIPTION, Rule.DEFAULT_PRIORITY);
	}
	public BasicRule(final String name, final String description) {
		this(name, description, Rule.DEFAULT_PRIORITY);
	}


	@Override
	public boolean evaluate(Facts facts) {
		return false;
	}

	@Override
	public void execute(Facts facts) throws Exception {
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(final int priority) {
		this.priority = priority;
	}

	/*
	 * Rules are unique according to their names within a rules engine registry.
	 */

	@Override
	public boolean equals(final Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		BasicRule basicRule = (BasicRule) o;

		if (priority != basicRule.priority)
			return false;
		if (!name.equals(basicRule.name))
			return false;
		return Objects.equals(description, basicRule.description);

	}

	@Override
	public int hashCode() {
		int result = name.hashCode();
		result = 31 * result + (description != null ? description.hashCode() : 0);
		result = 31 * result + priority;
		return result;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(final Rule rule) {
		if (getPriority() < rule.getPriority()) {
			return -1;
		} else if (getPriority() > rule.getPriority()) {
			return 1;
		} else {
			return getName().compareTo(rule.getName());
		}
	}
}
