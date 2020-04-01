package Week5;

import java.util.*;

public class ChuanHoaXau {
	public static String chuyenInHoa(String str){
		String s,strOutput;
		s= str.substring(0, 1);//lấy kí tự đầu tiên của chuỗi được nạp
		strOutput= str.replaceFirst(s,s.toUpperCase());// ghi đè kí tự đầu tiên thành viết hoa
		return (strOutput);
	}
	public static String chuanHoa(String strInput){
		String strOutput="";
		StringTokenizer strToken = new StringTokenizer(strInput," ,\t,\r");//đưa vào chuỗi và các kí tự để nhận biết tách chữ
		strOutput+=""+chuyenInHoa(strToken.nextToken());//khởi đầu của chuổi
		while(strToken.hasMoreTokens()){//hasMoreToken trả về true nếu còn nhiều token trong chuỗi
			strOutput+=" "+chuyenInHoa(strToken.nextToken());
		}
		return(strOutput);
	}
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Nhap vao 1 xau: ");
		String strInput= input.nextLine();
		System.out.println("Xau duoc chuan hoa la: " + chuanHoa(strInput));
	}

}

//public String substring(int startIndex): Phương thức này trả về đối tượng chuỗi mới là chuỗi 
//con của chuỗi đã cho tính từ startIndex đã nhập đến cuối cùng.
//--> lấy n kí tự đầu

//public String substring(int startIndex, int endIndex): Phương thức này trả về đối tượng chuỗi
//mới là chuỗi con của chuỗi đã cho tính startIndex đến endIndex đã nhập.
//--> lấy kí từ từ x->y