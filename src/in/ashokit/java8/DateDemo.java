package in.ashokit.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		System.out.println(d);

		// Converting Date to String
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		String format1 = sdf1.format(d);
		System.out.println(format1);

		SimpleDateFormat sdf2 = new SimpleDateFormat("MMM/dd/yyyy");
		String format2 = sdf2.format(d);
		System.out.println(format2);

		// Converting String to Date
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
		Date parseDate = sdf3.parse("2022-12-20");
		System.out.println(parseDate);
	}
}
