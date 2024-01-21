programa
{/*11 - Faça uma função que recebe 3 valores inteiros por parâmetro e retorna-os
ordenados em ordem crescente.*/
	
	funcao inicio()
	{
	inteiro valor[3]

			para(inteiro i=0; i<3; i++){
				escreva("Informe os valores: \n")
				leia(valor[i])
			}

			ordenarValor(valor)
	}
	funcao ordenarValor(inteiro num[]){
		para(inteiro y=2; y>0; y--){
			para(inteiro x=0; x<y ;x++){
				se (num[x]>num[x+1]){
					inteiro aux = num[x]
					num[x] = num[x+1]
					num [x+1] = aux
				}
			}
			
		}
		escreva("Valores ordenados: ")
		para(inteiro i=0; i<3;i++){
			escreva(num[i]," ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 590; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */