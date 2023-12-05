package database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testdatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("database/config3.xml");
                      info info1=(info) context.getBean("info1");
                      
                      System.out.println(info1.getNickname());
                      System.out.println(info1.getUsername());
                      System.out.println(info1.getPassword());
	}

}
