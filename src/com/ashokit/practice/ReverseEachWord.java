package com.ashokit.practice;

import java.util.Arrays;

public class ReverseEachWord {

	public static void main(String[] args) {

		String s = "Hello My Friend";

		String[] arr = s.split(" ");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			String x = arr[i];
			StringBuffer sb = new StringBuffer(x);
			sb.reverse();
			System.out.print(sb + " ");
		}
	}

}
