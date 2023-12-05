package com.springcore;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import org.springframework.context.ApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/config99.xml");
        student s22=(student) context.getBean("s22");
      
    
    System.out.println(s22);
}
}