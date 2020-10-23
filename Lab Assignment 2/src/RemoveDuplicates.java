import java.util.Arrays;
import java.util.Scanner;

/**
 * Description: To accept an integer array and removes all the duplicates in the array. Return the resulting array in descending order
 * Author: M Sucharitha
 * date:23-10-2020 
 */
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int number=s.nextInt();
		int arr[]=new int[number];
		System.out.println("Enter the elements:");
		for(int i=0;i<number;i++)
		{
			arr[i]=s.nextInt();
		}
		int des[]=modifyArray(arr,number);
		for(int i=des.length-1;i>=0;i--)
			System.out.println(des[i]);

	}

	private static int[] modifyArray(int[] arr, int n) {
		// TODO Auto-generated method stub
		if(n==0||n==1)
			return arr;
		Arrays.sort(arr);
		int[] temp=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
				temp[j++]=arr[i];
		}
		temp[j++]=arr[n-1];
		for(int i=0;i<j;i++ )
			arr[i]=temp[i];
		Arrays.sort(arr);
		return arr;
	}

}
