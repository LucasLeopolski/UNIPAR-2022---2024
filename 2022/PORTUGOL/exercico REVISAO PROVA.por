programa
{
	inclua biblioteca Arquivos--> arq 
	funcao inicio()
	{
		inteiro CadastrarProduto, CadastrarVendedor, realizarVenda, sair
		 
		
		menu()
	}

	funcao menu(){
	inteiro opcao
	escreva("SANTO ANTÔNIO FERRAMENTAS EM GERAL\n\n")
	escreva("Escolha uma opção abaixo:\n")
	escreva("[1]CADASTRAR PRODUTO \t[3]REALIZAR VENDA \n[2]CADASTRAR VENDEDOR\t[4]RELATÓRIO DE VENDAS\n[5]SAIR\n\n")
	leia(opcao)
	se(opcao ==1){
		cadastProd()
	}senao se (opcao==2){
		cadastVend()
	}senao se(opcao==3){
		realiVenda()
	}
	}
	funcao cadastProd(){
		inteiro cadastroProd
		escreva("Qual o item você deseja cadastrar?\n")
		escreva("[5]Parafuso\t[7]Polca\n[6]Broca 3/4\t[6]Arruela")
		leia(cadastroProd)
		se(cadastroProd ==5 ou cadastroProd ==6 ou cadastroProd ==7 ou cadastroProd ==8){
			escreva("\nProduto cadastrado com sucesso!")
		}senao{
				escreva("Escolha uma opção valida!")
		}
	}
	funcao cadastVend(){
		inteiro cadastroVend
		escreva("Insira o nome do novo vendedor: ")
		escreva("Vendedor cadastrado com sucesso!")
		leia(cadastroVend)
		}
	
	funcao realiVenda(){
		inteiro venda, quant
			escreva("Qual o nome do vendedor?")
			leia(cadastroVend)
			escreva("Qual item foi vendido?")
			leia(cadastProd)
			escreva("Qua a quantidade?")
			leia(quant)
			
	}
	funcao



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1270; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */