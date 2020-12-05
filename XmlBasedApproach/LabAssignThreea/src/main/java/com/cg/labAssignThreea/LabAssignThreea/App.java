package com.cg.labAssignThreea.LabAssignThreea;

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
    	sbu1.show();
    }
}
