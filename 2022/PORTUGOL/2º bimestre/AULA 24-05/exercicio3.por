programa
{ /*- Faça um algoritmo que através da idade e gênero informados pelo usuário
diga se ele pode ou não se alistar. Considere F; para feminino e M; para
masculino.*/
	
	funcao inicio()
	{
	inteiro idade, genero

		escreva("Alistamento 2022, vamos ver se você está apto?\n\n")
		

		escreva("Qual o seu gênero? \n[1] Para masculinio \n[2] para feminino\n")
		leia(genero)
		limpa()
		//escreva("Qual sua idade?")
		//leia(idade)

			escolha (genero) {
					
			caso 1:
			escreva("Qual sua idade? \n")
			leia(idade)

			se (idade >=18){
			escreva("Você é obrigado a se alistar! \n")

			}senao se (idade <18){
				escreva("Você não possuí a idade minima para se alistar! Tente novamente no próximo ano.\n\n")
			}

			pare
			
			caso 2:
			escreva("O alistamento miliatar não é obrigatório para mulheres.\n")
			pare
			
			 

			}
		
	
} }
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 840; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */