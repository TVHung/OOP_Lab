package hust.soict.hedspi.aims.thread;

public class Aims {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MemoryDaemon());
		thread1.start();
		
		Thread thread2 = new Thread(new MemoryDaemon());
		thread2.start();
	}

}
