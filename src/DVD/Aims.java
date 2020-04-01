package DVD;

public class Aims {

	public static void main(String[] args) {
		Order anOrder = new Order();
		anOrder.checkMax();
		
		//create new DVD
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDiretor("Roger aller");
		dvd1.setLength(87);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDiretor("George Lucas");
		dvd2.setLength(124);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDiretor("John Musker");
		dvd3.setLength(90);
		anOrder.addDigitalVideoDisc(dvd3);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Hung");
		dvd4.setCategory("Animation");
		dvd4.setCost(19.99f);
		dvd4.setDiretor("Truong Van Hung");
		dvd4.setLength(90);
		anOrder.addDigitalVideoDisc(dvd4);
		
		//anOrder.removeDigitalVideoDisc(dvd3);
		
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
		//anOrder.addDigitalVideoDisc(dvdList);
		anOrder.addDigitalVideoDisc(dvdList[0], dvdList[1]);
		
		
		anOrder.showInfor();
		System.out.println("Total cost is: [" + anOrder.totalCost() + "]");
		System.out.println("*************************************************************************");
	}

}
