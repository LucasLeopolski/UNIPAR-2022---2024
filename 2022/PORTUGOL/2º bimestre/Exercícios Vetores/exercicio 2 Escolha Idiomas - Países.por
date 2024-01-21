/*2 - Crie um algoritmo que contenha 5 países e conforme o país escolhido pelo
usuário, mostre qual idioma nato.*/
programa
{
	funcao inicio()
	{
	cadeia idioma[5]
	inteiro pais, i
	
		escreva("Escolha um pais: \n(1)Japão \t(4)Brasil\n(2)EUA        \t(5)França \n(3)Turquia\n\n")
		leia(pais)
		escreva("\n")


		se (pais==1){
		escreva("O idioma Nato no Japão é o Japonês!\n\n")
		

		}senao se (pais==2){
		escreva("O idioma Nato nos Estados Unidos é o Inglês!\n\n")
		

		}senao se (pais==3){
		escreva("O idioma Nato na Turquia é o Turco!\n\n")
		

		}senao se (pais==4){
		escreva("O idioma Nato no Brasil é o Portugês!\n\n")
		

		}senao se (pais==5){
		escreva("O idioma Nato na França é o Francês!\n\n")
		

		}senao{
			escreva("Você não escolheu um número valido!!\n\n")
		}
	}
}
		
		
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 660; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */