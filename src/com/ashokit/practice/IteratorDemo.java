package com.ashokit.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList il = new ArrayList();
		for (int i = 0; i < 10; i++)
			il.add(i);
		System.out.println(il);

		Iterator itr = il.iterator();
		while (itr.hasNext()) {
			Integer n = (Integer) itr.next();
			if (n % 2 == 0)
				System.out.println(n);
		}
		System.out.println(il);
	}
}
