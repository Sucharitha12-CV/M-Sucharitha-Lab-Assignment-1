package com.cg.JavaLabTwo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cg.JavaLabTwo")
public class Config {
	@Bean(name="employee")
	public Employee employee() {
		SBU sbu=new SBU(1,"Europe","HARI");
		return new Employee(123,"Radha",67000,sbu);
	}
	

}
