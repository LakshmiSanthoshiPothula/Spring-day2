package com.cg;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Client {

	public static void main(String[] args) {
		

		ApplicationContext factory= new ClassPathXmlApplicationContext("currencylist.xml");
		CurrencyList curr= (CurrencyList) factory.getBean("currencyList");
		
		ArrayList<String> list=curr.getCurrList();
        System.out.println(list);		
	
}
}
