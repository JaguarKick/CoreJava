class Table {
	public synchronized void printTable(int n) {
		for(int i=1;i<=10;i++) {
			System.out.println(n + " * " + i + " = " + (n*i));
		}
	}
}

class Runner implements Runnable {
	private Table t = null;
	private int num = 0;

	Runner(Table t,int num) {
		this.t = t;
		this.num = num;
	}
	public void run() {
		t.printTable(num);
	}
}

public class SyncDemo2 {
	public static void main(String args[]) {
		Table tab = new Table();
		Thread th1 = new Thread(new Runner(tab,2));
		Thread th2 = new Thread(new Runner(tab,4));
		Thread th3 = new Thread(new Runner(tab,6));
		th1.start();
		th2.start();
		th3.start();
	}
}
