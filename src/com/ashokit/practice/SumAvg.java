package com.ashokit.practice;

import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of an arrray");
		size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter element of arrray");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		/*
		 * for (int j = 0; j < a.length; j++) { sum = sum + a[j]; }
		 */
		for (int b : a) {
			sum += b;
		}
		System.out.println("sum :" + sum);
		float average = (float) sum / a.length;
		System.out.println("Average :" + average);
	}
}
