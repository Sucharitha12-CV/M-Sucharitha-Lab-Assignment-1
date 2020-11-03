package Exercise1;
import java.util.*;
/**
 * to validate the age of a person and display proper message by using user defined exception. Age of a person should be above 15.
 * @author Sucharitha M
 *
 */
public class AgeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=s.nextInt();
		try {
			if(age<=15)
				throw new InvalidAgeException("Invalid age");
			else
				System.out.println("Your age is: "+age);
		}
		catch(InvalidAgeException e) {
		System.out.println(e.getMessage());
		}

	}

}
