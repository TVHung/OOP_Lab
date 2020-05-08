package hust.soict.hedspi.aims.media;

import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Order {
	public static final int MAX_NUMBERS_ORDEREDS = 5;
	public static final int MAX_LIMITED_ORDEREDS = 2;
	public int id = 0;
	
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private String dateOrdered = "17/04/2020";
	
	public Order() {
		super();
		if(id < MAX_LIMITED_ORDEREDS) {
			id++;
		} else {
			System.out.println("The order is limited to!");
		}
	}
	
	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	
	public void addMedia(Media media) {
		if(itemsOrdered.size() < MAX_NUMBERS_ORDEREDS) {
			if(itemsOrdered.equals(media) == true) {
				System.out.println("Media already exists, please enter another media!");
			}else {
				media.setId(itemsOrdered.size() + 1);
				this.itemsOrdered.add(media);
				System.out.println("The media has been added!");
			}
		} else {
			System.out.println("The order is full. Please remove old order before add !");
		}
		
	}
	
	public void removeMedia(Media media) {
		if(itemsOrdered.size() == 0) {
			System.out.println("The order is empty!");
		} else {
			if(this.itemsOrdered.contains(media)) {
				this.itemsOrdered.remove(media);
				System.out.println("The media has been removed!");
			} else {
				System.out.println("The media hasn't in the order!");
			}
		}
	}
	
	
	
	public void showOrder() {
		System.out.println("********************************ORDER********************************");
		System.out.println("Date: " + dateOrdered);
		System.out.println("Ordered Items:" );
	
		for(Media item : this.itemsOrdered) {
			//System.out.println(item.getId() + " - " + item.getTitle() + " - " + item.getCategory() + " - " + item.getCost());
			System.out.print(item.getId() + ". ");
			item.show();
        }
		System.out.println("Total Cost:" + this.totalCost());
		System.out.println("*********************************************************************");
		
	}

	public float totalCost() {
		float total = 0.0f;
		if(itemsOrdered.size() > 0) {
			for(Media item : this.itemsOrdered){
	            total += item.getCost();
	        }
		}
		return total;
	}
}
