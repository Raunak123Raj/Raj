package com.ashokit;

import java.util.Scanner;

public class Subham {

	double dis;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Subham s = new Subham();
		System.out.println("enter the custumer type");
		String custumer_type = sc.nextLine();

		System.out.println("enter the price");
		double price = sc.nextDouble();

		System.out.println("enter the no. of product");
		int number = sc.nextInt();
		price = price * number;
 
		if (custumer_type.equals("premium")) {
			s.dis = price * 0.1;
			price = price - s.dis;// price-=dis;
		}

		System.out.println("coutumer type  :  " + custumer_type);
		System.out.println("discount is    :  " + s.dis);
		System.out.println("final price    :  " + price);
	
	
		boolean b=false;
		
		b=!b&&b==false;   		
		System.out.println(b=!b&&b==false );
		System.out.println(b);
		
	}
	
	
	

}
