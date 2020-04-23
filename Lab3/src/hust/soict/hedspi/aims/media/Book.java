package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Scanner;

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
	
	public void inputBook() {
		String iTitle, iCategory;
		String iAuthor;
		float iCost;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter title: ");
		iTitle	= input.nextLine();
		setTitle(iTitle);
		
		System.out.println("Enter category: ");
		iCategory	= input.nextLine();
		setCategory(iCategory);
		
		System.out.println("Enter author: ");
		iAuthor	= input.nextLine();
		authors.add(iAuthor);
		
		System.out.println("Enter cost: ");
		iCost	= input.nextFloat();
		setCost(iCost);
	}
}
