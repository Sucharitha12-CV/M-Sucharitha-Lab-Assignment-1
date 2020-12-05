package com.cg.AnnoLabFour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Employee {

	public int empId;
	public String name;
	public double salary;
	public String bu;
	public int age;
	
	public Employee(int empId, String name, double salary, String bu, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.bu = bu;
		this.age = age;
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
