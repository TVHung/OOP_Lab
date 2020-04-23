package hust.soict.hedspi.aims.thread;

import java.lang.management.MemoryUsage;

public class MemoryDaemon implements Runnable{
	private long longMemoryUsed = 0;
	@Override
	public void run() {
		Runtime rt = Runtime.getRuntime();
		long used;
		
		while(true) {
			used = rt.totalMemory() - rt.freeMemory();
			if(used != longMemoryUsed) {
				System.out.println("Memory used = " + used);
				longMemoryUsed = used;
			}
			//System.out.println("Memory used = " + i);
		}
	}

}
