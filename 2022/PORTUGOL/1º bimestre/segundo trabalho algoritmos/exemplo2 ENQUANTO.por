programa
{
	
	funcao inicio()
	{
	inteiro valor, soma, media, cont

	escreva("Informe um número: ")
	leia(valor)

	soma=0
	media = 0
	cont=2
		enquanto(valor !=0){
			soma=soma + valor
			media=soma/(cont-1)
			escreva("Total: ", soma)
			escreva("\nDigite um valor para a soma: ou 0(zero) para sair ")
			leia(valor)
			cont++
		}

		escreva("Soma dos númros: ",soma,"\nMédia dos números: ",media)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 179; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */