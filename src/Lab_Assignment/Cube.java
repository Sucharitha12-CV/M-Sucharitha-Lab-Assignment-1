package Lab_Assignment;

import java.util.Scanner;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		System.out.println(Cube(number));

	}

	private static int Cube(int num) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			sum=sum+(i*i*i);
		}
		return sum;
	}

}
