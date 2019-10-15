import java.util.concurrent.*;

class Runner implements Runnable {
	public void run() {
		try {
			System.out.println("Runner thread has started.");
			for(int i=0;i<10;i++) {
				System.out.println("\t.. is running.");
				Thread.sleep(100);
			}
		}catch(Exception e){}
		System.out.println("Runner has ended.");
	}
}

public class ExecutorServiceDemo {
	public static void main(String args[]) {
		ExecutorService exeService = Executors.newSingleThreadExecutor();
		exeService.execute(new Runner());
		exeService.shutdown();
		System.out.println("Main has ended.");
	}
}
