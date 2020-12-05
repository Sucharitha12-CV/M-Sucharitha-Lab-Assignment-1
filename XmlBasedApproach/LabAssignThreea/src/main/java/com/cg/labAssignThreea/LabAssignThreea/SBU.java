package com.cg.labAssignThreea.LabAssignThreea;

import java.util.List;

public class SBU {
	private int id;
	private String subName;
	private String subHead;
	private List<Employee> employeeList;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getSubHead() {
		return subHead;
	}
	public void setSubHead(String subHead) {
		this.subHead = subHead;
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	public void show() {
		System.out.println("SBU[SbuCode="+id+", sbuName="+subName+", sbuHead="+subHead+"]");
		System.out.println("Employee Details---");
		for(Employee e:employeeList) {
			System.out.print(e.toString());
			System.out.print(", ");
		}
	}

}
