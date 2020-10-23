/**
 * Description: To find the second smallest element in the array
 * Author: M Sucharitha
 * date:23-10-2020 
 */
import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int number;
		System.out.println("Enter the no of elements:");
		number=s.nextInt();
		int a[]=new int[number];
		System.out.println("Enter the elements:");
		for(int i=0;i<number;i++)
		{
			a[i]=s.nextInt();
		}
		int result=GetSecondSmallest(a);
		System.out.println("Second Smallest Integer:"+result);
		
		

	}

	private static int GetSecondSmallest(int[] a) {
		// TODO Auto-generated method stub
		int temp;
		for(int i=0;i<=a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[1];
	}

}
