programa
{
	
	funcao inicio()
	{
	inteiro vetor[20]
		escreva("Informe 20 numeros: \n")

		para( inteiro i=0; i<=19; i++){
			leia(vetor[i])
		}

		//ordenação do vetor
		para(inteiro y=19;y>0;y--){
			para(inteiro x=0; x<y; x++){
				se (vetor[x] > vetor[x+1]){
					inteiro aux = vetor[x]
					vetor[x] = vetor [x+1]
					vetor[x+1] = aux
				}
			}
		}

		//Escrever o vetor ordenado
		para(inteiro i=0; i<=19; i++){
			escreva(vetor[i]," ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 87; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 6, 9, 5}-{aux, 17, 13, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */