package com.ashokit;

public class NoDataFoundException extends RuntimeException{

	public NoDataFoundException() {

	}
	public NoDataFoundException(String msg) {
			super(msg);
	}
}
