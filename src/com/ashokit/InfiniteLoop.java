package com.ashokit;

public class InfiniteLoop {

	void m1() {
		m2();
	}
	void m2() {
		m1();
	}
	public static void main(String[] args) {
		System.out.println("main () method - start");
		InfiniteLoop il=new InfiniteLoop();
		il.m1();
		System.out.println("main () method - end");
	}
}
