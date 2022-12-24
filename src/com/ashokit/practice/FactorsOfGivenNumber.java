package com.ashokit.practice;

import java.util.Scanner;

public class FactorsOfGivenNumber {

	public static void main(String[] args) {

		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		num = s.nextInt();
		int i, count = 0;
		System.out.println("thr factors of " + num + " are : ");

		for (i = 1; i <= num; i++) {
			if (num % i == 0) {
				count = count + 1;
				System.out.println(i + " ");
			}
		}
		System.out.println("Total factors of " + num + " : ");
		for (i = 1; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				if (num / i == i)
					System.out.println(" " + i + " ");
				else
					System.out.println(i + " " + num / i + " ");
			}
		}
	}
}
