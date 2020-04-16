package hust.soict.hedspi.aims.media;

import java.util.Scanner;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;

public class Aims {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		int select; 
		Order order = new Order();
		do {
			showMenu();
		    select = scanner.nextInt();

		    switch (select) {
		        case 1:
		        	System.out.println("The order created!");
		        	break;
		        case 2:
		        	System.out.println("Choose type of item: 1- Disc / 2- Book.");
		        	int type = scanner.nextInt();
		        	if(type == 1) {
		        		DigitalVideoDisc item = new DigitalVideoDisc("Disc");
		        		order.addMedia(item);
		        	} else if(type == 2) {
		        		Book item = new Book("Hello");
		        		order.addMedia(item);
					} else {
						System.out.println("This type isn't valid!");
					}
		            break;
		        case 3:
		        	System.out.print("Input the id of item: ");
		        	int id = scanner.nextInt();
		        	boolean flag = false;
		        	for(Media item : order.getItemsOrdered()) {
		        		if(item.getId() == id) {
		        			flag = true;
		        			order.removeMedia(item);
		        			break;
		        		}
		        	}
		        	if(!flag) {
		        		System.out.println("This item hasn't in order!");
		        	}
		        	break;
		        case 4:
		        	order.showOrder();
		            break;
		        default:
		        	break;
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
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	

}