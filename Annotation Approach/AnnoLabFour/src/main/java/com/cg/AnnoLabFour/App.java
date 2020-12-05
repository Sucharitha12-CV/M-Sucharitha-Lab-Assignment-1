package com.cg.AnnoLabFour;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
    	EmployeeList emp=(EmployeeList)ctx.getBean(EmployeeList.class);
    	System.out.println("Enter the name to be searched:");
    	String str=(new Scanner(System.in)).next();
    	for(Employee e:emp.getEmpList()) {
    		if(e.getName().equals(str)) {
    			System.out.println("ID:"+e.getEmpId());
    			System.out.println("Name:"+e.getName());
    			System.out.println("Salary:"+e.getSalary());
    		}
    	}
    }
}
