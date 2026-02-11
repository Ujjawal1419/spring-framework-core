package com.jspider.spring_core_technology.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspider.spring_core_technology.config.MySpringConfig;
import com.jspider.spring_core_technology.dto.Customer;
//import com.jspider.spring_core_technology.controller.Customer;

public class CustomerDriver {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MySpringConfig.class);
		
		System.out.println("Container created");
		
		Customer customer=(Customer) applicationContext.getBean("dtocustomer");
		
		System.out.println(customer.getId());
		System.out.println(customer.getName());
		System.out.println(customer.getEmail());
		System.out.println(customer.getPhone());
	}

}
