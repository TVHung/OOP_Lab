package hust.soict.hedspi.test.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

public class Main {

	public static void main(String[] args) {
		Collection collection = new java.util.ArrayList<>();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Star war");
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("The lion king");
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin");
		
		collection.add(dvd1);
		collection.add(dvd2);
		collection.add(dvd3);
		
		Iterator iterator = collection.iterator();
		System.out.println("------------------------------------");
		System.out.println("The DVDs curently in the order are: ");
		while (iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
		}
		
		Collections.sort((java.util.ArrayList)collection);
		iterator = collection.iterator();
		
		System.out.println("------------------------------------");
		System.out.println("The DVDs in sorted order are: ");
		while (iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
		}
		System.out.println("------------------------------------");
	}

}
