package hedspi.test;

import java.util.ArrayList;
import hedspi.io.SerializeFileFactory;
import hedspi.model.KhachHang;

public class TestKhachHang2 {
	public static void testLuuFile() {
		ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
		dsKH.add(new KhachHang("KH01", "Truong Van Hung"));
		dsKH.add(new KhachHang("KH02", "Truong Tan Sang"));
		dsKH.add(new KhachHang("KH03", "Truong Thi Hoan"));
		dsKH.add(new KhachHang("KH04", "Truong Thi Tam"));
		
		boolean kt = SerializeFileFactory.luuFile(dsKH, "G://testLuuFile2.txt");
		if(kt == true) {
			System.out.println("Ban da luu file thanh cong!");
		} else {
			System.out.println("luu file that bai!");
		}
	}

	public static void main(String[] args) {
//		testLuuFile();
		ArrayList<KhachHang> dsKH = SerializeFileFactory.docFile("G://testLuuFile2.txt");
		System.out.println("Danh sach khach hang nhap vao may tinh la: ");
		System.out.println("Ma\t Ten");
		for(KhachHang item : dsKH) {
			System.out.println(item);
		}
	}

}
