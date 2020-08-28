package org.test.spring.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.test.spring.config.RootConfig;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration(classes=RootConfig.class)
public class SampleServiceTests {

	@Setter(onMethod_ = @Autowired)
	private SampleService service;
	@Setter(onMethod_ = @Autowired)
	private Sample2Service service2;
	@Setter(onMethod_ = @Autowired)
	private AnnotationAspectSampleService annoService;
	
	@Test
	public void testClass() throws Exception {
		log.info(service);
		log.info(service.getClass().getName());
		log.info(service2);
		log.info(service2.getClass().getName());
		service.doAdd("1", "1");
		service2.doMultiply("2", "2");
		
		log.info(System.lineSeparator());
		log.info(annoService);
		annoService.doProc("1");
	}
}
