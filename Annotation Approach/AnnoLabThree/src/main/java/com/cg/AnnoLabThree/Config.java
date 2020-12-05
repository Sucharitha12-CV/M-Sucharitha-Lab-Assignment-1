package com.cg.AnnoLabThree;



import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.cg")
public class Config {
	@Bean(name="empList")
	public ArrayList<Employee> getEmpList(){
		Employee e1=new Employee(1,"harison",20000);
		Employee e2=new Employee(2,"Gopi",25000);
		ArrayList<Employee> empList=new ArrayList<>();
		empList.add(e1);
		empList.add(e2);		
		return empList;
	}	
}
