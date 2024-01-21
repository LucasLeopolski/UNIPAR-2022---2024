programa
{/*12 - A imobiliária Cidade Linda vendeu 10 terrenos retangulares do mesmo
tamanho em Maio/2022. Faça um algoritmo para ler as dimensões de um
terreno e depois exibir a área do terreno. Também deve apresentar a soma de
todos os 10 terrenos em metros.
Sabendo que cada metro vale R$ 750,00, apresente o faturamento que a
imobiliária teve no mês de maio/2022.
Falando em faturamento, a imobiliária divide 20% do seu faturamento com seus
corretores, transformando em pagamento de comissão, atualmente são 5
corretores comissionados, quanto em R$ cada um irá receber?*/
	
	funcao inicio()
	{
	real lado, frente, area, somaTerreno, faturamMensal, pgmtVend
		escreva("Informe as medidas da lateral do terreno: \n")
		leia(lado)
		escreva("Informe a medidas da frente do terreno \n")
		leia(frente)

		area = somarAreaTerreno(lado,frente)
		escreva("\nArea do Terreno: \n")
		escreva(area)
		escreva("\nSoma dos 10 Terrenos em metros: ")
		escreva(somaTerreno)
		escreva("\nO faturamento da imobiliária foi de R$ ")
		faturamentoMensal = faturamento(somaTerreno)
		escreva(faturamentoMensal)
		escreva("")
	}
	funcao real somarAreaTerreno(real l, real f){
		real soma = l*f
		retorne soma
	}
	funcao real somaTamanhoTerrenos(real a){
		real resul = a*10
		retorne resul
	}
	funcao real faturamento (real f){
		real fat = f * 750.00
		retorne fat

	}
	funcao real comissao(real c){
		real extra = c *0.2
		extra = extra /5 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 960; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */