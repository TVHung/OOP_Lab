package hust.soict.hedspi.aims.media;

import java.awt.List;
import java.util.ArrayList;

public class Book {
	private String title;
	private String Category;
	private float cost;
	private ArrayList<String> authors = new ArrayList<String>();
	
	public Book() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public ArrayList<String> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		
	}
	
	public void removeAuthor(String authorName){
		
	}
	
	
}
