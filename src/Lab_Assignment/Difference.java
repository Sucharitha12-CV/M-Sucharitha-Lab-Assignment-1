package Lab_Assignment;

import java.util.Scanner;

public class Difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int number;
		number=s.nextInt();
		int result=calculateDifference(number);
		System.out.println(result);

	}

	private static int calculateDifference(int number) {
		// TODO Auto-generated method stub
		int sumsquare=0,sum=0,squaresum;
		for(int i=1;i<=number;i++)
		{
			sumsquare=(i*i)+sumsquare;
			sum=sum+i;
		}
		squaresum=sum*sum;
		return (sumsquare-squaresum);
	}

}
