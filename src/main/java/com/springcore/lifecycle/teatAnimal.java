package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class teatAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/configA.xml");
	                      animal a1 =(animal) context.getBean("a1");
	                      
	                      System.out.println(a1);
	
	}

}
