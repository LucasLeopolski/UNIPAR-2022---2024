programa
{
//Exerci. 03

/* desenvolva um algoritmo que apresente na tela a seguinte matriz:
 *  			Z Z Z Z
 *  			Z X X Z
 *  			Z X X Z
 *  			Z Z Z Z
 */
	
	
	funcao inicio()

	{caracter  mat [4] [4] = {{'Z','Z','Z','Z'},
						 {'Z','X','X','Z'},
						 {'Z','X','X','Z'},
						 {'Z','Z','Z','Z'}}
		para(inteiro l=0; l<4;l++){
			para( inteiro c=0; c<4; c++){
			escreva(mat[l][c]," ")
		}
	
	escreva("\n")
	}	
} }
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 428; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 15, 13, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */