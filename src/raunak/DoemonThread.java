package raunak;

public class DoemonThread implements Runnable {

	public void run() {

		if (Thread.currentThread().isDaemon())
			System.out.println("Daemon Thread Executed...");
		else
			System.out.println("Vormal Thread Executed...");

	}

	public static void main(String[] args) {
		DoemonThread d = new DoemonThread();
		Thread t1 = new Thread(d);
		t1.setDaemon(true);
		t1.start();
	}
}
