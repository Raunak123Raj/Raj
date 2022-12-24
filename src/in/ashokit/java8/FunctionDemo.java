package in.ashokit.java8;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String, Integer> f = name -> name.length();

		System.out.println(f.apply("ashokit"));
		System.out.println(f.apply("hyd"));
		System.out.println(f.apply("sachin"));
	}
}
