package test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yqy.spring.HelloApi;

public class helloTest {

	@Test
	public void test() {
		ApplicationContext bf = new ClassPathXmlApplicationContext("/applicationContext.xml");
		HelloApi hello  = bf.getBean("hello",HelloApi.class);
		hello.sayhello();

	}

}
