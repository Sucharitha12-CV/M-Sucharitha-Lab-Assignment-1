package com.cg.AnnoLabThree;

import java.util.ArrayList;
import java.util.List;

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
    	
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
    	SBU sbu=(SBU)ctx.getBean(SBU.class);
    	sbu.display();
    	for(Employee emp:sbu.getEmpList()) {
    		System.out.print(emp.toString());
    		System.out.print(", ");
    		
    	}
    }

}
