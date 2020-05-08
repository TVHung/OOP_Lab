package hust.soict.hedspi.aims.media;

import java.util.Scanner;

public class Track implements Playable, Comparable<Track>{
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void play() {
		System.out.println("Playing CD: " + this.getTitle());  
		System.out.println("CD length: " + this.getLength()); 
	}
	
	public void inputTrack() {
		String iTitle;
		int iLength;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter title: ");
		iTitle	= input.nextLine();
		setTitle(iTitle);
		
		System.out.println("Enter length: ");
		iLength	= input.nextInt();
		setLength(iLength);
		
		
	}
	
	public boolean equals(Track track) {
		if(this.getTitle().equalsIgnoreCase(track.getTitle()) && this.length == track.getLength()) {
			return true;
		}
		return false;
	}	
	@Override
	public int compareTo(Track o) {
		if (o == this) { 
            return 0; 
        } 
        return title.compareTo(o.title);
	}
}
