package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Scanner;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private int length;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void addTrack(Track track) {
		boolean check = true;
		for(Track t : tracks) {
			if(t.equals(track) == true) {
				check = false;
			}
		}
		if(check){
			tracks.add(track);
		}else{
			System.out.println("Author is exist, you can't add author");
		}
	}
	
	public void removeTrack(Track track) {
		if(tracks.equals(track)) {
			tracks.remove(track);
		}else {
			System.out.println("Author is not exist, you can't remove author");
		}
	}
	public int getLength() {
		return length;
	}
	
	public void play() {
		
	}
	
	public void inputCD() {
		String iTitle, iCategory, iArtist;
		int iLength;
		float iCost;
		Scanner input = new Scanner(System.in);
			System.out.println("Enter title: ");
			iTitle	= input.nextLine();
			setTitle(iTitle);
			
			System.out.println("Enter artist: ");
			iArtist	= input.nextLine();
			setDirector(iArtist);
			
			System.out.println("Enter category: ");
			iCategory	= input.nextLine();
			setCategory(iCategory);
			
			System.out.println("Enter cost: ");
			iCost	= input.nextFloat();
			setCost(iCost);
	}
	public void show() {
		System.out.println("CD: " + this.getTitle() + " - " + this.getArtist() + " - " + this.getCategory() + " - " + this.getCost());
	}
	
	public void selectListTrack() {
		int count = 1;
		Scanner scanner = new Scanner(System.in);
		int chooseTrack;
		for(Track item : this.tracks) {
			System.out.println("Track " + count + ": " + item.getTitle());
			count++;
        }
		System.out.println("Input number of track you want play?");
		chooseTrack = scanner.nextInt();
		if(chooseTrack < 1 || chooseTrack >= count) {
			System.out.println("Track is not exit!");
			System.exit(1);
		}
		tracks.get(chooseTrack-1).play();
	}
	@Override
	public int compareTo(Disc o) {
		if (o == this) { 
            return 0; 
        } 
        return this.getTitle().compareTo(o.getTitle());
	}
}
