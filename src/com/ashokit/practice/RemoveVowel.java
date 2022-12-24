package com.ashokit.practice;

public class RemoveVowel {

	public static void main(String[] args) {

		String s = "hello, i love my india";

		s = s.replaceAll("[aeiouAEIOU]", "");

		System.out.println(s);
	}
}
