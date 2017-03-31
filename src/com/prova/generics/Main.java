package com.prova.generics;

import com.prova.array.ArrayItem;
import com.prova.array.MyArray;
import com.prova.contenuto.Acqua;
import com.prova.contenuto.Vino;

public class Main {
	public static void main(String[] args) {
		Bottiglia<Acqua> bAcqua = new Bottiglia<Acqua>(new Acqua());
		Bottiglia<Vino> bVino = new Bottiglia<Vino>(new Vino());
		
		BraccioAutomatico braccio = new BraccioAutomatico();
        //braccio.prendiBottiglia(bAcqua);
        //braccio.prendiBottiglia(bVino);
		
        System.out.println("-----------------------------------------");
        
        ArrayItem[] items = new ArrayItem[5];
        MyArray<ArrayItem> myA = new MyArray<>(items);
        
        for (int i = 0; i < items.length; i++) {
        	myA.push(new ArrayItem("Elemento " + i));
		}
        myA.push(new ArrayItem("Elemento di troppo"));
        System.out.println("-----------------------------------------");
        
        for (int i = 0; i < items.length; i++) {
        	myA.pop();
		}
        myA.pop();
        System.out.println("-----------------------------------------");
	}
}
