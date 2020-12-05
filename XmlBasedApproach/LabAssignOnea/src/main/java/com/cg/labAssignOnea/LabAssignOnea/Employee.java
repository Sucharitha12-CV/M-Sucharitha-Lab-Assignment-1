package com.cg.labAssignOnea.LabAssignOnea;

public class Employee {
	public int id;
	public String name;
	public double salary;
	public String BU;
	public int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee(int id, String name, double salary, String bU, int age) {
		
		super();
		System.out.println("Constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
		BU = bU;
		this.age = age;
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
	public String getBU() {
		return BU;
	}
	public void setBU(String bU) {
		BU = bU;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "[employeeId=" + id + ", Name=" + name + ", Salary=" + salary
				+ ", BU=" + BU + ", Age="+age+"]";
	}

}
