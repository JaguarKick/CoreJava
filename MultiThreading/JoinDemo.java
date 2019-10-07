class Runner implements Runnable {
	private String text;
	Runner(String text) {
		this.text = text;
	}

	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(text);
			try{ Thread.sleep(10);}catch(Exception e){}
		}
	}
}

public class JoinDemo {
	public static void main(String args[]) {
		Thread th1 = new Thread(new Runner("Hello"));
		Thread th2 = new Thread(new Runner("Konichiwa"));
		Thread th3 = new Thread(new Runner("Namastey"));
		Thread th4 = new Thread(new Runner("Hola"));
		Thread th5 = new Thread(new Runner("Ni Hao"));
		try{
			th1.start();
			th1.join();
			th2.start();
			th2.join();
			th3.start();
			th3.join();
			th4.start();
			th4.join();
			th5.start();
                        th5.join();
		}catch(InterruptedException ie) {
			System.out.println(ie);
		}
	}
}
