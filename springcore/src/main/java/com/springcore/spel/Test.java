package com.springcore.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	//private static SpelExpressionParser  sp;

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		Demo d1 = (Demo)context.getBean("demo");
		
		System.out.println(d1);
		SpelExpressionParser s = new SpelExpressionParser();
		org.springframework.expression.Expression ex = s.parseExpression("2+2");
		System.out.println(ex.getValue());
	}

}
