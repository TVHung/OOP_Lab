package week3;

import java.util.Calendar;
import java.util.Scanner;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	private String strDay;
	private String strMonth;
	private String strYear;
	
	//contructor
	public MyDate() {
		Calendar cal = Calendar.getInstance(); 
	
		setDay(cal.get(Calendar.DAY_OF_MONTH));
		setMonth(cal.get(Calendar.MONTH));
		setYear(cal.get(Calendar.YEAR));
	}
	public MyDate(int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	public MyDate(String string) {
		System.out.println(string);
	}
	
	//getter and setter
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	//overloadding setter
	public void setDay(String strDay) {
		this.strDay = strDay;
	}
	public void setMonth(String strMonth) {
		this.strMonth = strMonth;
	}
	public void setYear(String strYear) {
		this.strYear = strYear;
	}
	
	//input
	public void accept() {
		Scanner num = new Scanner(System.in);
		int iDay, iMonth, iYear;
		do {
			System.out.println("Input day: ");
			iDay = num.nextInt();			
		}while(iDay < 1 || iDay > 31);
		setDay(iDay);
		
		do {
			System.out.println("Input month: ");
			iMonth = num.nextInt();			
		}while(iMonth < 1 || iMonth > 12);
		setMonth(iMonth);
		
		do {
			System.out.println("Input year: ");
			iYear = num.nextInt();			
		}while(iYear < 1);
		setYear(iYear);
		
//		String strDay, strMonth, strYear;
//		  int iDay, iMonth, iYear;
//
//		  do{
//		    strDay = JOptionPane.showInputDialog(null,"Input day: ", JOptionPane.INFORMATION_MESSAGE);
//			iDay = Integer.parseInt(strDay);
//		  } while (iDay < 1 || iDay > 32);
//		  setDay(iDay);
//		  do{
//		    strMonth = JOptionPane.showInputDialog(null,"Input month: ", JOptionPane.INFORMATION_MESSAGE);
//			iMonth = Integer.parseInt(strMonth);
//		  } while (iMonth < 1 || iMonth > 12);
//		  setMonth(iMonth);
//
//		  do{
//		    strYear = JOptionPane.showInputDialog(null,"Input year: ", JOptionPane.INFORMATION_MESSAGE);
//			iYear = Integer.parseInt(strYear);
//		  } while (iYear < 0);
//		  setYear(iYear);
		
	}
	
	//print
	public void print() {
		System.out.println(getDay() + "/" + getMonth() + "/" + getYear());
	}
	
	public void strPrint() {
		System.out.println(this.strDay + "/" + this.strMonth + "/" + this.strYear);
	}
	
	
}
