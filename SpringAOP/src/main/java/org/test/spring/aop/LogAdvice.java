package org.test.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Slf4j
@Component
@Order(0)
public class LogAdvice {
	
	@Before("execution(* org.test.spring.service.*.*(..))")
	public void logBefore() {
		log.info("===============================");
	}
}
