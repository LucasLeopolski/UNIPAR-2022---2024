programa
{/*Faça uma função que recebe a idade de uma pessoa em anos, meses e
dias e retorna essa idade expressa em dias.*/
	
	funcao inicio()
	{
	inteiro idade, anos, meses, dias
		escreva("Infomer sua idade em anos, meses e dias: \n")
		leia(anos, meses, dias)

		escreva ("Sua idade em dias é: ",calc(anos,meses,dias))
	}

	funcao inteiro calc( inteiro a, inteiro m, inteiro d){
		 inteiro resul =((a*365) + (m*30) + (d*1))

		 retorne resul
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 400; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */