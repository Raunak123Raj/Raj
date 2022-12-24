package com.ashokit.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put("raju", 100);
		hm.put("rani", 200);
		hm.put("sonu", 300);
		hm.put("monu", 400);

		System.out.println(hm);
		System.out.println(hm.put("raj", 500));

		Set s = hm.keySet();
		System.out.println(s);
		Collection c = hm.values();
		System.out.println(c);
		Set s1 = hm.entrySet();
		System.out.println(s1);

		Iterator itr = s1.iterator();
		while (itr.hasNext()) {
			Map.Entry m1 = (Map.Entry) itr.next();
			System.out.println(m1.getKey() + "....." + m1.getValue());
			if (m1.getKey().equals("monu"))
				m1.setValue(10000);
		}
		System.out.println(hm);
	}
}
