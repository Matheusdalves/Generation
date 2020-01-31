programa
{
	
	funcao inicio()
	{
		cadeia vetor[9999] 
		inteiro comentario

		escreva("Escreva a quantidade de comentarios que deseja fazer: ")
		leia (comentario)

		para(inteiro i = 1; i <= comentario; i++)
		{
			escreva("Escreva o ", i ,"º comentario: ")
			leia(vetor[i])
		}
		escreva("//////////\\\\\\\\\\\\///////////\n")
		escreva("Seus comentario foram: ")
		escreva("\n//////////\\\\\\\\\\\\\//////////")
		para(inteiro i = 1; i <= comentario; i++)
		{
			escreva("\n", i , "º comentario foi: ",vetor[i])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 414; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */