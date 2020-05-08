package hust.soict.hedspi.test.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

public class TestCompareMedia {

	public static void main(String[] args) {
		java.util.Collection collection = new ArrayList<Media>();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("Star war");
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("The lion king");
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin");
		
		collection.add(dvd1);
		collection.add(dvd2);
		collection.add(dvd3);
		
		
		Iterator iterator = collection.iterator();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("The books currently in order are:");
		while(iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc) iterator.next()).getTitle());
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
//		List<DigitalVideoDisc> dvdList = (List<DigitalVideoDisc>) collection;
//		Collections.sort(dvdList);
		Collections.sort((java.util.ArrayList)collection);
		iterator = collection.iterator();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("The books in sorted order are:");
		while(iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc) iterator.next()).getTitle());
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

}

