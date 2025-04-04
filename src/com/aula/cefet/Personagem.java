package com.aula.cefet;

public class Personagem {
	String nome;
	int strike;
	String specialMove;
	
	
	public Personagem(String nome, int strike, String specialMove) {
		super();
		this.nome = nome;
		this.strike = strike;
		this.specialMove = specialMove;
	}
	
	public Personagem() {
		
	}


	public void printar() {
		System.out.printf(nome + "\n" + strike +"\n" + specialMove + "\n");
		
		
	}
	
	
}
