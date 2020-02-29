package main.com.thread.lock;

public class WaitNotifyTest {

	public static void main(String[] args) {
		Message msg = new Message("process it");
		
		Waiter waiter = new Waiter(msg);
		new Thread(waiter, "waiter").start();
		System.out.println("1");
		
		Waiter waiter1 = new Waiter(msg);
		new Thread(waiter1, "waiter1").start();
		System.out.println("2");
		
		Notifier notifier = new Notifier(msg);
//		new Thread(notifier, "notifier").start();
		System.out.println("All the threads are started");
	}

}
