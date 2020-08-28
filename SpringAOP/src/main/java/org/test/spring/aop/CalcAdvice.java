package org.test.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class CalcAdvice {
	
	@Before("execution(* org.test.spring.service.*.*(..))")
	public void beforeCal(JoinPoint joinPoint) {
		log.info("====== Calculation Start ======");
		log.info("Arguments ----------");
		for (Object obj : joinPoint.getArgs()) {
			log.info(obj.toString());
		}
		log.info("--------------------");
		log.info("getKind -> " + joinPoint.getKind());
		log.info("getSignature -> " + joinPoint.getSignature());
		log.info("getTarget -> " + joinPoint.getTarget());
		log.info("getThis -> " + joinPoint.getThis());
		log.info("FIELD_GET -> " + joinPoint.FIELD_GET);
	}
	
	@After("LogPointCuts.afterLogPointcut()")
	public void afterCal() {
		log.info("======= END =======");
	}
}
