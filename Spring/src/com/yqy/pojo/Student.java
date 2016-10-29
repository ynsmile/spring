package com.yqy.pojo;

public class Student {
	private int studentId;
	private String username;
	private String password;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student( String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "student [studentId=" + studentId + ", username=" + username + ", password=" + password + "]";
	}
	

}
