programa
{
	funcao inicio ()
	{
		
		/*6 - Crie um algoritmo que peça ao usuário que informe oito números inteiros e
os armazene-os em um vetor. Apresente o maior elemento.*/

		inteiro num[8], maior
		
		//lendo numeros
		para(inteiro i=0; i<=7; i++)
		leia(num[i])

		maior = num[0]
	
		para (inteiro i=0; i<=7;i++)
		se (num[i] > maior){
			maior=num[i]
		}
		
		
		escreva("O maior numero informado foi: \n", maior)
		
	}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 286; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */