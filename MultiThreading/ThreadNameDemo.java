class Runner extends Thread {
	public void run() {
		System.out.println("This thread is called " + this.currentThread().getName() + " and it's ID is " + this.currentThread().getId());
	}
}


public class ThreadNameDemo {
	public static void main(String args[]){
		Runner run1 = new Runner();
		Runner run2 = new Runner();
		Runner run3 = new Runner();
		run1.setName("Th1");
		run2.setName("Th2");
		run3.setName("Th3");
		run1.start();
		run2.start();
		run3.start();
	}
}
		
