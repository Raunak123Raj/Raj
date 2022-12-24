package com.ashokit;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {

		int ar[] = { 15, 8, 9, 2, 11, 4, 7 };

		for (int i = 0; i < ar.length / 2; i++) {
			int temp = ar[i];
			ar[i] = ar[ar.length - 1 - i];
			ar[ar.length - 1 - i] = temp;
		}
		System.out.println(Arrays.toString(ar));
	}
}
