package myPac;

public class student extends person {
	public student(String vName, String vCode, int vBirthday) {
		super(vName, vCode, vBirthday);
		// TODO Auto-generated constructor stub
	}

	public double point;
	
	public void setPoint(double vPoint){
		this.point = vPoint;
	}
	public double getPoint() {
		return this.point;
	}
	
	public void showInfor() {
		super.showInfor();
		System.out.println("Point: "+this.point);
	}
}
