package constructorinjection02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testci02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("constructorinjection02/configci02.xml");
             car c=(car) context.getBean("ci02");
             
             System.out.println(c);
	}

}
