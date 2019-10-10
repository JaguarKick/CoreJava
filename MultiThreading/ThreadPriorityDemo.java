class Runner implements Runnable {
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName() + " has started.");
		for(int i=0;i<5000;i++) {
		}
		System.out.println("Thread " + Thread.currentThread().getName() + " has ended.");
	}
}


public class ThreadPriorityDemo {
	public static void main(String args[]) {
		Thread th1 = new Thread(new Runner());
		Thread th2 = new Thread(new Runner());
		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.MAX_PRIORITY);
		th1.start();
		th2.start();
	}
}
