package raunak;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\my folder\\workspace\\core\\src\\raunak\\ashokit.txt");
		boolean fstatus = f.createNewFile();
		System.out.println(fstatus);

		File f1 = new File("C:\\my folder\\workspace\\core\\src\\raunak\\java.txt");
		f1.createNewFile();

		File f2 = new File("C:\\my folder\\workspace\\core\\src\\raunak\\mywork");
		f2.mkdir();

		File f3 = new File("C:\\my folder\\workspace\\core\\src\\raunak\\data");
		f3.mkdir();

		File f4 = new File(f3, "test.txt");
		f4.createNewFile();
	}
}
