/*3 - Faça um algoritmo que leia e mostre um vetor de 5 números inteiros. A
seguir, inverta os valores desse vetor, trocando o primeiro elemento pelo
último, segundo pelo penúltimo, e assim sucessivamente exibindo novamente o
vetor invertido. Exemplo:*/
programa
{
	funcao inicio()
	{
	inteiro num[5], i
	

			escreva("Digite 05 números inteiros: \n")
			
	
		
		 para(i =0; i<5; i++)
		leia(num[i])
		
		escreva("\n\n")
	
	
		para(i=4; i>=0; i--)
		escreva(num[i])
		
			
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 461; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num, 9, 9, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */