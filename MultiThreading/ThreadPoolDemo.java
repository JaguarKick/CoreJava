import java.util.concurrent.*;

class Runner implements Runnable {
	public void run() {
		System.out.println("Thread : " + Thread.currentThread().getId() + " has started.");
		for(int i=0;i<100;i++) {
			try{ Thread.sleep(100); } catch(Exception e) {}
		}
		System.out.println("Thread : " + Thread.currentThread().getId() + " has ended.");
	}
}

public class ThreadPoolDemo {
	public static void main(String args[]) {
		ExecutorService executor = Executors.newFixedThreadPool(20);
		for(int i=0;i<100;i++) {
			Runnable runner = new Runner();
			executor.execute(runner);
		}
		executor.shutdown();
		while(!executor.isTerminated()){}
		System.out.println("All threads are closed.");
	}
}
