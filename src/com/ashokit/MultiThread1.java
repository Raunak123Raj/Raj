package com.ashokit;

class A extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("raunak");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

public class MultiThread1 {

	public static void main(String[] args) throws InterruptedException {

		A t = new A();
		t.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println("raj");
			Thread.sleep(1000);
		}
	}

}
