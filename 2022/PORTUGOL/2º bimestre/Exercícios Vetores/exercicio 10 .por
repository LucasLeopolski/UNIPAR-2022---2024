programa
{
	/*10 - Crie um algoritmo que peça ao usuário que informe 10 números inteiros e
armazene-os em um vetor. A seguir, apresente a multiplicação de todos os
elementos pares e a soma de todos os elementos ímpares. Exemplo:*/
	funcao inicio()
	{
	inteiro num[10], par=1, impar=0
	
		escreva("Insira 10 números inteiros:\n")
		para(inteiro i=0; i<=9;i++){
		leia(num[i])

		se (num[i] % 2 == 0 ){
			par= par* num[i]
		}senao{
			impar = impar + num[i]

			escreva("\nA soma dos impares é: ",impar)
			escreva("\nA multiplicação dos pares é: ", par)
		
		}
	}
} }

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 568; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */