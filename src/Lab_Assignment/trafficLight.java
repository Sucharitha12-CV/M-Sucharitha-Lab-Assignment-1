package Lab_Assignment;

import java.util.Scanner;

public class trafficLight {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Choice:\n1.red\n2.yellow\n3.green");
		int number=s.nextInt();
		if(number==1)
			System.out.println("stop");
		else if(number==2)
			System.out.println("ready");
		else if(number==3)
			System.out.println("go");

	}

}
