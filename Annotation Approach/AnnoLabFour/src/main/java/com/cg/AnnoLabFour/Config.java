package com.cg.AnnoLabFour;

import java.util.ArrayList;
import java.util.List;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
public class Config {
	@Bean(name="empList")
	public List<Employee> getEmployeeList(){
		Employee e1=new Employee(1,"harison",20000,"Europe",30);
		Employee e2=new Employee(2,"Gopi",25000,"Asia",45);
		ArrayList<Employee> employeeList=new ArrayList<>();
		employeeList.add(e1);
		employeeList.add(e2);		
		return employeeList;
	}	
}