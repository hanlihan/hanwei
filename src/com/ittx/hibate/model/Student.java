package com.ittx.hibate.model;

public class Student {
    private String name;
    private int number;
    private int age ;
    private String sex;
	public Student(String name, int number, int age, String sex) {
		this.name = name;
		this.number = number;
		this.age = age;
		this.sex = sex;
	}
	public Student(){
		
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
	public String isSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", age=" + age + ", sex=" + sex + "]";
	}
}
