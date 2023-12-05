package constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testconstructorinjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("constructorinjection/configci.xml");
                    person p=(person) context.getBean("p1");
                    System.out.println(p);
                    addition a=(addition) context.getBean("add");
                    a.dosum();                     
	}

}
