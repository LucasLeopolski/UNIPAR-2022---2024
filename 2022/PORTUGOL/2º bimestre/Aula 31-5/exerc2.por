programa
{
	
	funcao inicio()
	{
		inteiro num[10]
		escreva ("Insiar 10 números: \n")
		para ( inteiro i=0; i<10; i++){
			leia(num[i])
		}

		escreva("O maior numero é: ")
		escreva(oMaior(num))
	}
	funcao inteiro oMaior(inteiro n[]){
		inteiro maior = 0
		para (inteiro i=0; i<10; i++){
			se (n[i] > maior){
				maior=n[i]
			}
		}
		retorne maior
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 201; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */