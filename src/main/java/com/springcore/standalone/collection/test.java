package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ApplicationContext con= new ClassPathXmlApplicationContext("com/springcore/standalone/collection/aloneconfig.xml");
	
         
         person person1=con.getBean("person1",person.class);
         System.out.println(person1);
         System.out.println(person1.getFriends().getClass().getName());
	}

}
