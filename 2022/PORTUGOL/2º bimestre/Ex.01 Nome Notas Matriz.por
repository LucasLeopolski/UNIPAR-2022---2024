programa
{
/*01 desenvolver um algoritmo que armazene 03 alunos e receba as notas de 4 bimestres. 
Calcule a média de cada aluno, e apresente se estão aprovados ou não. Considere aprovado com  média maior que 7;
Reprovado com média abaixo de 7. Mostrar esssas informações no relatório  */
	
	funcao inicio()
	{

	escreva("Relatório Aluno: \n")
	cadeia nomes[3] = {"João", "Lucia", "Maria"}
 	inteiro notas[3][4] = {{10,60,80,20},
					   {40,30,92,100},
					   {80,75,90,70}}
	inteiro medias [3]
	cadeia resultado
	inteiro aluno,soma 

		para (inteiro l=0; l<3; l++){
			soma = 0
			para(inteiro c=0; c<4; c++){
				soma+= notas[l][c]
				soma = soma + notas [l][c]
				
			}
			medias [l] = soma/4
		}

	escreva ("\nInforme o numero do aluno:\n(0)= João; (1)=Lucia; (2)=Maria.\n ")
	leia(aluno)
	limpa()

		se (medias[aluno]>=60){
			resultado = "Aprovado"
		}senao{
			resultado = "Reprovado"

		}
	
		escreva("======================================== \n")
	     escreva("     Aluno:      ",nomes[aluno],       " \n")
	     escreva("======================================== \n")
	     escreva("     1º BIM:     ",notas[aluno][0],    " \n")
	     escreva("     2º BIM:     ",notas[aluno][1],    " \n")	     
	     escreva("     3º BIM:     ",notas[aluno][2],    " \n")
	     escreva("     4º BIM:     ",notas[aluno][3],    " \n")
	     escreva("======================================== \n")
	     escreva("     Média :     ",medias[aluno],      " \n")
	     escreva("     Resultado : ",resultado,          " \n")
	     escreva("======================================== \n")
	    
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 805; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {notas, 12, 10, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */