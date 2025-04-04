package com.aula.cefet;



public class Luta {
	
	Personagem player1;
	Personagem player2;
	Cenario local;
	
	
	public void printarLuta() {
		if(player1.strike > player2.strike) {
			System.out.printf(player1.nome + "\n" + "ganhou a batalha");
		}
		else if (player2.strike > player1.strike) {
			System.out.printf(player2.nome + "\n" + "ganhou a batalha");
		}
		else {
			System.out.printf("houve um empate");
		}
		
	}	
}