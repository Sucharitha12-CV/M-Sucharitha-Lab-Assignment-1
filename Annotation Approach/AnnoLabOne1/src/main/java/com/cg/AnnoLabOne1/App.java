package com.cg.AnnoLabOne1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory = new ClassPathXmlApplicationContext("bean.xml");
		Employee curr = (Employee) factory.getBean("employee", Employee.class);
		System.out.println(curr.toString());
    }
}
