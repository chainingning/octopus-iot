package com.summer.iot.rule.engine.annotation;

import java.lang.annotation.*;

/**
 * <p>
 * Inherited 表示注解可以被继承。当一个类使用了被@Inherited注解标注的注解时，它的子类也会自动继承该注解。
 * Retention(RetentionPolicy.RUNTIME) 表示注解的保留策略为运行时。这意味着注解在编译后仍然保留在Java字节码中，并且可以在运行时通过反射机制获取注解的信息。
 * Target(ElementType.METHOD) 表示注解的作用目标为方法。这意味着该注解只能应用于方法上，不能应用于其他类型的元素。
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Action {
	int order() default 0;
}
