package com.cg.JavaLabOne;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cg.JavaLabOne")
public class Config {
	@Bean(name="employee")
	public Employee employee() {
		return new Employee(123,"radha",56000,"Europe",20);	
	}
	

}
