programa

{/*5 - Desenvolva um algoritmo que calcule o IMC de adultos.
Fórmula: Peso / Altura *Altura
Considere:
Menor que 18,5 está abaixo do peso
Entre 18,5 a 24,9 está normal
Entre 25 a 29,9 sobrepeso
Entre 30 a 39,9 obesidade
Maior que 40 obesidade grave*/
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
	real peso, altura, resultado
		escreva("Calculadora para IMC\n")
		escreva("Informe seu peso: \n")
		escreva("Informe sua altura: \n")
		leia(peso,altura)
		limpa()
		
		resultado = (calcularImc(peso,altura))
		escreva(resultado)
		escreva("\n")
		
		se(resultado <18.5){
			abaixoPeso()
		}senao se (resultado >18.5 e resultado <24.9){
			normal()
		}senao se (resultado >25 e resultado <29.9){
			sobrepeso()
		}senao se (resultado >30 e resultado <39.9){
			obesidade()
		}senao se (resultado > 40){
			obesidadeGrave()
			
		}
	}

	funcao real calcularImc(real p, real a){
		 real calcular = 0.0
		 calcular = p / (a*a)
		 retorne mat.arredondar(calcular, 2) // retornando o valor com duas casas decimais
	}
	funcao abaixoPeso(){
		escreva("Você está abaixo do peso. \nIMC menor que 18.5\n")
	}
	funcao normal(){
		escreva("Seu IMC está normal. \nIMC entre 18.5 e 24.9\n")
	}
	funcao sobrepeso(){
		escreva("Você está com sobrepeso. \nIMC entre 25 a 29.9\n")
	}
	funcao obesidade(){
		escreva("Você está obeso. \nIMC entre 30 e 39.9\n")
	}
	funcao obesidadeGrave(){
		escreva("Você está com obesidade GRAVE! \n IMC acima de 40\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 492; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */