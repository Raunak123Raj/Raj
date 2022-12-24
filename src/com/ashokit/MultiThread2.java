package com.ashokit;

class B implements Runnable {
	
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("My child Thread");
		}
	}
}
public class MultiThread2 {
	
	public static void main(String[] args) {
		B y=new B();
		
		Thread t=new Thread(y);
		t.start();
		
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread");
		}
		
	}
	
}

