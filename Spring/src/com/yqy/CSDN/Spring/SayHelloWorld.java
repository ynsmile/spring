package com.yqy.CSDN.Spring;


import org.springframework.stereotype.Component;
@Component
public class SayHelloWorld implements SayHello{

	@Override
	public void sayHello() {
		System.out.println("Say Hello World");
		
	}
	
	

}
