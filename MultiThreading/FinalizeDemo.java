class Runner implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is running.");
		System.out.println(Thread.currentThread().getName() + " has ended.");
	}
	protected void finalize() {
		System.out.println("Finalized.");
	}
}

public class FinalizeDemo {
	public static void main(String args[]) throws Exception {
		Thread th = new Thread(new Runner());
		th.start();
		Thread.sleep(1000);
		System.gc();
	}
}


