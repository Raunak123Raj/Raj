package com.ashokit.practice;

import java.util.Scanner;

public class RevArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of an array:");
		size = s.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the elements for array");
		for (int i = 0; i < a.length; i++)
			a[i] = s.nextInt();
		for (int i = a.length - 1; i >= 0; i--)
			System.out.println("a[" + i + "]=" + a[i]);
	}

}
