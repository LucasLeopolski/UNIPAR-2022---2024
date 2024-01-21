programa
{
	
	funcao inicio()
	{
		escreva("Exemplo: Passagem de parâmetro por valor(cópia)")
		inteiro n1=60
		escreva("\nNúmero: ",n1)
		mensagem(n1)
		escreva("\n Número: ",n1)
		
	}
	funcao mensagem(inteiro abc){
		//abc = abc+10+20
		abc+=30
		escreva("\nNúmero dentro da função: ",abc)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */