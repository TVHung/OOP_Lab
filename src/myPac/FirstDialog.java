package myPac;

import java.util.Scanner;

public class FirstDialog {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input a: ");
		double a = keyboard.nextDouble();
		System.out.println("Please input b: ");
		double b = keyboard.nextDouble();
		
		if(a == 0) {
			System.out.println("Phuong trinh vo nghiem");
		}else {
			double x = -b/a;
			System.out.println("Phuong trinh co nghiem la: " + x);
		}
			 
		
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
		
//		String strNum1, strNum2;
////		String strNotification = "you've just entered";
//		String strNotification = "Sum of two number is: ";
//		
//		strNum1 = JOptionPane.showInputDialog(null, "Please input first number: ", "Input first number", JOptionPane.INFORMATION_MESSAGE);
//		//strNotification += " " + strNum1 + " and ";
//		
//		strNum2 = JOptionPane.showInputDialog(null, "Please input second number: ", "Input second number", JOptionPane.INFORMATION_MESSAGE);
//		//strNotification += strNum2 +  " ";
//		
//		double num1, num2, sum;
//		num1 = Double.parseDouble(strNum1);
//		num2 = Double.parseDouble(strNum2);
//		sum = num1 + num2;
//		strNotification += sum;
//		
//		JOptionPane.showMessageDialog(null, strNotification, "Sum of two number", JOptionPane.INFORMATION_MESSAGE);
//		System.exit(0);
		
//		String name = JOptionPane.showInputDialog("Please input your name!");
//		JOptionPane.showMessageDialog(null, "Hello" + name + "! How are you!");
//		System.exit(0);
	}

}
