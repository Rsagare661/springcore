package lifecycle03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testkachodi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext context=new ClassPathXmlApplicationContext("lifecycle03/configlifecycle03.xml");
	             kachodi k1= (kachodi) context.getBean("k1");
	             
	             System.out.println(k1);
	
	}

}
