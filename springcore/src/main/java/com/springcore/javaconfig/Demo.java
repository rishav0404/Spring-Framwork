package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/javaconfig/config.xml");
		Student student = (Student)context.getBean("student");
		System.out.println(student);
	}

}
