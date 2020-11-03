package Exercise3;

abstract public class WrittenItem extends Item{
	protected String author;
	
	public WrittenItem(int id, String title, int copies,String author) {
		super(id, title, copies);
		this.author=author;
		// TODO Auto-generated constructor stub
	}
	abstract String print();
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
