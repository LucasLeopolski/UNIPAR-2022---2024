//Implemente um programa onde sejam permitidos adicionar vários nomes de
//bandas, excluir um elemento qualquer da lista por seu índice, mostrar novamente
//a lista, fazer uma nova inclusão, e por fim excluir todos os elementos da lista.
package exerciciolist;

import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Nathan Graebin
 */
public class ExercicioList {

    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        List<String> listaBanda = new ArrayList<>();

        String nomeBanda;

        int opcaoMenu = -1;

        while (opcaoMenu != 0) {

            System.out.println("[1] CADASTRAR BANDA");
            System.out.println("[2] EXCLUIR BANDA POR INDICE");
            System.out.println("[3] MOSTRAR LISTA");
            System.out.println("[4] EXCLUIR TUDO");

            int opcao;
            opcao = Ler.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("INFORME O NOME DA BANDA");
                    nomeBanda = Ler.next();

                    listaBanda.add(nomeBanda);
                    break;

                case 2:
                    System.out.println("LISTA DE BANDAS > " + listaBanda);
                    System.out.println("ESCOLHA O INDICE DA BANDA QUE QUER DELETAR");
                    int indiceDeletar = Ler.nextInt();
                    
                    listaBanda.remove(indiceDeletar);
                    break;

                case 3:
                    System.out.println(listaBanda);

                    break;

                case 4:
                    System.out.println("LISTA DE BANDAS > " + listaBanda);
                    System.out.println("FAZENDO A LIMPEZA");
                    listaBanda.clear();
                    System.out.println("LISTA DE BANDAS APOS LIMPEZA > " + listaBanda);

            }
        }
    }
}
