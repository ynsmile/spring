package com.yqy.spring;

import org.springframework.stereotype.Component;

@Component
public class Person {
	private String pNmae;
	private String pwd;
	
	public Person(String pNmae, String pwd) {
		this.pNmae = pNmae;
		this.pwd = pwd;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public String getpNmae() {
		return pNmae;
	}
	public void setpNmae(String pNmae) {
		this.pNmae = pNmae;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

}
