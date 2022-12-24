package raunak;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		System.out.println("Input No");

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = sc.next();

		int a = Integer.parseInt(s);
		int b = Integer.parseInt(s1);

		System.out.println("sum = : " + (a + b));
	}

}
