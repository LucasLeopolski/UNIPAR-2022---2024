programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
	inteiro matrizA[3][3], matrizB[3][3], matrizSoma[3][3]

		gerarMatriz(matrizA)
		escreva("\n")
		gerarMatriz(matrizB)
		escreva("\nSoma Matriz: \n")
		somarMatriz(matrizA,matrizB,matrizSoma)
	}
	funcao gerarMatriz(inteiro m[][]){
		para (inteiro l=0; l<3; l++){
			para(inteiro c=0;c<3;c++){
				m[l][c] = Util.sorteia(10,30)
				escreva(m[l][c],"")
				
			}escreva("\n")
		}
	}
	funcao somarMatriz(inteiro m[][], inteiro m1[][], inteiro soma[][]){
		inteiro l,c
		para(l=0; l<3;l++){
			para(c=0; c<3;c++){
				soma[l][c] =m[l][c]+ m1[l][c]
			}
		}para (l=0;l<3;l++){
			para(c=0;c<3;c++){
				escreva(soma[l][c]," ")
			}escreva("\n")
		}
	}
}	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 596; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */