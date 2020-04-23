package hedspi.model;

import java.io.Serializable;

public class KhachHang implements Serializable{
	private int ma;
	private String ten;
	private String phone;
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public KhachHang() {
		super();
	}
	public KhachHang(int ma, String ten, String phone) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return this.ma + " - " + this.ten + " - " + this.phone;
	}
}
