package raunak;

import java.util.Scanner;

public class MaxMinElement {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = s.nextInt();
		System.out.println("Enter the data : ");
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++)
			a[i] = s.nextInt();
		int max = a[0];
		int min = a[0];
		for (int j = 0; j < a.length; j++) {
			if (a[j] > max)
				max = a[j];
			if (a[j] < min)
				min = a[j];
		}
		System.out.println("Max = : " + max + "\nMin = : " + min);

	}
}
