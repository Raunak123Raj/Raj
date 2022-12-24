package com.ashokit.practice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		int n, count = 0;

		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		if (count == 2)
			System.out.println(n + " is prime number");
		else
			System.out.println(n + " is not prime number");

	}
}
