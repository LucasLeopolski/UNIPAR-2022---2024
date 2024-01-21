/*4 - Crie um algoritmo que armazene 10 nomes em um vetor. Apresente os
nomes armazenados.*/

programa
{
	funcao inicio()
	{
	cadeia nomes[10]
	inteiro i
		escreva("Insira 10 nomes: \n")
		para(i=0; i<=9;i++)
		leia(nomes[i])
		limpa()

		escreva("Os nomes informados foram: ")
		para(i=0; i<=9;i++)
		escreva("-",nomes[i])
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {nomes, 8, 8, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */