package com.yqy.spring;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloImplTest {

	@Test
	public void testSayhello() {
		ApplicationContext bf = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloApi hello  = bf.getBean("hello",HelloApi.class);
		hello.sayhello();
	}

}
