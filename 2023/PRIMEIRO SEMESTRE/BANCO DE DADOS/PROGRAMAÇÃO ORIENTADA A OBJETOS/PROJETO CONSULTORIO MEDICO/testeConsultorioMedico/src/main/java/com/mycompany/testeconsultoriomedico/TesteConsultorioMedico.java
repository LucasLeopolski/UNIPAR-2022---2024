/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.testeconsultoriomedico;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class TesteConsultorioMedico {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        testeAgendamento ag1 = new testeAgendamento ("", "", "", "", "", "" );
        ag1.idade = 5;
        ler.nextInt();
        

        int opcao = ler.nextInt();

        switch (opcao) {

            case 1:
                System.out.println("Sua escolha foi agendamento");
                ag1.opcaoAgendamento();

            default:
                System.out.println("Número invalido!");

        }

    }
}
