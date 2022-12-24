package com.ashokit;

public class UserDefinedException {

	private String getName(int id) {
		if(id==100)
			return "Raju";
		else if(id==101)
			return "Rani";
		else
			throw new NoDataFoundException("Invalid Id");
	}
	public static void main(String[] args) {
		UserDefinedException ude=new UserDefinedException();
		ude.getName(200);
	}
}
