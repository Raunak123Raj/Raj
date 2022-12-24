package com.ashokit.practice;

import java.util.Arrays;

public class ArrayPrint {

	public static void main(String[] args) {
		int arr[] = { 5, 8, 2, 6, 9, 3 };

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		System.out.println();

		for (int n : arr)
			System.out.print(n + " ");

		System.out.println();

		System.out.print(Arrays.toString(arr));
	}
}
