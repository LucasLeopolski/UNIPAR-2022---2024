programa
{
	
	funcao inicio()
	{

	inteiro vlr[10], soma//valor
	real media

		escreva("Insira 10 numeros inteiros: \n")
		para(inteiro i=0; i<=9; i++)
		leia(vlr[i])
		limpa()

		soma=vlr[0]+vlr[1]+vlr[2]+vlr[3]+vlr[4]+vlr[5]+vlr[6]+vlr[7]+vlr[8]+vlr[9]
		escreva("A soma dos valores digitados é: ",soma,"!\n")

		media=soma/10.0
		escreva("\nA média dos números inseridos é: ",media,"!\n \n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 330; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vlr, 7, 9, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */