/**
 * Description: To accept an array of String objects and sort in alphabetical order. The elements in the left half should be completely in uppercase and the elements in the right half should be completely in lower case.
 * Author: M Sucharitha
 * date:23-10-2020 
 */

import java.util.Arrays;
import java.util.Scanner;

public class SortStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the Strings array:");
		int number=s.nextInt();
		System.out.println("Enter the Strings:");
		Scanner sc=new Scanner(System.in);
		String arr[]=new String[number];
		for(int i=0;i<number;i++)
		{
			arr[i]=sc.next();
		}
		String result=sortStrings(arr,number);

	}

	private static String sortStrings(String[] arr,int n) {
		// TODO Auto-generated method stub
		int i;
		String arr1=null;
		String arr2=null;
		for(i=0;i<n;i++)
		{
			int l=arr[i].length();
			if(l%2==0)
			{
				arr1=arr[i].substring(0,l/2);
				arr1=arr1.toUpperCase();
				arr2=arr[i].substring(l/2,l);
				arr2=arr2.toLowerCase();
				arr[i]=arr1+arr2;
			}
			else
			{
				arr1=arr[i].substring(0,l/2+1);
				arr1=arr1.toUpperCase();
				arr2=arr[i].substring(l/2+1,l);
				arr2=arr2.toLowerCase();
				arr[i]=arr1+arr2;
			}
			Arrays.sort(arr);
		}
		for(int j=0;j<n;j++)
			System.out.println(arr[j]);
		return null;
	}

}
