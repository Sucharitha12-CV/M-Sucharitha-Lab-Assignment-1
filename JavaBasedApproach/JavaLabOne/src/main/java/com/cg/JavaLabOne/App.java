package com.cg.JavaLabOne;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx= 
				new AnnotationConfigApplicationContext(Config.class);
    	Employee emp=(Employee)ctx.getBean("employee");
    	System.out.println(emp.toString());
    }
}
