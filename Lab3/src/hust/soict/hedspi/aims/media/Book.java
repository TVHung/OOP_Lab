package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class Book extends Media {
	private ArrayList<String> authors = new ArrayList<String>();
	
	public Book(){
		
    }
	public Book(String title) {
		super(title);
	}
	public Book(String title, String category) {
	    super(title, category);
	}
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
	
	public ArrayList<String> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if(!(authors.contains(authorName))) {
			authors.add(authorName);
		}else {
			System.out.println("Author is exist, you can't add author");
		}
	}
	
	public void removeAuthor(String authorName){
		if(authors.contains(authorName)) {
			authors.remove(authorName);
		}else {
			System.out.println("Author is not exist, you can't remove author");
		}
	}
	
	
}
