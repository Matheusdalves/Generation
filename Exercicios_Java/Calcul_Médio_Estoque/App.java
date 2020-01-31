package com.generation.quartoPrograma;

import java.util.Scanner;

public class App{
	
	public static void main( String[] args ) {
		Scanner in = new Scanner(System.in);
	
		//Qtd minima e maxima do estoque
		System.out.println("Digite a quantidade minima:");
		int qtdMinima = in.nextInt();
		
		System.out.println("Digite a quantidade maxima:");
		int qtdMaxima = in.nextInt();
		
		//Calculo Estoque Médio
		System.out.println("Estoque Médio é = " + (qtdMinima + qtdMaxima)/2);
		int qtdMedia = in.nextInt();				
	}
}