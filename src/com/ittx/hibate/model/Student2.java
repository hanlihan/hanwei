package com.ittx.hibate.model;

import java.util.Date;


public class Student2 {
    private String name;
    private int number;
    private int age ;
    private String sex;
	private Date birthday;
	public Student2(String name, int number, int age, String sex, Date birthday) {
		
		this.name = name;
		this.number = number;
		this.age = age;
		this.sex = sex;
		this.birthday = birthday;
	}
	public Student2(){
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
}
