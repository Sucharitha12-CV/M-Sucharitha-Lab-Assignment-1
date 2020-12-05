package com.cg.AnnoLabTwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("3")
	public int id;
	@Value("radha")
	public String name;
	@Value("56000")
	public double salary;
	@Autowired
	public SBU bu;
	@Autowired
	public Employee() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public SBU getBu() {
		return bu;
	}
	public void setBu(SBU bu) {
		this.bu = bu;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + id + ", Name=" + name + ", Salary=" + salary
				+ "]";
	}
	public void getSBUdetails() {
		System.out.println(bu.toString());
	}

}
