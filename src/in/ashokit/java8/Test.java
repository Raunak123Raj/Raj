package in.ashokit.java8;

@FunctionalInterface
interface Calculator {
	public void add(int i, int j);
}

public class Test {
	public static void main(String[] args) {
		Calculator c = (i, j) -> System.out.println("sum :: " + (i + j));
		c.add(10, 20);
		c.add(30, 50);
	}
}
