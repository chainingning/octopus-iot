package com.summer.iot.rule.engine.rule;

import com.summer.iot.rule.engine.action.Action;
import com.summer.iot.rule.engine.condition.Condition;
import com.summer.iot.rule.engine.facts.Facts;

import java.util.List;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
class DefaultRule extends BasicRule {

	private final Condition condition;
	private final List<Action> actions;

	DefaultRule(String name, String description, int priority, Condition condition, List<Action> actions) {
		super(name, description, priority);
		this.condition = condition;
		this.actions = actions;
	}

	@Override
	public boolean evaluate(Facts facts) {
		return condition.evaluate(facts);
	}

	@Override
	public void execute(Facts facts) throws Exception {
		for (Action action : actions) {
			action.execute(facts);
		}
	}

}
