package com.cg.labAssignFoura.LabAssignFoura;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context=
    			//new ClassPathXmlApplicationContext("myBeans.xml");
    			new FileSystemXmlApplicationContext("bean.xml");
    	SBU sbu1=(SBU)context.getBean("sbu");
    	System.out.println("Enter the id to be searched:");
    	int id=(new Scanner(System.in)).nextInt();
    	for(Employee e:sbu1.getEmployeeList()) {
    		if(e.getId()==id) {
    			System.out.println("ID:"+e.getId());
    			System.out.println("Name:"+e.getName());
    			System.out.println("Salary:"+e.getSalary());
    		}
    	}
    	System.out.println("Enter the name to be searched:");
    	String str=(new Scanner(System.in)).next();
    	for(Employee e:sbu1.getEmployeeList()) {
    		if(e.getName().equals(str)) {
    			System.out.println("ID:"+e.getId());
    			System.out.println("Name:"+e.getName());
    			System.out.println("Salary:"+e.getSalary());
    		}
    	}
    }
}
