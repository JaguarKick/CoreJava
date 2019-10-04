class Runner implements Runnable {
	public void run() {
		System.out.println("I'm inside Thread " + Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getName() + " has ended.");
	}
}

public class RunnableInterfaceDemo {
	public static void main(String args[]) {
		Thread t1 = new Thread(new Runner());
		Thread t2 = new Thread(new Runner());
		Thread t3 = new Thread(new Runner());
		System.out.println("This is the main thread. Thread name is : " + Thread.currentThread().getName());
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Main thread has ended." + Thread.currentThread().getName());
	}
}
