programa
{
	/*9 - Desenvolva um algoritmo que receba vetores com o nome de 5 funcionários
e seus salários. Haverá um reajuste no valor pago, se o salário for menor que
R$ 2.000,00, o funcionário receberá um aumento de R$ 250,00, já se for entre
R$ 2.000,00 e R$ 3.500,00, receberá um aumento de R$ 100,00.
Mostre, o nome do funcionário e valor a ser recebido.*/
	funcao inicio()
	{
	cadeia nome[5]
	real salario[5]
	inteiro i, s
	//real soma1=250.00, soma2=100.00     //soma1 = 250; soma2 = 100

		escreva("Entre com o nome dos 05 funcionários: \n")
		para( i=0; i<5;i++){
			leia(nome[i])
			limpa()
		}

		escreva("Agora digite o salário respectivo ao funcionário: \n")
		para( s=0; s<5;s++){
			leia(salario[s])
			limpa()

		}

		para( i=0; i<5;i++){
			se (salario[i]<2000){
				escreva(nome[i]," receberá um aumento de 250,00! \n")

			}senao se(salario[i]<=3500){ 
				escreva(nome[i]," receberá um aumento de 100,00! \n")

			}senao{
				escreva(nome[i]," não receberá aumento salarial, pois o seu salário é superior aos valores definidos!\n ")

				
				
			}
				
			}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 929; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {nome, 10, 8, 4}-{salario, 11, 6, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */