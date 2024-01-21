programa
{/*13 - Desenvolva um algoritmo que receba em seu programa principal um
numero inteiro, e passe por parâmetro valor (cópia) para uma função que
converta esse numero informado em numero romano. O numero romano deve
ser apresentado na tela. Ex: Digitou 20, deve aparecer XX.
I = 1 VI = 6 XX = 20 LXX=70 CCC= 300
II 2 VII = 7 XXX = 30 LXXX=80 CD = 400
III = 3 VIII=8 XL = 40 XC = 90 D = 500
IV = 4 IX = 9 L = 50 C = 100 DC = 600
V = 5 X = 10 LX = 60 CC = 200 M = 1000*/
	
	funcao inicio()
	{

	inteiro n
	cadeia resul = " "

    escreva("Digite um valor a ser convertido: ")
    leia(n)

    escreva("\n")
    escreva("\nO valor em romano é de: ")
   
    converterRomanos(n,resul)
    
}
	
    funcao converterRomanos (inteiro numero, cadeia resultado){
    cadeia centenas[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}
    cadeia dezenas[]  = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}
    cadeia unidades[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}
    inteiro tamanho[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}

    enquanto (numero >= 1000){
        resultado = resultado++
        resultado ="M"
        numero -= 1000 //mesma coisa que numero = numero - 1000
    }


   //resolvendo o problema em partes.Exemplo: Numero 345
   //Vamos primeiro isolar a centena
   escreva (resultado=centenas[numero / 100])//345 / 100 = 3 (tem 3 centenas)
   resultado += tamanho[numero / 100] 
   numero = numero % 100// resto da divisão por 100 = 45
   //agora vamos para as dezenas
   escreva (resultado = dezenas[numero / 10] ) //45/10 = 4 (tem 4 dezenas)
   resultado += tamanho[numero / 10]  
   numero = numero % 10// resto da divisão por 10 = 5
   //agora vamos para as unidades
   escreva(resultado = unidades[numero])//restam 5 unidades 
   resultado +=tamanho[numero]
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 478; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */