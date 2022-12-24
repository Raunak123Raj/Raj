package in.ashokit.java8;

@FunctionalInterface
interface MyInterface1{
	public void m1();
}
public class MethodRef {
	
	public static void m2() {
		System.out.println("This is m2() mrthod");
	}
	
	public static void main(String[] args) {
		MyInterface1 mi=MethodRef::m2;
		mi.m1();
	}
}
