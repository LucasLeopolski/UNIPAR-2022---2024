programa
{ //exercicio 02
	/*Um distribuidor de refrigerantes vende seu produto em todo país. Em cada trimestre do ano passado 
	ele vendeu uma certa quantidade de garrafas em cada região do brasil. Faça um algoritmno para ler
	as quantidades vendidas e escrever a quantidade vendida em todo país.

 -

	> Considere as regioes: Norte, Nordeste, Sul, Sudoeste,  Centro Oeste. */
	funcao inicio()
	{
   /*  const inteiro NORTE = 1
     const inteiro NORDESTE = 2 
     const inteiro SUL = 3
     const inteiro SUDESTE = 4
     const inteiro CENTROOESTE = 5
     const inteiro as = 11*/
	
	inteiro vendNorte[4],vendNordes[4],vendSul[4],vendSud[4], vendCenOes[4], vendTtl[20], soma1T, soma2T, soma3T, soma4T
		escreva("Algoritmo para ler quantidade de Refrigerantes vendidos. \n\n")
		para(inteiro i=0; i<4; i++){
		escreva("Insira a quantidade de refrigerantes vendidos na região Norte: \n")
		leia(vendNorte[i])
		limpa()
		
		}
		para(inteiro q=0; q<4;q++){
			escreva("Insira a quantidade de refrigerantes vendidos na região Nordeste: \n")
			leia(vendNordes[q])
			limpa()
		

	}
	}
	} 
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1077; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */