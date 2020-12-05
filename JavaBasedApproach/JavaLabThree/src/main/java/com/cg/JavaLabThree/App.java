package com.cg.JavaLabThree;

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
    	SBU sbu1=(SBU)ctx.getBean("sbu");
    	sbu1.show();
    }
}
