package com.cg.JavaLabThree;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cg.JavaLabThree")
public class Config {
	@Bean(name="sbu")
	public SBU sbu() {
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(20,"Radha",90000));
		empList.add(new Employee(30,"Radha Rani",80000));
		return new SBU(1,"europe","Hari",empList);
	}

}
