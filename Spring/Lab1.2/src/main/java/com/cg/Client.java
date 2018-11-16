package com.cg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext factory= new ClassPathXmlApplicationContext("employee.xml");
		Employee employee= (Employee) factory.getBean("employee1");
		System.out.println("Employee details");
		System.out.println("........................");
		System.out.println(employee);
	
  
	}

}
