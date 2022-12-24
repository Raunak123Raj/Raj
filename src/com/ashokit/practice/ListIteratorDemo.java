package com.ashokit.practice;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.add("raju");
		ll.add("rani");
		ll.add("sonu");
		ll.add("monu");
		System.out.println(ll);

		ListIterator ltr = ll.listIterator();
		while (ltr.hasNext()) {
			String s = (String) ltr.next();
			if (s.equals("sonu"))
				ltr.remove();
			else if (s.equals("monu"))
				ltr.add("raj");
			else if (s.equals("rani"))
				ltr.set("avi");
		}
		System.out.println(ll);
	}

}
