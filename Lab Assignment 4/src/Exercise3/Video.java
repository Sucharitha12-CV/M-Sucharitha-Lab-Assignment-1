package Exercise3;

public class Video extends MediaItem{
	private String director;
	public Video(int id, String title, int copies, int yearOfRelease,String genre,String director) {
		super(id, title, copies, yearOfRelease,genre);
		this.director=director;
	}
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	public String print() {
		super.print();
		return ("director: "+this.getDirector());
	}

}
