programa
{
	
	funcao inicio()
	{
		real salario, percReajuste, novoValor

		escreva("Informar o Salario")
		leia(salario)

		percReajuste = 0.0
		
		se(salario >= 0 e salario <= 400)
			percReajuste = 0.15
		se(salario >= 400.01 e salario <= 800)
			percReajuste = 0.12
		se(salario >= 800.01 e salario <= 1200)
			percReajuste = 0.10
		se(salario >= 1200.01 e salario <= 2000)
			percReajuste = 0.07
		se(salario >= 2000.01)
			percReajuste = 0.04

		novoValor = salario * percReajuste

		escreva("Novo salario: ", salario + novoValor)
		escreva("\nReajuste ganho: ", novoValor)
		escreva("\nEm percentual: ", percReajuste * 100, "%") 
		
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 473; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */