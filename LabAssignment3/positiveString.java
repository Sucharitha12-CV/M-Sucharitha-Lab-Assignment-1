package LabAssignment3;
import java.util.*;
public class positiveString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        boolean result=PositiveString(str);
        System.out.println(result);
	}

	private static boolean PositiveString(String str) {
		// TODO Auto-generated method stub
		for(int i=0;i<str.length()-1;i++)
        {
	         if(str.charAt(i)<str.charAt(i+1))
	         {
	        	 int j=0;
	         }
	         else 
	        	 return false;        
        }
		return true;
	}

}
