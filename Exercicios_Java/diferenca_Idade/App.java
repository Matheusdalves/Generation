package com.generation.diferencaIdade;

//a sua idade
//a idade da sua mãe
//minha mãe é <anos> mais velha do que eu

import	 java.util.Scanner;

public class App {
	
	//Diferença de Idade
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
	//1)Idade do Usuario
		System.out.println("Digite sua idade: ");
		int idadeUsu = in.nextInt();
		
	// 2) Idade Mãe Usuario
    System.out.println("Informe a idade da sua mãe: ");
    int idadeMae = in.nextInt();   

// 3) Subtrai a idade da mãe e do Usuario
    int diff = idadeMae - idadeUsu;

// 4) Imprimir diferença de Idade
    System.out.printf("A diferença de idade é de: " + diff);
	}
}