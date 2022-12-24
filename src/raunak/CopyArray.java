package raunak;

import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = s.nextInt();
		System.out.println("Enter the data :");
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++)
			a[i] = s.nextInt();
		//copying
		int b[] = new int[a.length];
		for (int j = 0; j < a.length; j++)
			b[j] = a[j];
		//printing
		for (int c : b)
			System.out.println(c);
	}
}
