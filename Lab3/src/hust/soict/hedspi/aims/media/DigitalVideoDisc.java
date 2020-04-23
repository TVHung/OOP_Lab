package hust.soict.hedspi.aims.media;

import java.util.Scanner;

public class DigitalVideoDisc extends Media implements Playable{
	private String diretor;
	private int length;

	public DigitalVideoDisc() {	
	}
	public DigitalVideoDisc(String title) {
		super(title);
	}	
	public DigitalVideoDisc(String title, String category) {
		super(title, category);
	}
	public DigitalVideoDisc(String title, String category, String diretor) {
		super(title, category);
		this.diretor = diretor;
	}
	public DigitalVideoDisc(String title, String category, String diretor, int length) {
		super(title, category);
		this.diretor = diretor;
		this.length = length;
	}
	public DigitalVideoDisc(String title, String category, String diretor, int length, float cost) {
		super(title, category);
		this.diretor = diretor;
		this.length = length;
		this.cost = cost;
	}
	//getter and setter
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
	
	public void inputDVD() {
		String iTitle, iCategory, iDirector;
		int iLength;
		float iCost;
		Scanner input = new Scanner(System.in);
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
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());  
		System.out.println("DVD length: " + this.getLength()); 
	}
}
