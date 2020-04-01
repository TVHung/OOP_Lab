package myPac;

public class counter {
	public static int count = 0;
/*	nếu không có static thì khi in ở main cả 3 đối tượng để in ra 1 do 3 đối tượng được lưu ở 3 
	vùng nhớ khác nhau nên giá trị của count cũng là 3 giá trị khác nhau nên không trả về 3
	thêm static thì cả 3 đối tượng sẽ dùng chung một biến*/
	
	public counter() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
	
	public void showCount() {
		System.out.println("Count: " + count);
	}
}
