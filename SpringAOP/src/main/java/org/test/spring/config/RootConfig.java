package org.test.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages= {"org.test.spring.aop", "org.test.spring.service"})
@EnableAspectJAutoProxy
public class RootConfig {

}
