package raunak;

import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("data.txt");

		fw.write("Hi, good evening");
		fw.write("\n");
		fw.write("How are you");

		fw.flush();
		fw.close();
	}
}
