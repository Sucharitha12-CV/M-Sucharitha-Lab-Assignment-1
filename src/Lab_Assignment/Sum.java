package Lab_Assignment;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int result=calculateSum(number);
		
		System.out.println(result);
		

	}

	private static int calculateSum(int number) {
		// TODO Auto-generated method stub
		int value=number;
		int sum=0;
		for(int i=1;i<=value;i++)
		{
			if(i%3==0||i%5==0)
				sum=sum+i;
		}
		
		return sum;
	}

}
