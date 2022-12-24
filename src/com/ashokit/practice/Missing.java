package com.ashokit.practice;

public class Missing {
	public static void main(String[] args) {
		boolean status = true;
		int a[] = { 22, 17, 4, 66, 8, 2, 87 };
		for (int i = 1; i <= 100; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					status = false;
					break;
				}
			}
			if (status == true) {
				System.out.println(i);
			}
			status = true;
		}
	}
}
