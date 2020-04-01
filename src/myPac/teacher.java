package myPac;

import java.util.Calendar;

public class teacher {
	public String name;
	public String code;
	public int birthday;
	public double salary;
	
	//showInfor
	public void showInfor() {
		System.out.println("Teacher Information");
		System.out.println("name: " + this.name);
		System.out.println("MSSV: " + this.code);
		System.out.println("Birthday: " + this.birthday);
	}
	
	//contructor
	public teacher(String vName, String vcode, int vBirthday) {
		this.name = vName;
		this.code = vcode;
		this.birthday = vBirthday;
	}
	
	//setter
	public void setName(String vName) {
		this.name = vName;
	}
	public void setCode(String vCode) {
		this.code = vCode;
	}
	public void setBirthday(int vBirthday) {
		this.birthday = vBirthday;
	}
	
	//getter
	public String getName(){
		return this.name;
	}
	public String getCode(){
		return this.code;
	}
	public int getBirthday(){
		return this.birthday;
	}
	
	public int getAge() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.YEAR) - this.getBirthday();
	}
}
