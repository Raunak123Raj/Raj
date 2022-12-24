package in.ashokit.java8;

@FunctionalInterface
interface MyInterface {
	public void m2();
}

public class MyApp {
	public static void main(String[] args) {

		MyInterface mi = () -> System.out.println("m2 method called");
		mi.m2();
	}
}
