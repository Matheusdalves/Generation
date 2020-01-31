package com.generation.imprimirDecrescente;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int primeiroNumero, segundoNumero, terceiroNumero;

		System.out.println("Digite um numero:");
		primeiroNumero = in.nextInt();

		System.out.println("Digite um numero:");
		segundoNumero = in.nextInt();

		System.out.println("Digite um numero:");
		terceiroNumero = in.nextInt();

		if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero && segundoNumero > terceiroNumero) {
			System.out.println("1º:" + primeiroNumero + "\n" + "2º:" + segundoNumero + "\n" + "3º:" + terceiroNumero);
		}
		if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero && terceiroNumero > primeiroNumero) {
			System.out.println("1º:" + segundoNumero + "\n" + "2º:" + terceiroNumero + "\n" + "3º:" + primeiroNumero);
		}
		if (terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero && segundoNumero > primeiroNumero) {
			System.out.println("1º:" + terceiroNumero + "\n" + "2º:" + segundoNumero + "\n" + "3º:" + primeiroNumero);
		}
	}
}
