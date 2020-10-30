package com.cg.eis.service;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import java.util.Scanner;
public class Service implements IEmployeeService{

	@Override
	public Employee getEmployeeDetails() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id:");
	    int id=sc.nextInt();
	    System.out.println("Enter name:");
	    String name=sc.next();
	    System.out.println("Enter salary:");
	    double salary=sc.nextDouble();
	    System.out.println("Enter designation:");
	    String designation=sc.next();
	    Employee emp=new Employee(id,name,salary,designation);
		return emp;
	}

	@Override
	public String findInsuranceScheme(Employee emp) {
		// TODO Auto-generated method stub
		if(emp.getSalary()>=10000 && emp.getDesignation().equalsIgnoreCase("Analyst")) {
			emp.setInsuranceScheme("premium");
			return "Premium";
		}
	    else {
	    	emp.setInsuranceScheme("VIP");
	    	return "VIP";
	    }
	    
		
	}

	@Override
	public void displayDetails(Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("Employee Details:");
		System.out.println("Id: "+emp.getId());
		System.out.println("Name: "+emp.getName());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("Designation: "+emp.getDesignation());
		System.out.println("Scheme Type: "+emp.getInsuranceScheme());
		
	}
	
    
}
