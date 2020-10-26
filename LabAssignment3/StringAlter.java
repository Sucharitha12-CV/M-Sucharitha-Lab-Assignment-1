package LabAssignment3;
import java.util.Scanner;
public class StringAlter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String result=alterString(str);
        System.out.println(result);
        
	}

	private static String alterString(String str) {
		// TODO Auto-generated method stub
	    char[] c=new char[str.length()];
        for(int i=0;i<str.length();i++)
			
		{
	         char j=str.charAt(i);
			 if(j=='a'||j=='e'||j=='i'||j=='o'||j=='u'||j=='A'||j=='E'||j=='I'||j=='O'||j=='U') {
		         c[i]=j;
			 }
			 else {
				 c[i]=(char)(j+1);
		     }
		}
        String s=new String(c);
		return s;
	}

}
