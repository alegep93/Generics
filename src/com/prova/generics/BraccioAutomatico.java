package com.prova.generics;

public class BraccioAutomatico {
	public void prendiBottiglia(Bottiglia<?> b){
		System.out.println("Ho preso" + b.getContenuto());
	}
}
