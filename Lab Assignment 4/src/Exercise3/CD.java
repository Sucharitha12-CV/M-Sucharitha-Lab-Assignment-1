package Exercise3;

public class CD extends MediaItem{
	private String artist;
	public CD(int id,String title,int copies,int yearOfRelease,String genre,String artist) {
		super(id,title,copies,yearOfRelease,genre);
		this.artist=artist;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String print() {
		super.print();
		return ("artist: "+this.getArtist());
	}
	

}
