package com.yqy.spring;




import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class HelloWorldImplTest {

	

	@Test
	public void test() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(createBean.class);
		HelloWorld h = (HelloWorld) ctx.getBean("HelloWorld");
		h.sayHelloWorld();
	}

}
