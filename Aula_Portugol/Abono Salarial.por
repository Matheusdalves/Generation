programa
{
	
	funcao inicio()
	{
		cadeia: nome, sexo
		inteiro: idade
		real: abono = 0.0 , salario = 0.0

		
		escreva("Escreva o nome do funcionario: ")
		leia(nome)
		limpa()

		escreva("Informe a idade: ")
		leia(idade)
		limpa()

		escreva("Informe o sexo do funcionário Feminino/Masculino: ")
		leia(sexo)
		limpa()

		escreva("Informe o seu salário: ")
		leia(salario)
		limpa()
		


		se (idade <= 30  e sexo == "Masculino"){
			abono = 100.00}
		senao {
			abono= 50.00}

			se (idade <= 30  e sexo == "Feminino"){
			abono = 200.00}
		senao {
			abono= 80.00}

			{ 
				escreva("\n O salário do funcionario(a) " + nome + " é: R$" + (salario + abono), "\n")
				}
			
			
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 434; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */