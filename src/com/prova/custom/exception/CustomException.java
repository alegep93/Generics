package com.prova.custom.exception;

public class CustomException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public CustomException(){
		super("Sbranzo!");
	}
	
	public CustomException(String msg){
		super(msg);
	}
}
