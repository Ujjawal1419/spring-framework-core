package com.jspider.spring_core_technology.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.spring_core_technology.dto.Employee;
import com.jspider.spring_core_technology.dto.Student;

/**
 * Hello world!
 */
public class AppController {
    public static void main(String[] args) {
    
    	 BeanFactory beanfactory=new ClassPathXmlApplicationContext("myspring.xml");
      
            Employee employee=(Employee)beanfactory.getBean("emp");
            
           employee.display();
           
           System.out.println("===========================================");
           Student student = (Student)beanfactory.getBean(Student.class);
 
            System.out.println("Id is: "+student.getId());
            System.out.println("Name is: "+student.getName());
    }
}
