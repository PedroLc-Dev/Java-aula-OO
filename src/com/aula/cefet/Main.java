package com.aula.cefet;

public class Main {
	
	/*
	 *  Criar três variaveis de número inteiro
	 *  três variaveis de texto
	 *  
	 *  printar na tela o texto e o numero no formato  texto: numero
	 */

	public static void main(String[] args) {
		
		//Exercicio 1
		
		String varTexto1;
		String varTexto2;
		String varTexto3;
		
		int varNum1;
		int varNum2;
		int varNum3;
		
		varTexto1 ="Pedro";
		varTexto2 ="Anthoni";
		varTexto3 ="Stela";
		
		varNum1 =2;
		varNum2 =4;
		varNum3 =5;
		
		System.out.println(varTexto1 + ": " + varNum1);
		System.out.println(varTexto2 + ": " + varNum2);
		System.out.println(varTexto3 + ": " + varNum3);
		
		//Exercicio 2
		
		String nomeChar1;
		String nomeChar2;
		String nomeChar3;
		
		int strikeChar1;
		int strikeChar2;
		int strikeChar3;
		
		String specialMoveChar1;
		String specialMoveChar2;
		String specialMoveChar3;
		
		
		nomeChar1 = "Gogeta";
		nomeChar2 = "Vegetto";
		nomeChar3 = "Gohan";
		
		strikeChar1 = 10;
		strikeChar2 = 20;
		strikeChar3 = 30;
		
		specialMoveChar1 = "aoe";
		specialMoveChar2 = "counter";
		specialMoveChar3 = "buff";
		
		System.out.println("--------------------------------------------------");
		System.out.printf(nomeChar3 + "\n" +strikeChar3 +"\n" + specialMoveChar3 + "\n");
		System.out.printf(nomeChar2 + "\n" +strikeChar2 +"\n" + specialMoveChar2 + "\n");
		System.out.printf(nomeChar1 + "\n" +strikeChar1 +"\n" + specialMoveChar1 + "\n");
		System.out.println("--------------------------------------------------");
		
		strikeChar3 = 50;
		
		System.out.printf(nomeChar3 + "\n" +strikeChar3 +"\n" + specialMoveChar3 + "\n");
		
		System.out.println("-------------Exercicio 3----------------------");
		
		
		Personagem gohan = new Personagem();
		gohan.nome = "gohan";
		gohan.specialMove = "buff";
		gohan.strike = 10;
		
		System.out.printf(gohan.nome + "\n" + gohan.strike +"\n" + gohan.specialMove + "\n");
		
		System.out.println("-------------printando com metodo-------------------");
		
		gohan.printar();
		
		Cenario campo = new Cenario();
		campo.nome = "campo";
		campo.descricao = "arvores";
		
		System.out.println("------------Exercicio 4-----------------------");
		
		
		Personagem	goku = new Personagem();
		goku.nome = "goku";
		goku.strike = 20;
		goku.specialMove = "aoe";
		
		Personagem	vegeta = new Personagem();
		vegeta.nome = "vegeta";
		vegeta.strike = 10;
		vegeta.specialMove = "aoe";

		Luta luta1 = new Luta();
		luta1.player1 = goku;
		luta1.player2 = vegeta;
		luta1.local = campo;
		
		luta1.printarLuta();
		
		Personagem trunks = new Personagem("trunks", 10, "buff");
		luta1.player2 = trunks;
		
		luta1.printarLuta();
		
		
		
		
		
	}

}
