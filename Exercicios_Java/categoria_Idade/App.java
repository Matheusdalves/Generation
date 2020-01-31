package com.generation.categoriaIdade;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
	
	
		Scanner in = new Scanner(System.in);
		int idade;
				
		System.out.println("Digite sua Idade:");
		idade = in.nextInt();
			
		if (idade >= 5 && idade <= 7) {
			System.out.println("Infatil A");
		}
		else if (idade >= 8 && idade <= 11) {
			System.out.println("Infatil B");
		}
		else if (idade >= 12 && idade <= 13) {
			System.out.println("Juvenil A");
		}
		else if (idade >= 14 && idade <= 17) {
			System.out.println("Juvenil B");
		}
		else System.out.println("Adulto");
	
	}
}