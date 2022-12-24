package in.ashokit.java8;

import java.util.function.Supplier;

public class Text {

	public static void main(String[] args) {

		// Doctor d = new Doctor();

		Supplier<Doctor> s = Doctor::new;
		Doctor d = s.get();
		System.out.println(d.hashCode());
	}
}

class Doctor {
	public Doctor() {
		System.out.println("Doctor constructor....");
	}
}