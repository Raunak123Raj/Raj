package com.ashokit;

class C extends Thread {
	public void run() {

		String n = Thread.currentThread().getName();
		for (int i = 1; i <= 3; i++) {
			System.out.println(n);
		}
	}
}

public class MultiThread3 {

	public static void main(String[] args) {

		C t1 = new C();
		Thread t=new Thread(t1);

		t.setName("thread 1");
		t.setName("thread 2");
		t.setName("thread 3");

		t.start();
		t.start();
		t.start();

		String n = Thread.currentThread().getName();
		for (int i = 1; i <= 3; i++) {
			System.out.println(n);
		}
	}
}
