package LabAssignment3;
import java.util.Scanner;
public class MirrorImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String result=getImage(str);
		System.out.println(str+"|"+result);

	}

	private static String getImage(String str) {
		// TODO Auto-generated method stub
		StringBuilder sb=new StringBuilder(str);
		sb=sb.reverse();
		String res=sb.toString();
		return res;
	}

}
