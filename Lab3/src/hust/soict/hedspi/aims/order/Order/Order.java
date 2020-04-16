package hust.soict.hedspi.aims.order.Order;

import java.util.Calendar;
import java.util.Random;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Order {
	public static final int MAX_NUMBER_ORDER = 10;
	public static final int MAX_LIMIT_ORDERS = 2;
	public static String dateOrderd = "2020/04/10";
	private static int qtyOrder = 0;
	private static int nbOrders = 0;
	private static DigitalVideoDisc itemOrder[] = new DigitalVideoDisc[MAX_NUMBER_ORDER];
	
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
		checkMaxDVD();
		itemOrder[qtyOrder] = new DigitalVideoDisc();
		itemOrder[qtyOrder] = disc;
		qtyOrder++;
		nbOrders++;
	
	}
//	override
	public static void addDigitalVideoDisc(DigitalVideoDisc [] dvdlist) {
		int i = 0;
		while(qtyOrder + (i+1) <= MAX_NUMBER_ORDER - 1) {
			checkMaxDVD();
			itemOrder[qtyOrder] = new DigitalVideoDisc();
			itemOrder[qtyOrder] = dvdlist[i];
			qtyOrder++;
			i++;
		}
	}
	public static void addDigitalVideoDisc(DigitalVideoDisc [] dvdlist, int size) {
		int i = 0;
		while(qtyOrder + (i+1) <= MAX_NUMBER_ORDER - 1) {
			checkMaxDVD();
			if(i == (size - 1)) {
				System.exit(1);
			}
			itemOrder[qtyOrder] = new DigitalVideoDisc();
			itemOrder[qtyOrder] = dvdlist[i];
			qtyOrder++;
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
		System.out.println("ORDER " + (nbOrders+1));
		System.out.println(getDateOrderd());
		for (int i = 0; i < qtyOrder; i++) {
			System.out.print((i+1) + ". DVD");
			System.out.print(" - [" + itemOrder[i].getTitle() + "]");
			System.out.print(" - [" + itemOrder[i].getCategory() + "]");
			System.out.print(" - [" + itemOrder[i].getDiretor() + "]");
			System.out.print(" - [" + itemOrder[i].getLength() + "]");
			System.out.println(" : [" + itemOrder[i].getCost() + "]$");
			System.out.println();
		}
		System.out.println("Total cost is: [" + totalCost() + "]");
		System.out.println("*************************************************************************");
	}
	
	public static void getALuckyItem() {
		Random random = new Random();
		int j = random.nextInt(qtyOrder);
		System.out.println("**************************************Order**********************************");
		System.out.println(getDateOrderd());
		for (int i = 0; i < qtyOrder; i++) {
			System.out.print((i+1) + ". DVD");
			System.out.print(" - [" + itemOrder[i].getTitle() + "]");
			System.out.print(" - [" + itemOrder[i].getCategory() + "]");
			System.out.print(" - [" + itemOrder[i].getDiretor() + "]");
			System.out.print(" - [" + itemOrder[i].getLength() + "]");
			System.out.println(" : [" + itemOrder[i].getCost() + "]$");
			System.out.println();
		}
		System.out.println("DVD " + itemOrder[j].getTitle() + " is free");
		System.out.println("Total cost is: [" + (totalCost() - itemOrder[j].getCost()) + "]");
		System.out.println("*************************************************************************");
	}
	
	public static void checkMaxDVD() {
		if(qtyOrder >= MAX_NUMBER_ORDER) {
			System.out.println("You can't add DVD because order is full!");
			System.exit(1);
		}
	}
	public static void checkMaxOrder() {
		if(nbOrders >= MAX_LIMIT_ORDERS) {
			System.out.println("You can't order more!");
			System.exit(1);
		}
	}
}
