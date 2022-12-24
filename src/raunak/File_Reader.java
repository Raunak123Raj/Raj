package raunak;

import java.io.FileReader;
import java.io.IOException;

public class File_Reader {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("data.txt");
		int i = fr.read();

		while (i != -1) {
			System.out.print((char) i);
			i = fr.read();
		}
	}
}
