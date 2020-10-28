
package LabAssignment3;
import java.util.Scanner;
public class DiffDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        String str=String.valueOf(num);
        int result=modifyNumber(str);
        System.out.println(result);
        
	}

	private static int modifyNumber(String str) {
		// TODO Auto-generated method stub
		int n=0;
		for(int i=0;i<str.length();i++)
		{
			if(i<str.length()-1)
			{
			    char ch1=str.charAt(i);
			    char ch2=str.charAt(i+1);
			    int num=ch1-ch2;
		     	if(num<0)
				    num=num*(-1);
			
			    n=num+n*10;
			}
			else
			{
				char ch1=str.charAt(i);
			    char ch2=str.charAt(0);
			    int num=ch1-ch2;
		     	if(num<0)
				    num=num*(-1);
		     	n=num+n*10;
			}
		}
		return n;
	}

}
