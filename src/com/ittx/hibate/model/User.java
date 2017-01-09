package com.ittx.hibate.model;

public class User {
    public int id; 
    public String name; 
    public int number;
	public User(int id, String name, int number) {
		this.id = id;
		this.name = name;
		this.number = number;
	}
	public User(){
		
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	} 
    
}
