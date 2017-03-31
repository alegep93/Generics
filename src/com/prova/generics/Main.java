package com.prova.generics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.prova.array.MyArray;
import com.prova.array.Persona;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";	
		int counter = 0;
		Persona[] pList = new Persona[2];
		MyArray<Persona> myA = new MyArray<>(pList);

		printMsg();

		while(!("q".equals(input = scan.nextLine()))){
			switch(input){
				case "n":
					if (counter<pList.length)
						InserisciPersona(pList, myA, scan);
					else
						System.out.println("Lista già piena");
					printMsg();
					counter++;
					break;
				case "r":
					myA.pop();
					printMsg();
					counter--;
					break;
				case "v":
					if(counter != 0){
						for(int i=0; i<counter; i++){
							pList[i].printPersona();
							System.out.format("%-16s %s \r\n", "Posizione: ", i);
						}
					}else{
						System.out.println("------------------------------------------------");
						System.out.println("  Non sono ancora state inserite delle persone");
					}
					printMsg();
					break;
				default:
					System.err.println("Comando inserito non valido, scegli un comando tra quelli disponibili!");
					printMsg();
					break;
			}
		}
		System.out.println("Esecuzione Terminata!");
		scan.close();
	}	

	public static void printMsg(){		
		System.out.println("------------------------------------------------");
		System.out.println("Scegli un'azione tra le seguenti: ");
		System.out.println("  n => Inserisci una nuova persona");
		System.out.println("  r => Rimuovi una persona");
		System.out.println("  v => Visualizza la lista delle persone inserite");
		System.out.println("  q => Termina il programma");
	}

	public static void InserisciPersona(Persona[] pList, MyArray<Persona> myA, Scanner scan){
		String nome = "", cognome = "", cf = "";

		System.out.println("Inserisci il nome della persona da inserire:");
		nome = scan.nextLine();

		System.out.println("Inserisci il cognome della persona da inserire:");
		cognome = scan.nextLine();

		System.out.println("Inserisci il Codice Fiscale della persona da inserire:");
		cf = scan.nextLine();

		while(!controllaCF(cf)){
			System.out.println("Codice Fiscale non corretto, ritenta:");
			cf = scan.nextLine();
		}

		myA.push(new Persona(nome, cognome, cf));        
	}

	public static boolean controllaCF(String cf){
		Pattern cfRegExp = Pattern.compile("[A-Za-z]{6}[0-9]{2}[A-Za-z]{1}[0-9]{2}[A-Za-z0-9]{4}[A-Za-z]{1}");
		Matcher match = cfRegExp.matcher(cf);

		if(match.matches())
			return true;
		else
			return false;
	}
}
