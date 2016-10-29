package com.yqy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorld {
	@Autowired
	private Person person;
	public HelloWorldImpl() {
		// TODO Auto-generated constructor stub
	}
	public HelloWorldImpl(Person p) {
		this.person = p;
	}

	@Override
	public void sayHelloWorld() {
		person.setpNmae("chinese");
		System.out.println(person.getpNmae()+" "+"hello world");
	}

}
