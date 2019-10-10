class LapCount {
	private int laps;
	LapCount(int laps) {
		this.laps = laps;
	}

	public void withdraw() {
		laps = laps - 1;
	}
	
	public int getLaps() {
		return laps;
	}
}


class Runner implements Runnable {
	private LapCount lp;
	private int totalLap = 0;
	Runner(LapCount lp) {
		this.lp = lp;
	}

	public void run() {
		System.out.println(Thread.currentThread().getName() + " has started running...");
		while(lp.getLaps()>1) {
			synchronized(lp) {
				lp.withdraw();
				totalLap++;
			}
		}
		System.out.println(Thread.currentThread().getName() + " has stopped running...");
		System.out.println(Thread.currentThread().getName() + " has completed " + totalLap + " laps.");
	}
}

public class SyncDemo {
	public static void main(String args[]) throws Exception {
		LapCount lp = new LapCount(5000);
		Thread t1 = new Thread(new Runner(lp),"Runner 1");
		Thread t2 = new Thread(new Runner(lp),"Runner 2");
		t1.join();
		t1.start();
		t2.join(500);
		t2.start();
	}
}
