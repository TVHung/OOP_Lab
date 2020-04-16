package hust.soict.hedspi.garbage;

public class GarbageCreator {

	public static void main(String[] args) {
		String s = "Hello ";
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			s = s + "hello ";
		}
		System.out.println(System.currentTimeMillis() - start);
	}

}
