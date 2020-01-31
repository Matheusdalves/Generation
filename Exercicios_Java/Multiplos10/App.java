package com.generation.Multiplos10;

import java.util.Scanner;

public class App {
	/** * @param args */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int i;
		for (i = 0; i <= 100; ++i) {
			System.out.println(i % 10 == 0 ? i + " - Multiplo de 10" : i);
		}
	}
}
