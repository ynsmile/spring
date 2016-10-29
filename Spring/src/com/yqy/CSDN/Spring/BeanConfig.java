package com.yqy.CSDN.Spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses={SayHelloWorld.class})
public class BeanConfig {
	@Bean
	public SayHello getSayHelloWorld(){
		return new SayHelloWorld();
	}
	

}
