package org.test.spring.service;

import org.springframework.stereotype.Service;
import org.test.spring.annotation.LogAnnotation;

@Service
@LogAnnotation
public class AnnotationAspectSampleServiceImpl implements AnnotationAspectSampleService {

	@Override
	public String doProc(String str) throws Exception {
		Integer.parseInt(str);
		return "receive : " + str;
	}
}
