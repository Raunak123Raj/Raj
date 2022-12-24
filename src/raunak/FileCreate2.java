package raunak;

import java.io.File;

public class FileCreate2 {
	public static void main(String[] args) {
		File f = new File("C:\\my folder\\workspace\\core\\src\\raunak");
		String[] arr = f.list();

		for (String name : arr) {

			File f1 = new File(f, name);

			if (f1.isFile())
				System.out.println("File :: " + name);
			if (f1.isDirectory())
				System.out.println("Directory :: " + name);
		}
	}
}
