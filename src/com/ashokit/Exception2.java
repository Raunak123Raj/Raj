package com.ashokit;

public class Exception2 {

	public static void main(String[] args) {
		 
		System.out.println("main() method start...");
		try {
			String s="hi";
			int i = s.length();
		} catch (ArithmeticException e) {
			System.out.println("in catch block");
			e.printStackTrace();
		}catch (NullPointerException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main () method ended...");
	}
}
