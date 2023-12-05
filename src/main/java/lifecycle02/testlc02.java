package lifecycle02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testlc02 {

	public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("lifecycle02/configlc33.xml");
	           cuppuccino cup=(cuppuccino) context.getBean("cup"); 
	           
	           System.out.println(cup);
	          
	}

}
