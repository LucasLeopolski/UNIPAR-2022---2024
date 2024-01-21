programa
{/*Faça um procedimento que lê 50 valores inteiros e retorna o maior e o
menor deles.*/ //exercicio 09 dia 24/5
	
	funcao inicio()
	{
	inteiro num[50]
	
		escreva("Insira 50 valores: \n")
		para(inteiro i=0; i<50; i++){
		leia(num[i]) 

		}
		escreva("O maior número é: ")
		escreva(encontrarMaior(num))

			escreva("\nO menor número é: ")
		escreva(encontrarMenor(num))
	}
	funcao inteiro encontrarMaior(inteiro n[]){
		inteiro maior = 0
		para (inteiro i=0; i<50;i++){
			se(n[i]> maior){
				maior=n[i]
			}
		}

		retorne maior 
	}
	funcao inteiro encontrarMenor(inteiro n[]){
		inteiro menor = 1119999
		para (inteiro i=0; i<50;i++){
			se(n[i]< menor){
				menor=n[i]

			}			
         }
         retorne menor
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 648; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */