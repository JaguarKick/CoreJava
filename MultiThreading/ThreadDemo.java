class Runner extends Thread {
	public void run() {
		System.out.println("I'm inside Thread " + Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName() + " has ended.");
	}
}

public class ThreadDemo {
	public static void main(String args[]) {
		Runner run1 = new Runner();
		Runner run2 = new Runner();
		Runner run3 = new Runner();

		System.out.println("I'm inside main. This is thread " + Thread.currentThread().getName());
		run1.start();
		run2.start();
		run3.start();
		System.out.println("Main has ended.");
	}
}
