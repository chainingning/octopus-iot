package com.summer.iot.rule.engine.rule;

import java.util.*;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class ListableRules implements Iterable<Rule> {
	private Set<Rule> rules = new TreeSet<>();

	/**
	 * Create a new {@link ListableRules} object.
	 *
	 * @param rules to register
	 */
	public ListableRules(Set<Rule> rules) {
		this.rules = new TreeSet<>(rules);
	}

	/**
	 * Create a new {@link ListableRules} object.
	 *
	 * @param rules to register
	 */
	public ListableRules(Rule... rules) {
		Collections.addAll(this.rules, rules);
	}

	/**
	 * Create a new {@link ListableRules} object.
	 *
	 * @param rules to register
	 */
	public ListableRules(Object... rules) {
		this.register(rules);
	}

	/**
	 * Register one or more new rules.
	 *
	 * @param rules to register, must not be null
	 */
	public void register(Object... rules) {
		Objects.requireNonNull(rules);
		for (Object rule : rules) {
			Objects.requireNonNull(rule);
			this.rules.add(RuleProxy.asRule(rule));
		}
	}

	/**
	 * Unregister one or more rules.
	 *
	 * @param rules to unregister, must not be null
	 */
	public void unregister(Object... rules) {
		Objects.requireNonNull(rules);
		for (Object rule : rules) {
			Objects.requireNonNull(rule);
			this.rules.remove(RuleProxy.asRule(rule));
		}
	}

	/**
	 * Unregister a rule by name.
	 *
	 * @param ruleName name of the rule to unregister, must not be null
	 */
	public void unregister(final String ruleName) {
		Objects.requireNonNull(ruleName);
		Rule rule = findRuleByName(ruleName);
		if (rule != null) {
			unregister(rule);
		}
	}

	/**
	 * Check if the rule set is empty.
	 *
	 * @return true if the rule set is empty, false otherwise
	 */
	public boolean isEmpty() {
		return rules.isEmpty();
	}

	/**
	 * Clear rules.
	 */
	public void clear() {
		rules.clear();
	}

	/**
	 * Return how many rules are currently registered.
	 *
	 * @return the number of rules currently registered
	 */
	public int size() {
		return rules.size();
	}

	/**
	 * Return an iterator on the rules set. It is not intended to remove rules
	 * using this iterator.
	 *
	 * @return an iterator on the rules set
	 */
	@Override
	public Iterator<Rule> iterator() {
		return rules.iterator();
	}

	private Rule findRuleByName(String ruleName) {
		return rules.stream()
				.filter(rule -> rule.getName().equalsIgnoreCase(ruleName))
				.findFirst()
				.orElse(null);
	}


}
