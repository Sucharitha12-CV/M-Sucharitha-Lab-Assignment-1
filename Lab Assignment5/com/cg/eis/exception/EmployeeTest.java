package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		EmployeeException emp=new EmployeeException();
		System.out.println("Enter the salary:");
		double salary=s.nextInt();
		try {
			emp.checkSalary(salary);
		}
		catch(InvalidSalaryException e) {
			System.out.println(e.getMessage());
		}

	}

}
