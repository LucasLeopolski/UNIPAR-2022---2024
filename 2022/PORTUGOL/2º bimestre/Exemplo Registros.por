programa
{
	inclua biblioteca Arquivos --> arq

	const cadeia path = "./testes.txt"
	cadeia frase
	
	funcao inicio()
	{
		menu()
	
}	
	funcao menu(){
		inteiro opcao 
		escreva("MENU FRASES\n")
		escreva("\nEscolha uma opção abaixo: \n")
		escreva("1  - Exibir \n2 - Alterar\n")
		leia(opcao)
		limpa()
		se(opcao == 2){
			alterar()
			}senao{
				exibir()
			}
		}
		funcao alterar(){
			escreva("Digite uma nova Frase: ")
			leia(frase)
			inteiro arquivo = arq.abrir_arquivo(path,arq.MODO_ESCRITA)
			arq.escrever_linha(frase, arquivo)
			arq.fechar_arquivo(arquivo)
			
		}
		funcao exibir(){
			logico arquivo_existe=arq.arquivo_existe(path)
			se(arquivo_existe){
				inteiro arquivo = arq.abrir_arquivo(path, arq.MODO_LEITURA)
				frase = arq.ler_linha(arquivo)
				arq.fechar_arquivo(arquivo)
				escreva("A frase é: ***",frase,"***\n\n\n")
			}senao{
				escreva("Nenhuma frase no arquivo!\n\n")
			}
		}
		}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 904; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */