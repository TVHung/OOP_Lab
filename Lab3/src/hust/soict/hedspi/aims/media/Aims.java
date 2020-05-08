package hust.soict.hedspi.aims.media;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aims {

	private static Scanner scanner;
//	private static ArrayList<Order> arrOrder = new ArrayList<Order>();
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int select;
		Order Obj = null;
		CompactDisc cd = null;
		do {
			showMenu();
		    select = scanner.nextInt();

		    switch (select) {
		    	case 0:
		    		break;
		        case 1:
		        	Obj = new Order(); 
		        	System.out.println("The order created!");
		        	break;
		        case 2:
		        	if(Obj == null) {
		        		System.out.println("You have been created a new order! Please choice 1!");
		        		break;
		        	}
		        	else {
		        		System.out.println("Choose type of item:");
		        		System.out.println("1. DVD.");
		        		System.out.println("2. Book.");
		        		System.out.println("3. CD.");
		        		int type = scanner.nextInt();
		        		if(type == 1) {
		        			DigitalVideoDisc dvd = new DigitalVideoDisc();
		        			dvd.inputDVD();
		        			int choosePlay;
				        	System.out.println("Choose type you want play:");
			        		System.out.println("1. yes.");
			        		System.out.println("2. No.");
			        		choosePlay = scanner.nextInt();
			        		if(choosePlay == 1) {
			        			dvd.play();
			        		}
		        			Obj.addMedia(dvd);
		        			
		        		} else if(type == 2) {	
		        			Book book = new Book();
		        			book.inputBook();
		        			Obj.addMedia(book);
		        		} else if(type == 3) {	
		        			cd = new CompactDisc();
		        			cd.inputCD();
		        			System.out.println("Do you want add information of the Track?");
		        			System.out.println("1. Yes.");
			        		System.out.println("2. No.");
			        		int cf = scanner.nextInt();
		        			if(cf == 1) {
		        				int cfTrack;
								do {
		        					Track track = new Track();
		        					track.inputTrack();
		        					cd.addTrack(track);
		        					System.out.println("Do you want add more Track?");
		        					System.out.println("1. Yes.");
		        					System.out.println("2. No.");
		        					cfTrack = scanner.nextInt();
		        				}while(cfTrack == 1);
		        			}
		        			Obj.addMedia(cd);
		        		} else {
		        			System.out.println("This type isn't valid!");
		        		}
		        	}
		            break;
		        case 3:
		        	System.out.print("Input the id of item: ");
		        	int id = scanner.nextInt();
		        	boolean flag = false;
		        	for(Media item : Obj.getItemsOrdered()) {
		        		if(item.getId() == id) {
		        			flag = true;
		        			Obj.removeMedia(item);
		        			break;
		        		}
		        	}
		        	if(!flag) {
		        		System.out.println("This item hasn't in order!");
		        	}
		        	break;
		        case 4:
		        	if(Obj == null) {
		        		System.out.println("You have been created a new order! Please choice 1!");
		        	}else {
		        		Obj.showOrder();
		        	}
		            break;
		        case 5:
	    			if(cd == null) {
	    				System.out.println("You have not created a CD yet!");
	    				break;
	    			}else {
	    				cd.selectListTrack();
	    			}
		    }
		} while (select != 0);
		
	}

	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("5. Play track from CD.");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}
	

}







