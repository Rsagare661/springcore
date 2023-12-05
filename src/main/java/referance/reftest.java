package referance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class reftest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		ApplicationContext context=new ClassPathXmlApplicationContext("referance/configref.xml");
		b temp=(b) context.getBean("ref2");
		
		System.out.println(temp.getX());
		System.out.println(temp.getObj().getY());
		
		System.out.println(temp);
		
	}

}
