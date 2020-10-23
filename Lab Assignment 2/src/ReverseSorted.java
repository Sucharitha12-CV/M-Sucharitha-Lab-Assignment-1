import java.util.Arrays;
import java.util.Scanner;

/**
 * Description: To reverse the elements in the array and sort them.
 * Author: M Sucharitha
 * date:23-10-2020 
 */
public class ReverseSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of arrays:");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int result=getSorted(arr,n);
		

	}

	private static int getSorted(int[] arr,int n) {
		// TODO Auto-generated method stub
		StringBuilder rev[]=new StringBuilder[n];
		
		for(int i=0;i<n;i++)
		{
			String str=Integer.toString(arr[i]);
			StringBuilder sb=new StringBuilder(str);
			rev[i]=sb.reverse();
				
		}
		Arrays.sort(rev);
		for(int i=0;i<rev.length;i++)
			System.out.println(rev[i]);
			
		return 0;
	}

}
