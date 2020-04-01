package week3;

import javax.swing.JOptionPane;

public class Point {
	private String pointName;
	private double hoanhdo;
	private double tungdo;
	
	//getter and setter
	public String getPointName() {
		return pointName;
	}
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}
	public double getHoanhdo() {
		return hoanhdo;
	}
	public void setHoanhdo(double hoanhdo) {
		this.hoanhdo = hoanhdo;
	}
	public double getTungdo() {
		return tungdo;
	}
	public void setTungdo(double tungdo) {
		this.tungdo = tungdo;
	}
	
	//contructor
	public Point() {
		setPointName("A");
		setHoanhdo(0);
		setTungdo(0);
	}
	public Point(double hoanhdo, double tungdo) {
		setPointName("NoName");
		setHoanhdo(hoanhdo);
		setTungdo(tungdo);
	}
	public Point(String pointName, double hoanhdo, double tungdo) {
		setPointName(pointName);
		setHoanhdo(hoanhdo);
		setTungdo(tungdo);
	}
	
	//method input one point 
	public void inputOnePoint() {
		String str1, str2;
		str1 = JOptionPane.showInputDialog(null, "Please input hoanh do: ", "Input", JOptionPane.INFORMATION_MESSAGE);
		str2 = JOptionPane.showInputDialog(null, "Please input tung do: ", "Input", JOptionPane.INFORMATION_MESSAGE);
		
		double num1, num2;
		num1 = Double.parseDouble(str1);
		num2 = Double.parseDouble(str2);
		
		this.setHoanhdo(num1);
		this.setTungdo(num2);
	}
	
	//method print information point
	public void printPoint() {
		System.out.println("Toa do la: " + this.getPointName() + "(" + this.getHoanhdo() + ", " + this.getTungdo() + ")");
	}
	
	
	
	
	
	
	
	
	
}
