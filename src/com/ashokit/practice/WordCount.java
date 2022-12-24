package com.ashokit.practice;

public class WordCount {

	public static void main(String[] args) {

		String s = "   Hello   Helle         My      Friend";

		String[] arr = s.trim().split("\\s+");

		System.out.println(arr.length);
	}

}
