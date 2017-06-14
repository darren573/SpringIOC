package com.darren.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	private String name;
	private String address;
	private String sex;
	
	public Student(int id, String name, String address, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.sex = sex;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	 
}
