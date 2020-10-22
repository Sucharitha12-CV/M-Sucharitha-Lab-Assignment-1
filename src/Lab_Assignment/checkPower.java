package Lab_Assignment;

import java.util.Scanner;
import java.math.*;
public class checkPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		System.out.println(checkNumber(number));

	}

	private static boolean checkNumber(int num) {
		// TODO Auto-generated method stub
		if(num%2!=0)
		{
			return false;
		}
		else
		{
			for(int i=0;i<=num;i++)
			{
				if((Math.pow(2, i))==num)
					return true;
			}
		}
		return false;
	}

}
