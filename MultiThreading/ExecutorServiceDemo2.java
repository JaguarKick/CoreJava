import java.util.concurrent.*;

class Runner implements Runnable {
	public void run() {
		System.out.println("Runner has started.");
		try{
			for(int i=0;i<20;i++) {
				Thread.sleep(200);
				System.out.println("\t... is running.");
			}
		}catch(Exception e){}
		System.out.println("Runner has ended.");
	}
}

public class ExecutorServiceDemo2 {
	public static void main(String args[]) throws Exception {
		ExecutorService exeService = Executors.newSingleThreadExecutor();
		Future future = exeService.submit(new Runner());
		System.out.println(future.get());
		Thread.sleep(5000);
		System.out.println(future.get());
		exeService.shutdown();
	}
}
