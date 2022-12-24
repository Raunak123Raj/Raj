package com.ashokit.practice;

public class CharOcc {

	public static void main(String[] args) {

		String s = "java";
		char ch = 'a';

		char[] arr = s.toCharArray();

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch)
				count++;
		}
		System.out.println(count);
	}
}
