package DVD;

import java.util.Calendar;

public class Order {
	private static int qtyOrder = 0;
	
	public static final int MAX_NUMBER_ORDER = 5;
	
	private static DigitalVideoDisc itemOrder[] = new DigitalVideoDisc[MAX_NUMBER_ORDER];
	
	private static String dateOrderd;
	
	private static int nbOrders = 0;
	
	public static final int MAX_LIMIT_ORDERS = 5;
	
	public static String getDateOrderd() {
		return dateOrderd;
	}

	public static void setDateOrderd(String dateOrderd) {
		Order.dateOrderd = dateOrderd;
	}

	public int getQtyOrder() {
		return qtyOrder;
	}

	public void setQtyOrder(int qtyOrder) {
		this.qtyOrder = qtyOrder;
	}

	public static void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrder <= MAX_NUMBER_ORDER - 1) {
			itemOrder[qtyOrder] = new DigitalVideoDisc();
			itemOrder[qtyOrder] = disc;
			qtyOrder++;		
		}else {
			System.out.println("Order is full, you can't add DVD");
		}
	}
//	override
	public static void addDigitalVideoDisc(DigitalVideoDisc [] dvdlist) {
		if(qtyOrder + dvdlist.length <= MAX_NUMBER_ORDER - 1) {
			for (int i = 0; i < dvdlist.length; i++) {
				itemOrder[qtyOrder] = new DigitalVideoDisc();
				itemOrder[qtyOrder] = dvdlist[i];
				qtyOrder++;
			}			
		}else {
			
			System.out.println("Order is full, you can't add list dvd");
		}
		
	}
	
	public static void addDigitalVideoDisc(DigitalVideoDisc [] dvdlist, int size) {
		if(qtyOrder + size <= MAX_NUMBER_ORDER - 1) {
			for (int i = 0; i < size; i++) {
				itemOrder[qtyOrder] = new DigitalVideoDisc();
				itemOrder[qtyOrder] = dvdlist[i];
				qtyOrder++;
			}
		}else {
			System.out.println("Order is full, you can't add list dvd");
		}
	}
	
	public static void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		if(qtyOrder <= MAX_NUMBER_ORDER - 2) {
			itemOrder[qtyOrder] = new DigitalVideoDisc();
			itemOrder[qtyOrder] = disc1;
			qtyOrder++;
			itemOrder[qtyOrder] = new DigitalVideoDisc();
			itemOrder[qtyOrder] = disc2;
			qtyOrder++;
		}else if(qtyOrder == MAX_NUMBER_ORDER - 1) {
			itemOrder[qtyOrder] = new DigitalVideoDisc();
			itemOrder[qtyOrder] = disc1;
			qtyOrder++;
			System.out.println("You can't add dvd: " + disc2.getTitle());
		}else {
			System.out.println("You can't add dvd: " + disc1.getTitle());
			System.out.println("You can't add dvd: " + disc2.getTitle());
		}
		
	}
	
	
	
	public static void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int check = 0;
		for (int i = 0; i < qtyOrder; i++) {
			if(itemOrder[i] == disc) {
				check = 1;
				for (int j = i; j < qtyOrder; j++) {
					DigitalVideoDisc tmp = new DigitalVideoDisc();
					tmp = itemOrder[j+1];
					itemOrder[j] = tmp;
				}
				itemOrder[qtyOrder-1] = null;
				qtyOrder--;
				System.out.println("You deleted dvd");
			}
		}
		if(check == 0) {
			System.out.println("Not exist DVD");
		}
	}
	
	public static float totalCost() {
		float cost = 0;
		for (int i = 0; i < qtyOrder; i++) {
			cost += itemOrder[i].getCost();  
		}
		return cost;	
	}
	
	public void autoDate() {
		String date;
		int day, month, year;
		Calendar cal = Calendar.getInstance(); 
		day = cal.get(Calendar.DAY_OF_MONTH);
		month = cal.get(Calendar.MONTH);
		year = cal.get(Calendar.YEAR);
	}
	
	public static void showInfor() {
		System.out.println("**************************************Order**********************************");
		for (int i = 0; i < qtyOrder; i++) {
			System.out.print((i+1) + ". DVD");
			System.out.print(" - [" + itemOrder[i].getTitle() + "]");
			System.out.print(" - [" + itemOrder[i].getCategory() + "]");
			System.out.print(" - [" + itemOrder[i].getDiretor() + "]");
			System.out.print(" - [" + itemOrder[i].getLength() + "]");
			System.out.println(" : [" + itemOrder[i].getCost() + "]$");
			System.out.println();
		}
	}
	
	public static void checkMax() {
		if(qtyOrder >= 10) {
			System.out.println("You can't add DVD because order is full!");
		}
	}
}
