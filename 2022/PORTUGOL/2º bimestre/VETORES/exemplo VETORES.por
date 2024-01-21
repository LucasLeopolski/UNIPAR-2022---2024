/*Fazer um algoritmo que leia 10 números*/
programa
{
	
	funcao inicio()
	{
		escreva("Vetores: \n")

		inteiro numero[10]
//lendo os números
		para(inteiro i=0; i<10; i++){
			leia(numero [i]) // variavel contadora
			
		}
		//escrevendo os números
	para (inteiro i=0;i<=9;i++){
		escreva(numero[i],"-")
	}
		escreva("\n")
		//mostrar os números ao contrário ( de trás pra frente) 
		para (inteiro y=9; y>=0; y--){
			escreva( numero [y], "-")
		}
	
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 279; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */