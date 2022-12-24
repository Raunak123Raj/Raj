package com.ashokit;

public class NotRepetedElement {
	public static void main(String[] args) {

		int ar[] = { 2, 3, 2, 1, 3, 4, 5 };

		for (int i = 0; i < ar.length; i++) {
			int count = 0;
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] == ar[j])
					count++;
			}
			if (count == 1)
				System.out.println(ar[i] + " ");
		}
	}
}
