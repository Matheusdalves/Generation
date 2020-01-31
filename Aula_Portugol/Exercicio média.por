programa
{
	
	funcao inicio()
	{
		real notaUm, notaDois, notaTres, media

		escreva("Digite a primeira nota: ")
		leia(notaUm)

		escreva("Digite a segunda nota: ")
		leia(notaDois)

		escreva("Digite a terceira nota: ")
		leia(notaTres)

		media = (notaUm*0.2  + notaDois*0.3 + notaTres*0.5)   //soma e divisão das tres notas

		escreva("sua média é: ", media)
		se (media < 5)
		{
			escreva("\nReprovado")
		}
		senao
		se (media >= 5)
		{
			escreva("\nAluno Aprovado")
		}
		senao
		se (media >= 10)
		{
			escreva("\nAluno Exemplar")
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 421; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */