package com.prova.array;

public class ArrayItem implements ArrayItemInterface{
	private String val;
	
	public ArrayItem(String val) {
		this.val = val;
	}
	
	public String getVal(){
		return val;
	}
}
