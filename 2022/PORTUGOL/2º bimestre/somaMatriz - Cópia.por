programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
	inteiro a[5][5]

	geraMatriz(a)
	escreva("\n")
	escreva(somaElementos(a))
	}

	funcao geraMatriz(inteiro m[][]){
		inteiro l,c
		para(l=0; l<5; l++){
			para(c=0; l<5; l++){
				m[l][c] = Util.sorteia(0,1)
				escreva(" ",m[l][c])
			}
			escreva("\n")
		}
	}
	funcao inteiro somaElementos(inteiro m[][]){
		inteiro l,c,soma = 0
		para(l=0; l<5; l++){
			para(c=0; c<5; c++){
				soma+= m[l][c]
			}
		}retorne soma
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 479; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */