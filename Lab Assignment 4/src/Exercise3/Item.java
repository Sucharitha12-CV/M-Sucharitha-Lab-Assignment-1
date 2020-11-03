package Exercise3;

abstract class Item {
	protected int id;
	protected String title;
	protected int copies;
	abstract String print();
	public Item(int id,String title,int copies) {
		this.id=id;
		this.title=title;
		this.copies=copies;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}
	
}
