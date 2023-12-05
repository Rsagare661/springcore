package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/stereotype/steretypeconfig.xml");
		student student = context.getBean("student", student.class);
		System.out.println(student);
		System.out.println(student.getShaherme());
		System.out.println(student.getShaherme().getClass().getName());

	}

}
