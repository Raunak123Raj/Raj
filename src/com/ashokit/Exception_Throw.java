package com.ashokit;

public class Exception_Throw {

	public String getName(int id)throws Exception  {
		if(id==100) {
			return "raju";
		}else if(id==101) {
			return "rani";
		}else {
			throw new Exception("Invalid Id");
		}
	}
	public static void main(String[] args)throws Exception {
		
		Exception_Throw et=new Exception_Throw();
		String name = et.getName(101);
		System.out.println(name);
		
		String name2 = et.getName(200);
		System.out.println(name2);
	}
}
