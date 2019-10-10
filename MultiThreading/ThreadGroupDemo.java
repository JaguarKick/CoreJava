class Runner implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName() + " has started.");
		for(int i=0;i<100;i++) {
			//try{
			//	Thread.sleep(100);
			//}catch(Exception e){}
			//System.out.println(Thread.currentThread().getName() + " is active.");
		}
		System.out.println(Thread.currentThread().getName() + " has ended.");
	}
}

public class ThreadGroupDemo {
	public static void main(String arg[]) {
		ThreadGroup tg = new ThreadGroup("MyGroup");
		Thread th1 = new Thread(tg,new Runner(),"MemberA");
		Thread th2 = new Thread(tg,new Runner(),"MemberB");
		Thread th3 = new Thread(tg,new Runner(),"MemberC");
		th1.start();
		th2.start();
		th3.start();
		tg.list();
	}
}
