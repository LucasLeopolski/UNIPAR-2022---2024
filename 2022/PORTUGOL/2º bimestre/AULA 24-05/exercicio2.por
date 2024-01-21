programa
{
	inclua biblioteca Matematica
 -->mat  //apelidando a biblioteca -->

	
	/*Desenvolva um algoritmo que receba o valor em Bitcoin de 5 produtos. Em
seguida deve ser impresso na tela o valor convertido em dólares, euros, libras
e reais. Utilize uma função para cada conversão.
Considere os valores abaixo:
1 Euro = R$ 5,16 1 Libra = R$ 6,02 1 Dólar = R$ 4,81
1 Bitcoin = R$ 141.257,01*/
	
	funcao inicio()
	{
		real btc, resultBtc, dolar, resultDlr, libras, resultLbr, euros, resultEur
		real produto[5]

		escreva("Insira o valor de 5 itens para saber o seu valor em Bitcoin, Dólar, Euros e Libras: \n")
		para (inteiro i=0; i<=4; i++){
		 leia(produto[i])
		 limpa()
		}
		 btc = produto[0] / 141257.01
		 resultBtc = mat.arredondar(btc, 3)
		 dolar = produto[0] / 4.81
		 resultDlr = mat.arredondar(dolar, 3)
		 libras = produto[0] / 6.02
		 resultLbr = mat.arredondar(libras, 3)
		 euros = produto[0] / 5.16 
		 resultEur = mat.arredondar(euros, 3)
		 escreva("\nO primeiro item equivale a: \n",resultBtc," biticoins;\n",resultDlr," Dólares;\n",resultLbr, " Libras;\n", resultEur, " Euros.\n" )
		 escreva("=====================================\n")

		 btc = produto[1] / 141257.01
		 resultBtc = mat.arredondar(btc, 3)
		 dolar = produto[1] / 4.81
		 resultDlr = mat.arredondar(dolar, 3)
		 libras = produto[1] / 6.02
		 resultLbr = mat.arredondar(libras, 3)
		 euros = produto[1] / 5.16 
		 resultEur = mat.arredondar(euros, 3)
		 escreva("O segundo item equivale a \n",resultBtc," biticoins;\n",resultDlr," Dólares;\n",resultLbr, " Libras;\n", resultEur, " Euros.\n" )
		 escreva("=====================================") 

		 btc = produto[2] / 141257.01
		 resultBtc = mat.arredondar(btc, 3)
		 dolar = produto[2] / 4.81
		 resultDlr = mat.arredondar(dolar, 3)
		 libras = produto[2] / 6.02
		 resultLbr = mat.arredondar(libras, 3)
		 euros = produto[2] / 5.16 
		 resultEur = mat.arredondar(euros, 3)
		 escreva("\nO terceiro item equivale a: \n",resultBtc," Biticoins;\n",resultDlr," Dólares;\n",resultLbr, " Libras;\n", resultEur, " Euros.\n" ) 
		 escreva("=====================================") 

		 btc = produto[3] / 141257.01
		 resultBtc = mat.arredondar(btc, 3)
		 dolar = produto[3] / 4.81
		 resultDlr = mat.arredondar(dolar, 3)
		 libras = produto[3] / 6.02
		 resultLbr = mat.arredondar(libras, 3)
		 euros = produto[3] / 5.16 
		 resultEur = mat.arredondar(euros, 3)
		 escreva("\nO quarto item equivale a: \n",resultBtc," biticoins;\n",resultDlr," Dólares;\n",resultLbr, " Libras;\n", resultEur, " Euros.\n" )
		 escreva("=====================================") 

		 btc = produto[4] / 141257.01
		 resultBtc = mat.arredondar(btc, 3)
		 dolar = produto[4] / 4.81
		 resultDlr = mat.arredondar(dolar, 3)
		 libras = produto[4] / 6.02
		 resultLbr = mat.arredondar(libras, 3)
		 euros = produto[4] / 5.16 
		 resultEur = mat.arredondar(euros, 3)
		 escreva("\nO quinto item equivale a: \n",resultBtc," biticoins;\n",resultDlr," Dólares;\n",resultLbr, " Libras;\n", resultEur, " Euros.\n" )
		 escreva("=====================================") 
	
		


		 	
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2900; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {produto, 17, 7, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */