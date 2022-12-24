package raunak;

import java.util.Scanner;

public class RevArray {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int size;
		System.out.println("Enter the size of an array");
		size = s.nextInt();
		int ar[] = new int[size];
		for (int i = 0; i < ar.length; i++)
			ar[i] = s.nextInt();

		for (int j = ar.length - 1; j >= 0; j--)
			System.out.println("a["+j+"]="+ar[j]);
	}

}
