package springlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testcoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     AbstractApplicationContext context= new ClassPathXmlApplicationContext("springlifecycle/configlifecycle.xml");
                 coffee c=(coffee) context.getBean("cof");
                 
                 System.out.println(c);
                 context.registerShutdownHook();
	}

}
