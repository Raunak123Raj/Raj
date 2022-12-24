package in.ashokit.java8;

import java.util.Optional;
import java.util.Scanner;

public class Optional1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter User ID");
		int userId = s.nextInt();

		User u = new User();
		/*
		 * String userName = u.getUsernameById(userId); String msg =
		 * userName.toUpperCase() + ", Hello"; System.out.println(msg);
		 */

		Optional<String> username = u.getUserName(userId);

		if (username.isPresent()) {
			String name = username.get();
			System.out.println(name.toUpperCase());
		} else {
			System.out.println("NO Data Found");
		}

	}
}
