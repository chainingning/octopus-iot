/*
 * The MIT License
 *
 *  Copyright (c) 2021, Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */
package com.summer.iot.rule.engine.rule;


import com.summer.iot.rule.engine.action.ActionMethodOrderBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.summer.iot.rule.engine.core.AnnotationUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;

/**
 * Main class to create rule proxies from annotated objects.
 *
 * @author Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 */
public class RuleProxy implements InvocationHandler {

    private final Object target;
    private String name;
    private String description;
    private Integer priority;
    private Method[] methods;
    private Method conditionMethod;
    private Set<ActionMethodOrderBean> actionMethods;
    private Method compareToMethod;
    private Method toStringMethod;
    private com.summer.iot.rule.engine.annotation.Rule annotation;

    private static final Logger LOGGER = LoggerFactory.getLogger(RuleProxy.class);

    /**
     * Makes the rule object implement the {@link Rule} interface.
     *
     * @param rule the annotated rule object.
     * @return a proxy that implements the {@link Rule} interface.
     */
    public static Rule asRule(final Object rule) {
        Rule result;
        if (rule instanceof Rule) {
            result = (Rule) rule;
        } else {
//            ruleDefinitionValidator.validateRuleDefinition(rule);
            result = (Rule) Proxy.newProxyInstance(
                    Rule.class.getClassLoader(),
                    new Class[]{Rule.class, Comparable.class},
                    new RuleProxy(rule));
        }
        return result;
    }

    private RuleProxy(final Object target) {
        this.target = target;
    }

    
    public Object getTarget() {
        return target;
    }

    private Class<?> getTargetClass() {
        return target.getClass();
    }

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		String methodName = method.getName();
		switch (methodName) {
			case "getName":
				return getRuleName();
//			case "getDescription":
//				return getRuleDescription();
//			case "getPriority":
//				return getRulePriority();
//			case "compareTo":
//				return compareToMethod(args);
//			case "evaluate":
//				return evaluateMethod(args);
//			case "execute":
//				return executeMethod(args);
//			case "equals":
//				return equalsMethod(args);
//			case "hashCode":
//				return hashCodeMethod();
//			case "toString":
//				return toStringMethod();
			default:
				return null;
		}
	}


	private com.summer.iot.rule.engine.annotation.Rule getRuleAnnotation() {
		if (this.annotation == null) {
			this.annotation = AnnotationUtils.findAnnotation(com.summer.iot.rule.engine.annotation.Rule.class,
					getTargetClass());
		}
		return this.annotation;
	}

	private String getRuleName() {
		if (this.name == null) {
			com.summer.iot.rule.engine.annotation.Rule rule = getRuleAnnotation();
			this.name = rule.name().equals(Rule.DEFAULT_NAME) ? getTargetClass().getSimpleName() : rule.name();
		}
		return this.name;
	}




}
