programa
{
/*2 - Realizar o mesmo exercício anterior, porém após ordenar os elementos em
ordem crescente, deve ser informado mais um número qualquer e inserir esse
novo número na posição correta, ou seja, mantendo a ordem crescente do
vetor.*/
	
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
		para(inteiro i=0; i<=20; i++){
			escreva(vetor[i]," ")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 455; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */