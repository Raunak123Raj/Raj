package com.ashokit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayL {
	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		System.out.println("=====For Loop Approach======");

		// Approach-1
		for (int i = 0; i < al.size(); i++)
			System.out.println(al.get(i));

		System.out.println("=====For-Each Loop Approach======");

		// Approach-2
		for (Object obj : al)
			System.out.println(obj);

		System.out.println("=====Iterator Approach======");

		// Approach-3
		Iterator iterator = al.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("=====ListIterator Approach======");

		// Approach-4
		ListIterator listIterator = al.listIterator();
		while (listIterator.hasNext())
			System.out.println(listIterator.next());

		System.out.println("=====forEach () Approach======");

		// Approach-5
		al.forEach(i -> {
			System.out.println(i);
		});

	}
}
