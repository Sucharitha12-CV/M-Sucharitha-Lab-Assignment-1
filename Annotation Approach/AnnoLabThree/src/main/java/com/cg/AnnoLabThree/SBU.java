package com.cg.AnnoLabThree;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class SBU {
    @Value("123")
	private int sbuId;
    @Value("Europe")
	private String sbuName;
    @Value("Hari")
	private String sbuHead;
    @Value("#{empList}")
	private List<Employee> empList;
	
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	@Autowired
	public SBU() {
		
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	public void display() {
		System.out.println("SBu details are : ");
		System.out.print("SbuId : "+getSbuId());
		System.out.print(", SbuName : "+getSbuName());
		System.out.print(", SbuHead : "+getSbuHead());
		System.out.print(", SbuId : "+getSbuId());
		System.out.println();
		System.out.println("Employee details are:");
		
		
		}
	
		
	}