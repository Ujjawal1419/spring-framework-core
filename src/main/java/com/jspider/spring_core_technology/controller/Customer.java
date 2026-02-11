package com.jspider.spring_core_technology.controller;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private int id;
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}

}
