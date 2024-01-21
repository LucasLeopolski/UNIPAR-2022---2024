programa
{ // Exerc. 01
	/*Desenvolva um algoritmo que receba um vetor com 20 elementos e apresente na tela o vetor original e o vetor ordenado*/
	funcao inicio()
	{
		inteiro vet[20]

		escreva("Informe 20 números: \n")
		para(inteiro i=0; i<20; i++){
			leia(vet[i])
		}
		para(inteiro i=0; i<20; i++){
			escreva(vet[i]," ")
		}

			//ordenação do vetor
			para( inteiro t=19; t>=0; t--){
				para( inteiro b=0; b<t; b++){
					se (vet[b] > vet[b+1]){
						inteiro aux = vet[b]
						vet[b] = vet[b+1]
						vet[b+1] = aux
						
						
					}
				}
			}
			//Escrever o vetor ordenado
		escreva("\nVetor Ordenado:\n")
		para(inteiro q=0; q<20; q++){
			escreva(vet[q]," ")
			
		}
	}
} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 23; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vet, 6, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */