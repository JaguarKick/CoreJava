class Runner implements Runnable {
	public void run() {
		try {
			for(int i=0;i<100;i++) {
				System.out.println(Thread.currentThread().getName() + " is still running...");
				Thread.sleep(100);
			}
		}catch(Exception e) {}
	}
}

public class DaemonThreadDemo {
	public static void main(String args[]) throws Exception{
		System.out.println(Thread.currentThread().getName() + " has started.");
		Thread th1 = new Thread(new Runner());
		th1.setDaemon(true);
		th1.start();
		Thread.sleep(2000);
		System.out.println(Thread.currentThread().getName() + " has ended.");
	}
}
