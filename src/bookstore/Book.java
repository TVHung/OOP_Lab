package bookstore;

public class Book {
	private String ID;
	private String name;
	private double price;
	
	public Book(String ID, String name, double price) {
		this.setID(ID);
		this.setName(name);
		this.setPrice(price);
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}
	public String getID() {
		return ID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	
	public void showInfor() {
		System.out.println("Book information:");
		System.out.println("ID     :" + this.getID());
		System.out.println("Name   :" + this.getName());
		System.out.println("Price  :" + this.getPrice());
	}
}
