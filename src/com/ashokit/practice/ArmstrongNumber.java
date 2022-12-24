package com.ashokit.practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num, temp, sum, i = 1, n = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		num = s.nextInt();
		sum = 0;
		i = num;
		while (num > 0) {
			n = num % 10;
			num = num / 10;
			sum = sum + (n * n * n);
		}
		if (sum == i)
			System.out.println(i + " is an ARMSTRONG Number");
		else
			System.out.println(i + " is not an ARMSTRONG Number");

	}
}
