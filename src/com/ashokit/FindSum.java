package com.ashokit;

import java.util.Arrays;
import java.util.List;

public class FindSum {

	public static void main(String[] args) {

		String s = "abc123";
		
		char[] ar = s.toCharArray();
		
		Integer sum = 0;
		for (int i = 3; i < ar.length; i++) {
			
		
			 sum=sum+Character.getNumericValue(ar[i]);
		}
		System.out.println(sum);
	}
}
