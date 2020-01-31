programa
{
	
	funcao inicio()
	{
		inteiro numero, quantidade
		
		escreva("Escreva o numero da tabuada que deseja ver: ") // Onde sera definido o numero que sera multplicado
		leia (numero)
		escreva("Digite uma quantidade para multplicação: ")
		leia(quantidade)
		escreva("----------------------------------------\n")
		escreva("O Resultado é: \n") // O que vai mostrar o resuldado da multipliação
		escreva("----------------------------------------\n")

		para(inteiro mult = 0 ; mult <= quantidade; mult++) //Sistema de repetição
			{
			escreva(numero, " X ",mult, " = " , numero*mult,"\n") // Formula da multplicação
			}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 630; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */