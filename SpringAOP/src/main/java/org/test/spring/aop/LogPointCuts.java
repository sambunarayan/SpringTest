package org.test.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogPointCuts {
	
	@Pointcut("execution(* *.*(..))")
	public void afterLogPointcut() {
	}
	
	@Pointcut("@annotation(org.test.spring.annotation.LogAnnotation)")
	public void annoPointcut() {
	}
}
