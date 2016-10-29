package com.yqy.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApiTest {

	@Test
	public void testSayhello() {
		ApplicationContext bf = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloApi hello  = bf.getBean("hello",HelloApi.class);
		hello.sayhello();
	}

}
