package com.prova.array;

public class MyArray<T extends ArrayItemInterface> {
	private int top;
	private T[] pila;

	public MyArray(T[] pila) {
		top = -1;
		this.pila = pila;
	}

	public void push(T ai){
		try{
			if(top < pila.length){
				pila[++top] = ai;
				System.out.println("Sto inserendo \"" + ai.getVal() + "\" in posizione " + top);
			}
		}catch(Exception e){
			System.out.println("\r\nStack pieno, rimuovi almeno un elemento prima di inserirne un altro");
			top--;
		}
	}

	public void pop(){
		if(top > -1){
			System.out.println("Ho rimosso \"" + pila[top].getVal() + "\" dalla posizione " + top);
			pila[top--] = null;
		}else{
			System.out.println("\r\nStack vuoto, impossibile rimuovere altri elementi");
		}
	}
}
