class Runner extends Thread {
	private String threadName;

	Runner(String threadName){
		this.threadName = threadName;
	}

	public void run() {
		System.out.println(threadName + " has started.");
		for(int i=0;i<10;i++) {
			System.out.println(threadName + "counts " +i);
			try {
				Thread.sleep(100);
			}catch(InterruptedException ie) {
				System.out.println(ie);
			}
		}
		System.out.println(threadName + " has ended.");
	}
}

public class SleepDemo {
	public static void main(String args[]) {
		Runner run1 = new Runner("Sam");
		Runner run2 = new Runner("Mike");
		Runner run3 = new Runner("William");
		run1.start();
		run2.start();
		run3.start();
	}
}
