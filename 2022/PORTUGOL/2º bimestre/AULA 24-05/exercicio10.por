programa
{/*Faça uma função que recebe a idade de um nadador por parâmetro e
retorna, a categoria desse nadador de acordo com a tabela abaixo:
Idade Categoria
5 a 7 anos Infantil A
8 a 10 anos Infantil B
11-13 anos Juvenil A
14-17 anos Juvenil B
Maiores de 18 anos
(inclusive)Adulto*/
	
	funcao inicio()
	{
	inteiro idade 
		escreva("Qual a sua Idade? \n")
		leia(idade)
		limpa()

		se (idade >= 5 e idade <=7){
			infantA(idade)

		}senao se(idade >= 8 e idade <=10){
			infantB(idade)
			
		}senao se(idade >= 11 e idade <=13){
			juveA(idade)
			
		}senao se(idade >= 14 e idade <=17){
			juveB(idade)

		}senao se(idade <=4){
			menos5(idade)
			
		}senao{
			adult(idade)
		}
	}

	funcao infantA(inteiro id){
		escreva("Categoria: \nInfantil A!\n\n")
	
		}
	funcao infantB(inteiro id){
			escreva("Categoria: \nInfantil B!\n\n")
}
	funcao juveA(inteiro id){
			escreva("Categoria: \nJuvenil A!\n\n")
}
	funcao juveB(inteiro id){
			escreva("Categoria: \nJuvenil B!\n\n")
}
	funcao adult(inteiro id){
			escreva("Categoria: \nAdulto!\n\n")
			
	}
	funcao menos5(inteiro id){
		escreva("Você ainda não tem idade para participar!\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 633; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */