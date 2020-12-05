package com.cg.labAssignOnea.LabAssignOnea;

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
    	/*BeanFactory context=
		new XmlBeanFactory(new ClassPathResource("myBeans.xml"));

*/
AbstractApplicationContext context=
		//new ClassPathXmlApplicationContext("myBeans.xml");
		new FileSystemXmlApplicationContext("Bean.xml");
Employee employee1=(Employee)context.getBean("employee");

System.out.println(employee1.toString());
    }
}
