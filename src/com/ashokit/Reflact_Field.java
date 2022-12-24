package com.ashokit;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflact_Field {

	public static void main(String[] args) throws Exception {

		Class clz = Class.forName("com.ashokit.Student");

		Field[] fields = clz.getDeclaredFields();
		for (Field f : fields)
			System.out.println(f.getName());

		Method[] methods = clz.getDeclaredMethods();
		for (Method m : methods)
			System.out.println(m.getName());

		Constructor[] constructors = clz.getDeclaredConstructors();
		for (Constructor c : constructors)
			System.out.println(c.getName());
	}
}
