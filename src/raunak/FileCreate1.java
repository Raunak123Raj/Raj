package raunak;

import java.io.File;

public class FileCreate1 {
	public static void main(String[] args) {
		File f = new File("C:\\my folder\\workspace\\core\\src\\raunak");
		String[] arr = f.list();

		for (String name : arr) {
			System.out.println(name);
		}
	}
}
