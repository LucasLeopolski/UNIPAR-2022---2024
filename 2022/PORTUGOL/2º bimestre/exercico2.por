programa
{
	/*2 - Realizar o mesmo exercício anterior, porém após ordenar os elementos em
ordem crescente, deve ser informado mais um número qualquer e inserir esse
novo número na posição correta, ou seja, mantendo a ordem crescente do
vetor.*/
	funcao inicio()
	{
		inteiro vet[20],num

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

			escreva ("Informe um numero:")
			leia (num)
				//ordenação do vetor
			para( inteiro t=20; t>=0; t--){
				para( inteiro b=0; b<t; b++){
					se (vet[b] > vet[b+1]){
						inteiro aux = vet[b]
						vet[b] = vet[b+1]
						vet[b+1] = aux

			
			//Escrever o vetor ordenado
		escreva("\nVetor Ordenado:\n")
		para(inteiro q=0; q<20; q++){
			escreva(vet[q]," ")
			
		}
					}}}}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 462; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vet, 9, 10, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */