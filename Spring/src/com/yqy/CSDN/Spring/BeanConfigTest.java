package com.yqy.CSDN.Spring;



import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanConfigTest {

	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		SayHello s = (SayHello) ctx.getBean("SayHelloWorld");
		s.sayHello();
	}

}
