package com.ashokit.practice;

import java.io.FileInputStream;
import java.util.Properties;

public class DatabaseApp {
	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("databse.properties");

		Properties p = new Properties();
		p.load(fis);// load all the properties

		System.out.println(p);

		String uname = p.getProperty("uname");
		String pwd = p.getProperty("pwd");
		String driver = p.getProperty("driver");

		System.out.println("Username : " + uname);
		System.out.println("Password : " + pwd);
		System.out.println("Driver : "+driver);
		
		fis.close();
	}
}
