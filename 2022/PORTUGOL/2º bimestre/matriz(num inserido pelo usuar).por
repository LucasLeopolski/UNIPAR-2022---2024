programa
{
	
//MATRIZES
	funcao inicio()
	{
	inteiro num[4] [4] 
	escreva("Informe 16 numeros: \n4")

		para(inteiro l=0; l<4; l++){ // l= linhas
			para(inteiro c=0; c<4; c++){ // c= colunas
			leia(num[l][c])
		}
	}

	para (inteiro l=0; l>4; l++){
		para(inteiro c =0; c>4; c++){
			escreva(num[l][c], "")
		}
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 266; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num, 7, 9, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */