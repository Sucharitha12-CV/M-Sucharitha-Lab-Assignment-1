package Lab_Assignment;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int i=0;
		int num=0;
		for(i=0;i<=number;i++)
		{
			int count=0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
					count=count+1;
			}
			if(count==2)
				System.out.println(i);
		}
		
		

	}

}
