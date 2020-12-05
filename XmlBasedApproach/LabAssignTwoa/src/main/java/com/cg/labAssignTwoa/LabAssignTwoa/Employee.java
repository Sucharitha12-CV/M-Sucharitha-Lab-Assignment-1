package com.cg.labAssignTwoa.LabAssignTwoa;

public class Employee {
	public int id;
	public String name;
	public Employee(int id, String name, double salary, SBU bu) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.bu = bu;
	}
	public double salary;
	public SBU bu;
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
