package com.cg.eis.bean;

public class Employee {
	//Employee Details
	private int id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	/**
	 * parameterized constructor
	 * @param id- ID of Employee
	 * @param name-Name of Employee
	 * @param salary- Salary of Employee
	 * @param designation-Designation of Employee
	 */
	public Employee(int id, String name,double salary,String designation)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.designation=designation;
	}
	//setting insurance Scheme
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	public String getDesignation() {
		return designation;
	}
	public double getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}

}
