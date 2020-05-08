package hust.soict.hedspi.aims.media;

public class Disc extends Media implements Comparable<Disc>{
	private int length;
	private String director;
	
	public Disc() {
	
	}
	
	public Disc(String title) {
		super(title);
	}
	
	public Disc(String title, String category) {
		super(title, category);
	}
	
	public Disc(String title, String category, float cost) {
		super(title, category, cost);
	}
	
	public Disc(String title, String category, float cost, String director) {
		super(title, category, cost);
		this.director = director;
	}
	
	public Disc(String title, String category, float cost, String director, int length) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	protected void show() {
		
	}
	@Override
	public int compareTo(Disc o) {
		if (o == this) { 
            return 0; 
        } 
        return this.getTitle().compareTo(o.getTitle());
	};
}
