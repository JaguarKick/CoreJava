class Runner extends Thread {
	public void run() {
		System.out.println("Runner has started.");
		try{
			do{
				Thread.sleep(100);
				System.out.println("Runner is still running.");
			}while(true);
		}catch(InterruptedException ie) {
			System.out.println(ie);
		}
	}
}

public class InterruptDemo {
	public static void main(String args[]) throws Exception{
		Runner run = new Runner();
		run.start();
		Thread.sleep(20000);
		run.interrupt();
	}
}
		
