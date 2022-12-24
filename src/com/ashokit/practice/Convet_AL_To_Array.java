package com.ashokit.practice;

import java.util.ArrayList;
import java.util.List;

public class Convet_AL_To_Array {
	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<Integer>(20);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		Object[] a = al.toArray();
		Object temp;
		for(int i=0;i<a.length/2; i++) {
			 temp=a[i];
			 a[i]=a[a.length-1-i];
			 a[a.length-1-i]=temp;
		}

		for (Object ar : a)
			System.out.println(ar);

	}
	
	
	
	
}
