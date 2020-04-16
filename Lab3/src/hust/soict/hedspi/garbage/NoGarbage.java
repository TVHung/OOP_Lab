package hust.soict.hedspi.garbage;

public class NoGarbage {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello ");
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			sb.append("hello ");
		}
		System.out.println(System.currentTimeMillis() - start);
	}

}
