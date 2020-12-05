package com.cg.JavaLabFour;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




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
    	List<Employee> emp=(List<Employee>) ctx.getBean("empList");
    	System.out.println("Enter the name to be searched:");
    	String str=(new Scanner(System.in)).next();
    	for(Employee e:emp) {
    		if(e.getName().equals(str)) {
    			System.out.println("ID:"+e.getEmpId());
    			System.out.println("Name:"+e.getName());
    			System.out.println("Salary:"+e.getSalary());
    		}
    	}
    }
}
