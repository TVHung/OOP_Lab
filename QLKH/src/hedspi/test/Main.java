package hedspi.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import hedspi.io.SerializeFileFactory;
import hedspi.model.KhachHang;

public class Main {
	
	static ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
	
	@SuppressWarnings("resource")
	public static void menu() {
		System.out.println("1. Nhập khách hàng");
		System.out.println("2. Xuất khách hàng");
		System.out.println("3. Tìm kiếm khách hàng");
		System.out.println("4. Sắp xếp khách hàng");
		System.out.println("5. Lưu khách hàng");
		System.out.println("6. Đọc khách hàng");
		System.out.println("7. Thống kê nhà mạng");
		System.out.println("8. Xóa khách hàng");
		System.out.println("9. Sửa đổi thông tin khách hàng");
		System.out.println("10. Thoát");
		System.out.println("Mời bạn chọn chức năng [1...10]: ");
		int chon = 0;
		chon = new Scanner(System.in).nextInt();
		switch(chon) {
		case 1:
			xuLyNhap();
			break;
		case 2:
			xuLyXuat();
			break;
		case 3: 
			xuLyTim();
			break;
		case 4:
			xuLySapXep();
			break;
		case 5:
			xuLyLuu();
			break;
		case 6:
			xuLyDoc();
			break;
		case 7:
			xuLyThongKe();
			break;
		case 8:
			xoaKhachHang();
			break;
		case 9:
			suaThongTin();
			break;
		case 10:
			xuLyThoat();
			break;
		default:
			System.out.println("Vui lòng nhập các số từ 1 đến 10!");
			System.out.println("=================================================");
			break;
		}
	}
	private static void xuLyNhap() {
		KhachHang kh = new KhachHang();
		String ma = null, ten = null, phone = null, diachi = null, email = null;
		
		int check = 0;
		//xử lý nhập mã
		do {
			System.out.println("Mời bạn nhập mã:");
			ma = new Scanner(System.in).nextLine();
			for(KhachHang k : dsKH) {
				if(k.getMa().compareToIgnoreCase(ma) == 0) {
					check = 1;
					System.out.println("Mã bị trùng, làm ơn nhập mã khác!");
					break;
				}else {
					check = 0;
				}
			}
		}while(check == 1);
		
		System.out.println("Mời bạn nhập tên:");
		ten = new Scanner(System.in).nextLine();
		
		//xử lý nhập số điện thoại
		do {
			System.out.println("Mời bạn nhập số điện thoại:");
			phone = new Scanner(System.in).nextLine();
			for(KhachHang k : dsKH) {
				if(k.getPhone().compareToIgnoreCase(phone) == 0) {
					check = 1;
					System.out.println("Số điện thoại bị trùng, làm ơn nhập số điện thoại khác!");
					break;
				}else {
					check = 0;
				}
			}
		}while(check == 1);
		
		System.out.println("Mời bạn nhập địa chỉ:");
		diachi = new Scanner(System.in).nextLine();
		
		//xử lý nhập email
		do {
			System.out.println("Mời bạn nhập email:");
			email = new Scanner(System.in).nextLine();
			for(KhachHang k : dsKH) {
				if(k.getEmail().compareToIgnoreCase(email) == 0 || email.contains("@gmail.com") == false) {
					check = 1;
					System.out.println("Email bị trùng hoặc bị sai định dạng, làm ơn nhập mã khác!");
					break;
				}else {
					check = 0;
				}
			}
		}while(check == 1);
		
		kh.setMa(ma);
		kh.setTen(ten);
		kh.setPhone(phone);
		kh.setDiachi(diachi);
		kh.setEmail(email);
		dsKH.add(kh);
	}
	private static void xuLyXuat() {
		System.out.println("======================================================================================================");
		System.out.println("Mã\tTên\t\tPhone\t\tĐịa chỉ\t\t\t\tEmail");
		for(KhachHang kh : dsKH) {
			System.out.println(kh);
		}
		System.out.println("======================================================================================================");
	}
	private static void xuLyLuu() {
		boolean kh = SerializeFileFactory.luuFile(dsKH, "G:\\DSKH.txt");
		if(kh == true) {
			System.out.println("Đã lưu file thành công!");
			System.out.println("=========================================");
		}else {
			System.out.println("File chưa được lưu!");
			System.out.println("=========================================");
		}
	}
	private static void xuLyDoc() {
		dsKH = SerializeFileFactory.docFile("G:\\DSKH.txt");
		System.out.println("Đã đọc file thành công!");
		System.out.println("=========================================");
	}
	private static void xuLyTim() {
		System.out.println("Chọn chế độ tìm kiếm:");
		System.out.println("1. Tìm theo đầu số điện thoại\n2. Tìm theo tên khách hàng\n3. Tìm theo mã số\n4. Tìm theo địa chỉ\n5. Tìm theo email");
		int chooseSearch = new Scanner(System.in).nextInt();
		
		if(chooseSearch == 1) {
			System.out.println("Nhập đầu số muốn tìm: ");
			String dauSo = new Scanner(System.in).nextLine();
			System.out.println("======================================================================================================");
			System.out.println("Khách hàng có đầu số " + dauSo + ":");
			System.out.println("Mã\tTên\t\tPhone\t\tĐịa chỉ\t\t\t\tEmail");
			for(KhachHang kh : dsKH) {
				if(kh.getPhone().startsWith(dauSo)) {
					System.out.println(kh);
				}
			}
			System.out.println("======================================================================================================");
		}else if(chooseSearch == 2) {
			System.out.println("Nhập tên khách hàng muốn tìm:");
			String nameSearch = new Scanner(System.in).nextLine();
			System.out.println("======================================================================================================");
			System.out.println("Khách hàng liên quan: ");
			System.out.println("Mã\tTên\t\tPhone\t\tĐịa chỉ\t\t\t\tEmail");
			for(KhachHang kh : dsKH) {
				if(kh.getTen().contains(nameSearch)) {
					System.out.println(kh);
				}
			}
			System.out.println("======================================================================================================");
		}else if(chooseSearch == 3) {
			System.out.println("Nhập mã số khách hàng muốn tìm:");
			String maSearch = new Scanner(System.in).nextLine();
			System.out.println("======================================================================================================");
			System.out.println("Khách hàng liên quan: ");
			System.out.println("Mã\tTên\t\tPhone\t\tĐịa chỉ\t\t\t\tEmail");
			for(KhachHang kh : dsKH) {
				if(kh.getMa().compareToIgnoreCase(maSearch) == 0) {
					System.out.println(kh);
				}
			}
			System.out.println("======================================================================================================");
		}else if(chooseSearch == 4) {
			System.out.println("Nhập địa chỉ khách hàng muốn tìm:");
			String dcSearch = new Scanner(System.in).nextLine();
			System.out.println("======================================================================================================");
			System.out.println("Khách hàng liên quan: ");
			System.out.println("Mã\tTên\t\tPhone\t\tĐịa chỉ\t\t\t\tEmail");
			for(KhachHang kh : dsKH) {
				if(kh.getDiachi().compareToIgnoreCase(dcSearch) == 0) {
					System.out.println(kh);
				}
			}
			System.out.println("======================================================================================================");
		}else if(chooseSearch == 5) {
			System.out.println("Nhập email khách hàng muốn tìm:");
			String emailSearch = new Scanner(System.in).nextLine();
			System.out.println("======================================================================================================");
			System.out.println("Khách hàng liên quan: ");
			System.out.println("Mã\tTên\t\tPhone\t\tĐịa chỉ\t\t\t\tEmail");
			for(KhachHang kh : dsKH) {
				if(kh.getEmail().compareToIgnoreCase(emailSearch) == 0) {
					System.out.println(kh);
				}
			}
			System.out.println("======================================================================================================");
		}else {
			System.out.println("Bạn đã nhập sai vui lòng nhập lại!");
			System.out.println("=========================================");
		}
	}
	private static void xuLySapXep() {
		Collections.sort(dsKH);
		System.out.println("Đã sắp xếp xong!");
		System.out.println("=========================================");
	}
	private static void xuLyThongKe() {
		int viettel = 0;
		int mobi = 0;
		int vina = 0;
		for(KhachHang kh : dsKH) {
			if(kh.getPhone().startsWith("037") || kh.getPhone().startsWith("038")) {
				viettel++;
			}
			if(kh.getPhone().startsWith("090") || kh.getPhone().startsWith("093")) {
				mobi++;
			}
			if(kh.getPhone().startsWith("091") || kh.getPhone().startsWith("094")) {
				vina++;
			}
		}
		System.out.println("Số khách hàng sử dụng mạng Viettel là: " + viettel);
		System.out.println("Số khách hàng sử dụng mạng Mobiphone là: " + mobi);
		System.out.println("Số khách hàng sử dụng mạng Vinaphone là: " + vina);
	}
	private static void xoaKhachHang() {
		System.out.println("Chọn chế độ xóa: \n1. Xóa 1 người.\n2. Xóa toàn bộ danh sách. ");
		int select = new Scanner(System.in).nextInt();
		if(select == 1) {
			boolean check = false;
			System.out.println("Nhập mã khách hàng muốn xóa: ");
			String ma = new Scanner(System.in).nextLine();
			for (int i = 0; i < dsKH.size(); i++) {
				if(dsKH.get(i).getMa().equals(ma)) {
					dsKH.remove(i);
					check = true;
				}
			}
			if(check) {
				System.out.println("Xóa khách hàng thành công!");
				System.out.println("=========================================");
			}else {
				System.out.println("Khách hàng không tồn tại, hoặc bạn đã nhập sai mã khách hàng!");
				System.out.println("=============================================================");
			}
		}
		if(select == 2) {
			System.out.println("Bạn có chắc chắn muốn xóa toàn bộ danh sách?\n1. Có.\n2. Không. ");
			int cf = new Scanner(System.in).nextInt();
			if(cf == 1) {
				dsKH.removeAll(dsKH);
				System.out.println("Bạn đã xóa toàn bộ khách hàng thành công!");
			}
		}
	}
	private static void suaThongTin() {
		if(dsKH.isEmpty()) {
			System.out.println("Danh sách khách hàng rỗng, bạn cần nhập thêm khách hàng!");
			System.out.println("========================================================");
		}else {
			System.out.println("Nhập mã khách hàng muốn sửa thông tin: ");
			String ma = new Scanner(System.in).nextLine();
			for (int i = 0; i < dsKH.size(); i++) {
				if(dsKH.get(i).getMa().compareToIgnoreCase(ma) == 0) {
					String phone = null, diachi = null, email = null;
					int check = 0;
					do {
						System.out.println("Mời bạn nhập số điện thoại:");
						phone = new Scanner(System.in).nextLine();
						for(KhachHang k : dsKH) {
							if(k.getPhone().compareToIgnoreCase(phone) == 0 && k.getMa().compareToIgnoreCase(ma) == 1) {
								check = 1;
								System.out.println("Số điện thoại bị trùng, làm ơn nhập số điện thoại khác!");
								break;
							}else {
								check = 0;
							}
						}
					}while(check == 1);
					
					System.out.println("Mời bạn nhập địa chỉ:");
					diachi = new Scanner(System.in).nextLine();
					
					//xử lý nhập email
					do {
						System.out.println("Mời bạn nhập email:");
						email = new Scanner(System.in).nextLine();
						for(KhachHang k : dsKH) {
							if((k.getEmail().compareToIgnoreCase(email) == 0 || email.contains("@gmail.com") == false) && k.getMa().compareToIgnoreCase(ma) == 1) {
								check = 1;
								System.out.println("Email bị trùng hoặc bị sai định dạng, làm ơn nhập mã khác!");
								break;
							}else {
								check = 0;
							}
						}
					}while(check == 1);
					
					dsKH.get(i).setPhone(phone);
					dsKH.get(i).setDiachi(diachi);
					dsKH.get(i).setEmail(email);
					System.out.println("Bạn đã cập nhật thành công!");
					System.out.println("========================================================");
				}
			}
		}
	}
	private static void xuLyThoat() {
		System.out.println("Cảm ơn bạn đã dùng phần mềm!");
		System.out.println("=========================================");
		System.exit(0);
	}
	public static void main(String[] args) {
		while(true) {
			menu();
		}
	}

}
