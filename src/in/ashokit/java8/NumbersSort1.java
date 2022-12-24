package in.ashokit.java8;

import java.util.ArrayList;
import java.util.Collections;

public class NumbersSort1 {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(2);

		System.out.println("Before sort :: " + al);

		Collections.sort(al, (i, j) -> (i > j) ? -1 : 1);

		System.out.println("After sort :: " + al);
	}
}
