class Runner implements Runnable {
	public void run() {
		System.out.println("The name of this thread is " + Thread.currentThread().getName());
	}
}

public class ThreadNameDemo2 {
	public static void main(String args[]) {
		Thread th = new Thread(new Runner(),"Sam");
		th.start();
	}
}
