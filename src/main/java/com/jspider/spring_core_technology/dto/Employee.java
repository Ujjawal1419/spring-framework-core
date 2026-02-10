package com.jspider.spring_core_technology.dto;

public class Employee {
	
	private int id;
	private String name;
	private String email;
	
	
	public Employee() {
		super();
	}
	
	
	public Employee(int id,String name,String email) {
		this.id=id;
		this.name=name;
		this.email=email;
		
	}
	
	public void display() {
		System.out.println("id = "+id);
		System.out.println("name = "+name);
		System.out.println("email = "+email);
	}

}
