package com.summer.iot.rule.engine.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 规则引擎定义类，主要包含以下内容:</br>
 * 事实（Fact）： 对象之间及对象属性之间的关系
 * 规则（rule）： 是由条件和结论构成的推理语句，一般表示为if...Then。一个规则的if部分称为LHS，then部分称为RHS。
 * 模式（module）： 就是指IF语句的条件。这里IF条件可能是有几个更小的条件组成的大条件。模式就是指的不能在继续分割下去的最小的原子条件。
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RuleDefinition {

	private String id;
	private String name;

}
