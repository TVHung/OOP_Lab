package Week4;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[15];
		for (int i = 0; i < a.length; i++) {
			a[i] = -5 + i;
		}
		HoVaTenSV_MaSV_Cau1 sv1 = new HoVaTenSV_MaSV_Cau1(a);
		
		System.out.println("So so giong so 2 trong mang la: " + sv1.countElement(2));
	}

}
