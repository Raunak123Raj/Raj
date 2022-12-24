package com.ashokit.practice;

import java.util.Scanner;

public class SumOfEven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of an array :");
		size = s.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the elements for array");
		for (int i = 0; i < a.length; i++)
			a[i] = s.nextInt();
		int sum = 0;
		for (int b : a) {
			if (b % 2 == 0)
				sum += b;
		}
		System.out.println("Sum of Even positions : "+sum);
	}
}
