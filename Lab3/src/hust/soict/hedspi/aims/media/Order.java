package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Iterator;

public class Order {
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	private String dateOrdered; 
	
	public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}

	public void setItemsOrdered(ArrayList<Media> itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	
	public void addMedia(Media media) {
		if(!(itemsOrdered.contains(media))) {
			itemsOrdered.add(media);
		}else {
			System.out.println("Media is exist, you can't add media");
		}
	}

	public void removeMedia(Media media) {
		if(itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
		}else {
			System.out.println("Media is not exist, you can't remove media");
		}
	}
	
	public void showOrder() {
		System.out.println("********************************ORDER********************************");
		System.out.println("Date: " + dateOrdered);
		System.out.println("Ordered Items:" );
		for(Media item : this.itemsOrdered) {
			String title = item.getTitle();
			String category = item.getCategory();
			float price = item.getCost();
			System.out.println(item.getId() + " - " + title + " - " + category + " - " + price + "$" );
        }
		System.out.println("Total Cost:" + this.totalCost());
		System.out.println("*********************************************************************");
		
	}

	public float totalCost() {
		float total = 0;
        Media mediaItem;
        Iterator<Media> iter = itemsOrdered.iterator();

        while(iter.hasNext()){
            mediaItem = (Media) (iter.next());
            total += mediaItem.getCost();
        }
        return total;
	}

}
