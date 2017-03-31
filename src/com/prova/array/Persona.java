package com.prova.array;

public class Persona implements ArrayItemInterface{
	protected String nome,cognome,cf;
	
	public Persona(){
		nome = cognome = cf = "";
	}
	
	public Persona(String nome, String cognome, String cf){
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}
	
	public void printPersona(){
		System.out.println("-----------------------");
		System.out.format("%-16s %s \r\n", "Nome:", this.nome);
		System.out.format("%-16s %s \r\n", "Cognome:", this.cognome);
		System.out.format("%-16s %s \r\n", "Cofice fiscale:", this.cf);
	}
	
	public String toString(){
		String s = "";
		return s;
	}

	@Override
	public String getVal() {
		System.out.println("-----------------------");
		System.out.format("%-16s %s \r\n", "Nome:", this.nome);
		System.out.format("%-16s %s \r\n", "Cognome:", this.cognome);
		System.out.format("%-16s %s \r\n", "Cofice fiscale:", this.cf);
		return this.nome + " " + this.cognome;
	}
}
