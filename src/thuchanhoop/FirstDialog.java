package thuchanhoop;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class FirstDialog {

	public static void main(String[] args) {
//phuong trinh bac 1
//		Scanner keyboard = new Scanner(System.in);
//		System.out.println("Please input a: ");
//		double a = keyboard.nextDouble();
//		System.out.println("Please input b: ");
//		double b = keyboard.nextDouble();
//		
//		if(a == 0) {
//			System.out.println("Phuong trinh vo nghiem");
//		}else {
//			double x = -b/a;
//			System.out.println("Phuong trinh co nghiem la: " + x);
//		}
			 
//phuong trinh bac 2		
//		Scanner keyboard = new Scanner(System.in);
//		System.out.println("Please input a: ");
//		double a = keyboard.nextDouble();
//		System.out.println("Please input b: ");
//		double b = keyboard.nextDouble();
//		System.out.println("Please input c: ");
//		double c = keyboard.nextDouble();
//		
//		double delta = b*b - 4*a*c;
//		
//		double x1, x2;
//		if(delta == 0) {
//			x1 = -b/(2*a);
//			System.out.println("Phuong trinh co 1 nghiem duy nhat: " + x1);
//		}else if(delta < 0) {
//			System.out.println("Phuong trinh vo nghiem");
//		}else {
//			x1 = (-b+Math.sqrt(delta))/(2*a);
//			x2 = (-b-Math.sqrt(delta))/(2*a);
//			System.out.println("Phuong trinh co hai nghiem la: " + x1 + " va " + x2);
//		}
		
//Tinh tong 2 so		
//		String strNum1, strNum2;
//		//String strNotification = "you've just entered";
//		String strNotification = "Sum of two number is: ";
//		
//		strNum1 = JOptionPane.showInputDialog(null, "Please input first number: ", "Input first number", JOptionPane.INFORMATION_MESSAGE);
//		strNotification += " " + strNum1 + " and ";
//		
//		strNum2 = JOptionPane.showInputDialog(null, "Please input second number: ", "Input second number", JOptionPane.INFORMATION_MESSAGE);
//		strNotification += strNum2 +  " ";
//		
//		double num1, num2, sum;
//		num1 = Double.parseDouble(strNum1);
//		num2 = Double.parseDouble(strNum2);
//		sum = num1 + num2;
//		strNotification += sum;
//		
//		JOptionPane.showMessageDialog(null, strNotification, "Sum of two number", JOptionPane.INFORMATION_MESSAGE);
//		System.exit(0);
//		
//		String name = JOptionPane.showInputDialog("Please input your name!");
//		JOptionPane.showMessageDialog(null, "Hello" + name + "! How are you!");
//		System.exit(0);
		
//them phan xac nhan co muon tinh tong tiep hay khong va tinh tong la 2 so thuc
//		String strNum;
//		double sum = 0;
//		int iLuaChon;
//		String strNotification = "Tong la: ";
//		do {
//			strNum = JOptionPane.showInputDialog(null, "Nhap so thuc: ", "Input", JOptionPane.INFORMATION_MESSAGE);
//			double num;
//			num = Double.parseDouble(strNum);
//			sum += num;
//	
//		  	iLuaChon = JOptionPane.showConfirmDialog(null,"Co nhap tiep hay khong", "Xac nhan nhap tiep",
//		  		JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
//		}while(iLuaChon == JOptionPane.YES_OPTION);
//		
//		strNotification += sum;
//		JOptionPane.showMessageDialog(null, strNotification, "Message", JOptionPane.INFORMATION_MESSAGE);
//		System.exit(0);
		
//bai 3: nhap thang va nam sau do dua ra so ngay tuong ung cua nam da nhap
		Scanner num = new Scanner(System.in);
		int check = 1;
		int nam, thang;
		do {
			System.out.println("Nhap thang: ");
				thang = num.nextInt();
			System.out.println("Nhap nam: ");
				nam = num.nextInt();
				
			if(thang < 0 || thang > 12 || nam < 0) {
				check = 0;
			}else {
				check = 1;
			}
		}while(check == 0);
		if(thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
			System.out.println("So ngay trong thang " + thang + " la: 31 ngay");
		}else if(thang == 4 || thang == 6 || thang == 9 || thang == 11) {
			System.out.println("So ngay trong thang " + thang + " la: 30 ngay");
		}else {
			if (((nam % 4 == 0) && (nam % 100!= 0)) || (nam % 400 == 0)) {
				System.out.println("So ngay trong thang 2 la: 29 ngay");
			}else {
				System.out.println("So ngay trong thang 2 la: 28 ngay");
			}
			  
		}
	}
}


















































