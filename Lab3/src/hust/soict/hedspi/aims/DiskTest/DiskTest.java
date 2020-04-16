package hust.soict.hedspi.aims.DiskTest;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order.Order;

public class DiskTest {

	public static void main(String[] args) {
		Order Order1 = new Order();
		
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
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDiretor("John Musker");
		dvd3.setLength(90);
		Order1.addDigitalVideoDisc(dvd3);
		
		Order1.getALuckyItem();
		
		System.out.println(dvd1.search("the"));
	}

}
