package hedspi.model;

import java.io.Serializable;

public class KhachHang implements Serializable, Comparable<KhachHang>{
	private String ma;
	private String ten;
	private String diachi;
	private String email;
	private String phone;
	
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
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
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public KhachHang() {
		super();
	}
	public KhachHang(String ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	public KhachHang(String ma, String ten, String phone) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.phone = phone;
	}
	public KhachHang(String ma, String ten, String diachi, String email, String phone) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.diachi = diachi;
		this.email = email;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return this.ma + "\t" + this.ten + "\t" + this.phone + "\t" + this.diachi + "\t" + this.email;
	}
	@Override
	public int compareTo(KhachHang o) {
		return this.phone.compareToIgnoreCase(o.phone);
	}
}
