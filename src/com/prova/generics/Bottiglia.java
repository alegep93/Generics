package com.prova.generics;

public class Bottiglia<T> {
	private T contenuto;
	
	public Bottiglia(T t){
		this.contenuto = t;
	}
	
	public T getContenuto(){
		return contenuto;
	}
}
