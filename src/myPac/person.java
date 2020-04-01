package myPac;

import java.util.Calendar;

public class person {

	public String name;
	public String code;
	public int birthday;
	public int age;
	
	//showInfor
	public void showInfor() {
		System.out.println("Student Information");
		System.out.println("name: " + this.getName());
		System.out.println("MSSV: " + this.getCode());
		System.out.println("Birthday: " + this.getBirthday());
		System.out.println("Age: " + this.getAge());
	}
	
	//contructor
	public person(String vName, String vCode, int vBirthday) {
		this.name = vName;
		this.code = vCode;
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
