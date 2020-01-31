package com.generation.positivoNegativo;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int primeiroNumero;
	
	
	
	
	System.out.println("Digite um numero:");
	primeiroNumero = in.nextInt();
	
	if (primeiroNumero  >= 0) {
	System.out.println("O numero "+ primeiroNumero +" é um numero positivo.");
	}
	else if (primeiroNumero <= 0) {
	System.out.println("O numero "+ primeiroNumero +" é um numero negativo.");
	}
	
	}
}