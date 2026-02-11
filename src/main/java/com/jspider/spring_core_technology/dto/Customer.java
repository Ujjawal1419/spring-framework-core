package com.jspider.spring_core_technology.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="dtocustomer")
public class Customer {

	//@Value(value="2026")
	
	private int id;
	private String name;
	private String email;
	private String phone;
	
	
	public Customer() {
	System.out.println("Customer Object Created ");
	}
	
	public int getId() {
		return id;
	}
	 @Value(value="2056")      // aa to ke pas bhi likh sakte ho aa to fir setter method ke upper
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	@Value(value="Ujjawal kumar")
	public void setName(String name) {
		this.name=name;
	}
	
	public String getEmail() {
		return email;
	}
	@Value(value="ujjawal14222gmail.com")
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getPhone() {
		return phone;
	}
	@Value(value="9546224316l")
	public void setPhone(String phone) {
		this.phone=phone;
	}
}
