package com.ashokit;

import java.lang.reflect.Field;

public class Access_Private_Var {

	public static void main(String[] args) throws Exception {

		Class clz = Class.forName("com.ashokit.Student");

		Object obj = clz.newInstance();

		Field field = clz.getDeclaredField("age");

		field.setAccessible(true);

		field.set(obj, 35);

		Student s = (Student) obj;
		s.getAge();

	}
}
