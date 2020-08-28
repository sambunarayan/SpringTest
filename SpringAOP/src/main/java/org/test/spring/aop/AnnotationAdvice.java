package org.test.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
public class AnnotationAdvice {
	
	@Before("LogPointCuts.annoPointcut()")
	public void annoLog() {
		log.info("Annotation Aspect start ---------");
	}
}
