package LabAssignment3;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int countChar=0,countWord=0,countLine=0;
        for(int i=0;i<str.length();i++)
        {
        	if(str.charAt(i)!=' ')
        	    countChar++;
        	if(str.charAt(i)==' ')
        		countWord++;
        	if(str.charAt(i)=='.')
        		countLine++;
        }
        System.out.println("characters:"+countChar);
        System.out.println("Words:"+(countWord+1));
        System.out.println("Lines:"+countLine);
        
	}

}
