package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		Person P =(Person)context.getBean("person1");
		System.out.println(P);
		
		System.out.println(P.getFriends().getClass().getName());
		System.out.println("__________________________");
		System.out.println(P.getProperty());
		}
	}


