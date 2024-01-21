programa
{/*Crie um algoritmo que leia uma temperatura em graus Celsius e apresente a
mesma em:
Fahreinheit: °F = °C × 1, 8 + 32
Kelvin: °K = °C + 273*/
	
	funcao inicio()
	{
	inteiro temp, k, f
		escreva("Insira a temeratura em ºC: \n")
		leia(temp)
		limpa()

	f= temp*1.8+32
	k= temp+273

		escreva("A temperatura inserida foi ",temp,"ºC. \nA mesma equivale a ",f," ºF(graus Fahreinheit), e ",k," ºK(graus Kelvin).\n\n")

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */