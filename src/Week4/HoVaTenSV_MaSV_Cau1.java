package Week4;

public class HoVaTenSV_MaSV_Cau1 {
	private int[] a = new int[15];
	
	//getter and setter
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	
	//contructor
	public HoVaTenSV_MaSV_Cau1() {
		
	}
	public HoVaTenSV_MaSV_Cau1(int[] a) {
		super();
		this.a = a;
	} 
	
	//phuong thuc dac ta dang chuoi cua mang
	public String toString() {
		
		return null;
	}
	
	//dem xem trong mang co bao nhieu phan tu bang voi n
	public int countElement(int n) {
		int count = 0;
		for (int i = 0; i < this.a.length; i++) {
			if(getA()[i] == n)
				count++;
		}
		return count;
	}
	
	public int countElement_2D() {
		return 0;
	}
	
}
