package com.ashokit;

import java.util.Arrays;

public class FindDuplicate {
	public static void main(String[] args) {

		int arr[] = { 4, 7, 6, 4, 3, 2, 6, 8 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[i]);
			}
		}
	}
}
