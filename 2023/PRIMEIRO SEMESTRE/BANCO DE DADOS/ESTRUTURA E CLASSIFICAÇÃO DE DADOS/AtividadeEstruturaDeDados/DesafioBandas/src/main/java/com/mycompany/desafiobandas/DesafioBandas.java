/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//Implemente um programa onde sejam permitidos adicionar vários nomes de
//bandas, excluir um elemento qualquer da lista por seu índice, mostrar novamente
//a lista, fazer uma nova inclusão, e por fim excluir todos os elementos da lista.
package com.mycompany.desafiobandas;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class DesafioBandas {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<String> ListaBanda = new ArrayList<>();
        String banda;
        String a;

        int opcmenu = -1;
        while (opcmenu != 0) {
            System.out.println("INFORME A OPÇÃO DESEJADA: ");
            System.out.println("[1] Para adicionar Banda");
            System.out.println("[2] Excluir uma banda pelo seu indice");
            System.out.println("[3] Para visualizar lista de bandas");
            System.out.println("[4] Deletar Lista");

            a = ler.nextLine();

            switch (a) {
                case "1": {

                    System.out.println("Informe o nome da banda que deseja adicionar!: ");
                    banda = ler.nextLine();
                    ListaBanda.add(banda);

                    break;

                }

                case "2": {
                    System.out.println("BANDAS CADASTRADAS: \n" + ListaBanda);
                    System.out.println("Insira o indice da banda que deseja deletar: ");
                    int deletarBanda = ler.nextInt();

                    ListaBanda.remove(deletarBanda);
                    break;
                }
                case "3": {

                    System.out.println(ListaBanda);

                    break;
                }

                case "4": {
                    ListaBanda.clear(); // está escluindo toda a lista
                    System.out.println("BANDAS: \n" + ListaBanda); // apresentando novamente a lista só que agora está vazia
                }
                default:
                    System.out.println("Por favor, digite uma opção válida! \n\n");
            }

        }

    }

}
