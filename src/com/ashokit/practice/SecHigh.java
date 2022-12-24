package com.ashokit.practice;

public class SecHigh {
	public static void main(String[] args) {
		int ar[] = { 22, 5, 6, 88, 9 };
		int max = ar[0], secMax = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] > max) {
				secMax = max;
				max = ar[i];
			} else if (ar[i] > secMax)
				secMax = ar[i];
		}
		System.out.println("maximum value : " + max);
		System.out.println("second maximum value : " + secMax);
	}
}
