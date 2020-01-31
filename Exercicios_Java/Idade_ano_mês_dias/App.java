package com.generation.setimoPrograma;

import java.util.Scanner;

//idade de uma pessoa expressa em anos, meses e dias

public class App {

	// Diferença de Idade
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.println("---------------------");
		System.out.println("Idade em dias");
		System.out.println("---------------------");
	// 1)Anos
		System.out.println("Digite os Anos: ");
		int anos = in.nextInt();
		
	// 2)Meses
		System.out.println("Digite os meses: ");
		int meses = in.nextInt();		
		
	// 3)Dias
		System.out.println("Digite os dias: ");
		int dias = in.nextInt();	
		
	//4) Calculo dos dias		
		int totalDias = (anos * 365)+(meses * 30) + dias;
		
	//5) Idade total em Dias
		System.out.println("Sua idade em dias é=" + totalDias);
		
	}
}
