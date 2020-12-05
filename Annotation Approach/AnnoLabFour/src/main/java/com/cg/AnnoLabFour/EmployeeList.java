package com.cg.AnnoLabFour;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class EmployeeList {
	@Value("#{empList}")
	private List<Employee> empList;
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	@Autowired
	public EmployeeList() {
		
	}

}
