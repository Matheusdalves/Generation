package com.generation.armazenarDados;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int primeiroNumero;	
	
	
	System.out.println("Digite um numero:");
	primeiroNumero = in.nextInt();
	
	if (primeiroNumero  >= 0) {
		System.out.println("--------------------");
	System.out.println("A \n" + primeiroNumero +"\n--------------------"   + "\nB");
	}
	else if (primeiroNumero <= 0) {
		System.out.println("--------------------");
	System.out.println("A \n" +"--------------------"+ "\nB \n"  + primeiroNumero);
	}
	
	}
}