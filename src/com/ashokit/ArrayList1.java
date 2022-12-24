package com.ashokit;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<Person> al= new ArrayList<>();

		al.add(new Person(1, "Raju"));
		al.add(new Person(2, "John"));
		al.add(new Person(3, "Smith"));
		al.add(new Person(4, "Rani"));

		ListIterator<Person> li = al.listIterator();

		while (li.hasNext()) {
			System.out.println(li.next());
		}

		System.out.println("===========================");

		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}
}
