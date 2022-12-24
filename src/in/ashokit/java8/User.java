package in.ashokit.java8;

import java.util.Optional;

public class User {

	// without Optional Object
	public String getUsernameById(Integer id) {

		if (id == 100) {
			return "Raju";
		} else if (id == 101) {
			return "Rani";
		} else if (id == 102) {
			return "Jojn";
		} else {
			return null;
		}
	}

	// with Optional Object
	public Optional<String> getUserName(Integer id) {

		String name = null;
		if (id == 100) {
			name = "Raunak";
		} else if (id == 101) {
			name = "Riya";
		} else if (id == 102) {
			name = "John";
		}
		return Optional.ofNullable(name);
	}

}
