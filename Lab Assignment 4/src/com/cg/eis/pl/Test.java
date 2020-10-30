package com.cg.eis.pl;
import com.cg.eis.service.*;
import java.util.Scanner;
import com.cg.eis.bean.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub    
	    Service s=new Service();
	    Employee emp=s.getEmployeeDetails();
		String scheme=s.findInsuranceScheme(emp);
		s.displayDetails(emp);
		
        
	}

}
