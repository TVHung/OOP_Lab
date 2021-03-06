package hust.soict.hedspi.aims.disc.DigitalVideoDisc;

import java.util.Scanner;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String diretor;
	private int length;
	private float cost;
	private Scanner input;
	
	//getter and setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	//contructor
	public DigitalVideoDisc() {
		super();
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public DigitalVideoDisc(String title, String category) {
		super();
		this.title = title;
		this.category = category;
	}
	public DigitalVideoDisc(String title, String category, String diretor) {
		super();
		this.title = title;
		this.category = category;
		this.diretor = diretor;
	}
	public DigitalVideoDisc(String title, String category, String diretor, int length) {
		super();
		this.title = title;
		this.category = category;
		this.diretor = diretor;
		this.length = length;
	}
	public DigitalVideoDisc(String title, String category, String diretor, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.diretor = diretor;
		this.length = length;
		this.cost = cost;
	}
	
	public void inputDVD() {
		String iTitle, iCategory, iDirector;
		int iLength;
		float iCost;
		input = new Scanner(System.in);
			System.out.println("Enter title: ");
			iTitle	= input.nextLine();
			setTitle(iTitle);
			
			System.out.println("Enter category: ");
			iCategory	= input.nextLine();
			setCategory(iCategory);
			
			System.out.println("Enter diretor: ");
			iDirector	= input.nextLine();
			setDiretor(iDirector);
			
			System.out.println("Enter length: ");
			iLength	= input.nextInt();
			setLength(iLength);
			
			System.out.println("Enter cost: ");
			iCost	= input.nextFloat();
			setCost(iCost);
	}
	
	public boolean search(String title) {
		if(this.title.equalsIgnoreCase(title)) {
			return true;
		}
		if(this.title.toLowerCase().contains(title.toLowerCase())) {
			return true;
		}
		return false;
	}
}
