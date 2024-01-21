programa
{
	
	funcao inicio()
	{
inteiro voto, votochapa1=1, votochapa2=2, nulo=9, branco=0,contador

	escreva("Algoritmo para calcular quantidade de votos para o eleições do gremio estudantil\n")
	escreva("Digite [1] para Chapa 1; \n")
	escreva("Digite [2] para Chapa 2; \n")
	escreva("Digite [9] para voto nulo; \n")
	escreva("Digite [0] para voto em branco 0; \n")

	escreva("Informe seu voto: ")
	leia(voto)

	se (voto == 1 ){
	escreva("Seu voto foi na chapa 1!")
 

	}senao se (voto==2){
		escreva("Seu voto foi para a chapa 2!")

	}senao se (voto==9){
		escreva("Seu voto foi nulo!")

	}senao se (voto==0){
		escreva("Seu voto foi em branco!")

	}senao{
		escreva("O seu digito não corresponte a nenhuma das opções de voto!")

		
	}
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 740; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */