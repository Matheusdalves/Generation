package com.generation.sextoPrograma;

import java.util.Scanner;

//Programa de pagamento de comissão de vendedores de peças
public class App {

	// Diferença de Idade
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		// 1)Indetificação do Vendedor
		System.out.println("Digite a identificacao do vendedor: ");
		String vendedor = in.next();

		// 2)ID Peca
		System.out.println("Digite o ID da peça: ");
		int idPeca = in.nextInt();

		// 3)Preco unitario da peca
		System.out.println("Digite o preco unitario da peça: ");
		double valorPeca = in.nextDouble();

		// 4)quantidade de pecas vendidas
		System.out.println("Digite a quantidade de peças vendidas: ");
		int qtdPeca = in.nextInt();
		

		// 5)Calculo Comissão
		
		double comissao = (valorPeca * 0.05) * qtdPeca;
		
		// 5)Valor da comissao
		System.out.println("O valor da comissão do vendedor " + vendedor + " é de: " + "R$" + comissao );

	}
}