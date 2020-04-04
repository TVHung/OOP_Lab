package hust.soict.hedspi.week2;

import java.util.Scanner;

public class Week2 {

	public static void main(String[] args) {
//		bai 5.1
//		int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket");
//		JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION?"yes":"no") );
//		System.exit(0);
		
		//bai5.2
//		Scanner input = new Scanner(System.in);
//		System.out.println("What's your name?");
//		String name = input.nextLine();
//		System.out.println("How old are you?");
//		int age = input.nextInt();
//		System.out.println("How tall are you (m)?");
//		double height = input.nextDouble();
//		
//		System.out.println("Mrs/Mr." + name + ", " + age + " years old, " + " your height is " + height + "(m).");

//		bai 5.3: debug
		
		
//		Bai 5.4
//		Scanner input = new Scanner(System.in);
//		System.out.println("Nhap n: ");
//		int n = input.nextInt();
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < 2*i + 1; j++) {
//				if(j == 0){
//					for (int j2 = 0; j2 < n-i-1; j2++) {
//						System.out.print(" ");
//					}
//				}
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		//bai 5.5
//		Scanner num = new Scanner(System.in);
//		int check = 1;
//		int nam, thang;
//		do {
//			System.out.println("Nhap thang: ");
//				thang = num.nextInt();
//			System.out.println("Nhap nam: ");
//				nam = num.nextInt();
//				
//			if(thang < 0 || thang > 12 || nam < 0) {
//				check = 0;
//			}else {
//				check = 1;
//			}
//		}while(check == 0);
//		if(thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
//			System.out.println("So ngay trong thang " + thang + " la: 31 ngay");
//		}else if(thang == 4 || thang == 6 || thang == 9 || thang == 11) {
//			System.out.println("So ngay trong thang " + thang + " la: 30 ngay");
//		}else {
//			if (((nam % 4 == 0) && (nam % 100!= 0)) || (nam % 400 == 0)) {
//				System.out.println("So ngay trong thang 2 la: 29 ngay");
//			}else {
//				System.out.println("So ngay trong thang 2 la: 28 ngay");
//			}
//			  
//		}
		
		//bai 5.6
//		int[] array = {13, 9, 1999, 4, 8, 1999};
//		int sum = 0;
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				if (array[i] < array[j]) {
//					int tmp = 0;
//					tmp = array[i];
//					array[i] = array[j];
//					array[j] = tmp;
//				}
//			}
//		}
//		for (int i = 0; i < array.length; i++) {
//			sum += array[i];
//		}
//		
//		System.out.println("Day sau khi sap xep: ");
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
//		System.out.println("");
//		System.out.println("Tong cua day so la: " + sum);
//		System.out.println("Trung binh cua day so la: " + sum/array.length);
		
		
		//bai 5.7
//		Scanner num = new Scanner(System.in);
//		
//		System.out.println("Input size matrix: ");
//		int n = num.nextInt();
//		int[][] matrix1 = new int[n][n];
//		int[][] matrix2 = new int[n][n];
//		int[][] matrixSum = new int[n][n];
//		
//		System.out.println("Input matrix 1: ");
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				matrix1[i][j] = num.nextInt();
//			}
//		}
//		System.out.println("Input matrix 2: ");
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				matrix2[i][j] = num.nextInt();
//			}
//		}
//		System.out.println("Ma tran tong cua 2 ma tran la:");
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
//				System.out.print(matrixSum[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

}
