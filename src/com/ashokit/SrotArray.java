package com.ashokit;

import java.util.Arrays;

public class SrotArray {

	public static void main(String[] args) {

		int arr[] = { 4, 6, 7, 3, 9, 12, 8 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
