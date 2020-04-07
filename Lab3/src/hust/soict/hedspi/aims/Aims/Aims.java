package hust.soict.hedspi.aims.Aims;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order.Order;

public class Aims {

	public static void main(String[] args) {
		Order Order1 = new Order();
		Order1.checkMax();
		
		//create new DVD
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDiretor("Roger aller");
		dvd1.setLength(87);
		Order1.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDiretor("George Lucas");
		dvd2.setLength(124);
		Order1.addDigitalVideoDisc(dvd2);
		
//		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
//		dvd3.setCategory("Animation");
//		dvd3.setCost(18.99f);
//		dvd3.setDiretor("John Musker");
//		dvd3.setLength(90);
//		Order1.addDigitalVideoDisc(dvd3);
//		
//		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Hung");
//		dvd4.setCategory("Animation");
//		dvd4.setCost(19.99f);
//		dvd4.setDiretor("Truong Van Hung");
//		dvd4.setLength(90);
//		Order1.addDigitalVideoDisc(dvd4);
		
		//Order1.removeDigitalVideoDisc(dvd3);
		Order1.showInfor();
		System.out.println("Total cost is: [" + Order1.totalCost() + "]");
		System.out.println("*************************************************************************");
		
		Order Order2 = new Order();
		
		//create array object
		DigitalVideoDisc dvdList[] = new DigitalVideoDisc[2];
		//add dvdList 1
		dvdList[0] = new DigitalVideoDisc();
		dvdList[0].setTitle("I love VN");
		dvdList[0].setCategory("Action");
		dvdList[0].setCost(19.99f);
		dvdList[0].setDiretor("Truong Tan Sang");
		dvdList[0].setLength(90);
		//add dvdList 2
		dvdList[1] = new DigitalVideoDisc();
		dvdList[1].setTitle("I love you");
		dvdList[1].setCategory("Action");
		dvdList[1].setCost(13.09f);
		dvdList[1].setDiretor("DHBKHN");
		dvdList[1].setLength(120);
		//add array object
		Order2.addDigitalVideoDisc(dvdList[0], dvdList[1]);
		System.out.println(Order2.getQtyOrder());
//		Order2.showInfor();
//		System.out.println("Total cost is: [" + Order2.totalCost() + "]");
//		System.out.println("*************************************************************************");
		
	}

}
