package com.cg.AnnoLabOne1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
	@Value("123")
	public int empId;
	@Value("radha")
	public String name;
	@Value("56000")
	public double salary;
	@Value("Europe")
	public String bu;
	@Value("30")
	public int age;
	@Autowired
	public Employee() {
		super();
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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
	public String getBu() {
		return bu;
	}
	public void setBu(String bu) {
		this.bu = bu;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "[employeeId=" + empId + ", Name=" + name + ", Salary=" + salary
				+ ", BU=" + bu + ", Age="+age+"]";
	}

}
