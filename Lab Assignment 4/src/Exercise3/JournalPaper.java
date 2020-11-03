package Exercise3;

public class JournalPaper extends WrittenItem{
	private int yearPublished;
	
	public JournalPaper(int id,String title,int copies,String author,int yearPublished) {
		super(id,title,copies,author);
		this.yearPublished=yearPublished;
	}
	
	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	String print() {
		return ("Journal Paper [year published="+yearPublished+ ", author name=" +author+ ", id="+id+", title="+title+", copies="+copies+"]");
	}
	

}
