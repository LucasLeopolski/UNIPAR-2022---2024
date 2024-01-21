programa
{/*7 - Faça uma função que recebe um valor inteiro e verifica se o valor é
positivo, negativo ou zero. A função deve retornar 1 para valores positivos, -1
para negativos e 0 para o valor 0.*/
	
	funcao inicio()
	{
	inteiro posi, neg, zero, num
		escreva("Insira um número: \n")
		leia(num)

		se (num > 0){
		escreva("\n",positivo(num),"\n")
		
	}senao se (num < 0){
	escreva("\n",negativo(num),"\n")

	}senao se( num == 0){
		escreva ("\n",zerO(num),"\n")
	}

		
	}

	funcao inteiro positivo(inteiro n){
		se ( n > 0){
	}
		retorne 1
}
	funcao inteiro negativo( inteiro n){
		se (n < 0){
		
	} 
		retorne  -1 
}
	funcao inteiro zerO (inteiro n){
		se ( n ==0){
			
	}
		retorne 0
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 473; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */