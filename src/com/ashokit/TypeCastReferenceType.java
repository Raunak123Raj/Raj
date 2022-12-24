package com.ashokit;

public class TypeCastReferenceType implements Cloneable{

	public static void main(String[] args) throws Exception {

		TypeCastReferenceType t = new TypeCastReferenceType();

		Object obj = t; //widening / up-casting

		Object object = t.clone(); 

		TypeCastReferenceType t1 = (TypeCastReferenceType) object; //narrowing
	}
}
