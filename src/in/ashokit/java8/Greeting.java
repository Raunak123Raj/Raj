package in.ashokit.java8;

@FunctionalInterface
interface Wish {
	void wishmsg();
}

public class Greeting {
	public static void main(String[] args) {
		Wish w = () -> System.out.println("Hello");
		w.wishmsg();
	}
}
