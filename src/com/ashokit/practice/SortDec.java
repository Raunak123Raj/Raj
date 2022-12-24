package com.ashokit.practice;

import java.util.Arrays;
import java.util.Scanner;

public class SortDec {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = s.nextInt();
		System.out.println("Enter the data");
		int ar[] = new int[size];
		for (int i = 0; i < ar.length; i++)
			ar[i] = s.nextInt();

		int temp;
		for (int j = 0; j < ar.length; j++)
			for (int k = j + 1; k < ar.length; k++)
				if (ar[j] < ar[k]) {
					temp = ar[j];
					ar[j] = ar[k];
					ar[k] = temp;
				}
		System.out.println(Arrays.toString(ar));
	}

}
