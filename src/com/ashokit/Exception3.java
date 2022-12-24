package com.ashokit;

public class Exception3 {

	public static void main(String[] args) {
		System.out.println("main( ) method started...");
		try {
			System.out.println("try block - started...");
			int i=10/2;
			System.out.println("try block - end...");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally block...");
			
		}
		System.out.println("main( ) method end...");
		
		
	}
}
