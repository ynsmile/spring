package com.yqy.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses={HelloWorldImpl.class,Person.class})
public class createBean {
	@Bean(name="HelloWorld")
	public HelloWorld getHelloWorld(Person p){
		return new HelloWorldImpl(p);
	}
	

}
