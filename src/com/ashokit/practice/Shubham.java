package com.ashokit.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Shubham {
	public static void main(String[] args) {

		ArrayList<String> colorsList = new ArrayList<String>(
				Arrays.asList("Red", "Green", "Blue", "Cyan", "Magenta", "Yellow"));
		System.out.println("The ArrayList:" + colorsList);

		Set<String> tSet = new TreeSet<String>(colorsList);

		System.out.println("\nTreeSet obtained from ArrayList: " + tSet);
	}
}
