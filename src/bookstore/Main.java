package bookstore;

import java.util.Scanner;

public class Main {
	private static Book bookObj = null;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int functionID = 0;
		boolean flag = true;
		do{
			showMenu();
			functionID = sc.nextInt();
			sc.nextLine();
			switch (functionID) {
			case 1:
				addBook();
				break;
			case 2:
				editBook();
				break;
			case 3:
				inforBook();
				break;
			default:
				flag = false;
				break;
			}
			
			if(functionID == 4)
				flag = false;
			if(functionID < 1 || functionID > 4) {
				myPrint("Please input number from 1 to 4!");
				flag = true;
			}
		}while(flag);
		sc.close();
	}
	
	public static void myPrint(String content) {
		System.out.println(content);
	}
	
	public static void showMenu() {
		myPrint("------------------Book Manager---------------");
		myPrint("1. Add book");
		myPrint("2. Edit book");
		myPrint("3. Infor Book");
		myPrint("4. Exit");
		myPrint("Your choice [1-4]: ");
	}
	
	public static void addBook() {
		String bookID = "";
		String bookName = "";
		double bookPrice = 0;
		
		Scanner sc = new Scanner(System.in);
		myPrint("ID: ");
		bookID = sc.nextLine();
		
		myPrint("Name: ");
		bookName = sc.nextLine();
		
		myPrint("Price: ");
		bookPrice = sc.nextDouble();
		
		bookObj = new Book(bookID, bookName, bookPrice);
		
	}
	public static void editBook() {
		if(bookObj != null) {
			String bookName = "";
			double bookPrice = 0;
			Scanner sc = new Scanner(System.in);
			
			myPrint("Name: ");
			bookName = sc.nextLine();
			
			myPrint("Price: ");
			bookPrice = sc.nextDouble();
			
			bookObj.setName(bookName);
			bookObj.setPrice(bookPrice);
			
		}else {
			myPrint("Ban chua nhap sach");			
		}
	}
	public static void inforBook() {
		if(bookObj != null)
			bookObj.showInfor();
		else
			myPrint("Ban chua nhap sach");
	}
}
