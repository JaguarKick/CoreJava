class Runner implements Runnable {
	public void run() {
		System.out.println("Hello");
	}
}

public class IllegalThreadStateExceptionDemo {
	public static void main(String args[]) {
		Thread th = new Thread(new Runner());
		try{
			th.start();
			th.start();
		}catch(IllegalThreadStateException its) {
			System.out.println(its);
			System.out.println("You can't revive a dead thread.");
		}	
	}
}
