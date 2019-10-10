class Runner implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " has started.");
		for(int i=0;i<100;i++) {
			try{
				Thread.sleep(100);
			}catch(Exception e) {}
		}
		System.out.println(Thread.currentThread().getName() + " has ended.");
	}
}

class Finisher implements Runnable {
	public void run() {
		System.out.println("Shutdown hook has been invoked.");
	}
}

public class ShutdownHookDemo {
	public static void main(String args[]) {
		Runtime rt = Runtime.getRuntime();
		rt.addShutdownHook(new Thread(new Finisher()));
		Thread th1 = new Thread(new Runner());
		Thread th2 = new Thread(new Runner());
		Thread th3 = new Thread(new Runner());
		th1.start();
		th2.start();
		th3.start();
	}
}
