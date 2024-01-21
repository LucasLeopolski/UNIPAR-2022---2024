programa
{
	
	funcao inicio()
	{
		escreva("Passagem Parâmetro Cópia")
          //Declaração das variaveis
		cadeia texto1
		inteiro resultadoSoma, resultadoMult

		//Chama as funcoes
		texto1 = mensagem("inicio")
		escreva(texto1)

		resultadoSoma = calcularSoma(3,5)
		escreva ("\nSoma: ", resultadoSoma)
		
		resultadoSoma = calcularSoma(10,5)
		escreva ("\nSoma: ", resultadoSoma)
		
		texto1 = mensagem("Inicio")
		escreva(texto1)

		resultadoMult = multiplicar(2,3)
		escreva ("\nResultado Multiplicação: ",resultadoMult)
		
		
		
	}

	funcao cadeia mensagem (cadeia texto){
		cadeia msg
		se (texto == "inicio"){
			msg = "\nINICIO DO ALGORITMO"
		}senao{
			msg = "\nFIM DO ALGORITMO"
		}
		retorne msg
	}

	funcao inteiro calcularSoma (inteiro n1, inteiro n2){
		retorne n1+n2
	}

	funcao inteiro multiplicar(inteiro n1, inteiro n2){
		retorne n1+n2
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 546; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */