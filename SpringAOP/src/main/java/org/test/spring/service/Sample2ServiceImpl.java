package org.test.spring.service;

import org.springframework.stereotype.Service;

@Service
public class Sample2ServiceImpl implements Sample2Service {

	@Override
	public Double doMultiply(String str1, String str2) throws Exception {
		return Double.parseDouble(str1) * Double.parseDouble(str2);
	}
}
