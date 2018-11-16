package com.cg;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory= new ClassPathXmlApplicationContext("userclient.xml");
		User user= (User) factory.getBean("user");
		String username=user.getUserName();
		String password=user.getPassword();
		System.out.println(username+"\n"+password);
		
		
		
	}

}
