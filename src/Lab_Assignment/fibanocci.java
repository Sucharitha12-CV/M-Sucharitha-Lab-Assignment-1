package Lab_Assignment;

import java.util.Scanner;

public class fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int firstNumber=0,secondNumber=1,thirdNumber,i,number;
		number=s.nextInt();
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		for(i=2;i<number;i++)
		{
			thirdNumber=firstNumber+secondNumber;
			System.out.println(thirdNumber);
			firstNumber=secondNumber;
			secondNumber=thirdNumber;
		}

	}

}
