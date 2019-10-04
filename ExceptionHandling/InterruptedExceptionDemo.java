public class InterruptedExceptionDemo {
	public static void main(String args[]) {
		Runnable runner = ()-> { 
			System.out.println("Running thread.");
			try{
				Thread.sleep(30000);
			}catch(InterruptedException ie) {
				System.out.println(ie);
			}
		};
		new Thread(runner).start();
		System.exit(0);
	}
}
