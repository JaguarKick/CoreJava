class Runner extends Thread {
	private String name;

	Runner(String name) {
		this.name  = name;
	}

	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hello from " + name);
		}
	}
}

public class JoinDemo2 {
	public static void main(String args[]) {
		Runner r1 = new Runner("S1mpl3");
		Runner r2 = new Runner("Stevie2K");
		Runner r3 = new Runner("Dev1c3");
		Runner r4 = new Runner("KennyS");
		Runner r5 = new Runner("ScReAm");
		try {
			r1.join(2000);
			r2.join(4000);
			r3.join(5000);
			r4.join(1000);
			r5.join(7000);
			r1.start();
			r2.start();
			r3.start();
			r4.start();
			r5.start();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
