package com.generation.converssaoMoeda;

import java.util.Scanner;

public class App{
	
	public static void main( String[] args) {
		
		Scanner in = new Scanner(System.in);
		
	//Cotação da moeda desejada
	System.out.println("Digite a cotação da moeda desejada");
	float cotacao = in.nextFloat();
	
	//quantidade na moeda desejada
	System.out.println("Digite o valor na moeda desejada");
	int valorMoeda = in.nextInt();
	
	//valor em real
	System.out.println("O valor em reais é:" + cotacao * valorMoeda);
	}
}
