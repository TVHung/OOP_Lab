package Week5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class DemSoTu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap mot xau ki tu: ");
			String xau = input.nextLine();
		StringTokenizer soTu = new StringTokenizer(xau);
		System.out.println("So luong tu trong xau ki tu la: " + soTu.countTokens());
		//soTu.nextToken(); nếu muốn hiển thị các từ ra thì dùng cái hàm này để trỏ đến các token tiếp theo 
	}

}
