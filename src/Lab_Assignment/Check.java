package Lab_Assignment;

import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		System.out.println(checkNumber(number));

	}

	private static boolean checkNumber(int num) {
		// TODO Auto-generated method stub
		int lastdigit;
		int secondlast;
		while(num/100>0)
		{
			lastdigit=num%10;
			secondlast=(num/10)%10;
			if(lastdigit<secondlast)
				return false;
			num=num/10;
		}
		lastdigit=num%10;
		secondlast=num/10;
		if(lastdigit<secondlast)
			return false;
		
		return true;
	}

}
