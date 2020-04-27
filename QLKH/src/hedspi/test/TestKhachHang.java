package hedspi.test;

import java.util.ArrayList;
import java.util.Scanner;

import hedspi.io.SerializeFileFactory;
import hedspi.io.TextFileFactory;
import hedspi.model.KhachHang;

public class TestKhachHang {
	public static void testLuuFile() {
		ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
		dsKH.add(new KhachHang("KH01", "Truong Van Hung"));
		dsKH.add(new KhachHang("KH02", "Truong Tan Sang"));
		dsKH.add(new KhachHang("KH03", "Truong Thi Hoan"));
		dsKH.add(new KhachHang("KH04", "Truong Thi Tam"));
		
		boolean kt = TextFileFactory.luuFile(dsKH, "G://testLuuFile.txt");
		if(kt == true) {
			System.out.println("Ban da luu file thanh cong!");
		} else {
			System.out.println("luu file that bai!");
		}
	}
	
	public static void menu() {
		System.out.println("1. Nhập khách hàng");
		System.out.println("2. Xuất khách hàng");
		System.out.println("3. Tìm kiếm khách hàng");
		System.out.println("4. Sắp xếp khách hàng");
		System.out.println("5. Lưu khách hàng");
		System.out.println("6. Đọc khách hàng");
		System.out.println("7. Thống kê nhà mạng");
		System.out.println("8. Thoát");
		System.out.println("Mời bạn chọn chức năng [1...8]: ");
		int chon = 0;
		System.out.println("Mời bạn chọn chức năng [1...8]:");
		chon = new Scanner(System.in).nextInt();
		switch(chon) {
		case 1:
			
		}
	}
	
	public static void main(String[] args) {
//		testLuuFile();
		ArrayList<KhachHang> dsKH = TextFileFactory.docFile("G://testLuuFile.txt");
		System.out.println("Danh sach khach hang nhap vao may tinh la: ");
		System.out.println("Ma\t Ten");
		for(KhachHang item : dsKH) {
			System.out.println(item);
		}
	}

}
