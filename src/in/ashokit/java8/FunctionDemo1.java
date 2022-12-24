package in.ashokit.java8;

import java.util.function.BiFunction;

public class FunctionDemo1 {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> bif = (a, b) -> a + b;

		Integer sum = bif.apply(10, 20);
		System.out.println(sum);
	}
}
