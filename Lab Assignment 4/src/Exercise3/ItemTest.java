package Exercise3;
import java.util.*;
public class ItemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int choice;
		int i=0;
		int id,copies;
		String title,genre;
		int yearOfRelease;
		while(i==0) {
			System.out.println("Items to be added in library:");
			System.out.println("1. Journal Paper\n2. CDs\n3. Videos\n4. Exit");
			choice=s.nextInt();
			switch(choice) {
			case 1:
				id=s.nextInt();
				title=s.next();
				copies=s.nextInt();
				String author=s.next();
				int yearPublished=s.nextInt();
				Item journalItem=new JournalPaper(id,title,copies,author,yearPublished);
				System.out.println(journalItem.print());
				break;
			case 2:
				id=s.nextInt();
				title=s.next();
				copies=s.nextInt();
				yearOfRelease=s.nextInt();
				genre=s.next();
				String artist=s.next();
				Item cd=new CD(id,title,copies,yearOfRelease,genre,artist);
				System.out.println(cd.print());
				break;
			case 3:
				id=s.nextInt();
				title=s.next();
				copies=s.nextInt();
				yearOfRelease=s.nextInt();
				genre=s.next();
				String director=s.next();
				Item video=new Video(id,title,copies,yearOfRelease,genre,director);
				System.out.println(video.print());
				break;
			case 4:
				i=1;
				break;
			default:
				System.out.println("Wrong Choice");
				break;
				
				
			}
		}

	}

}
