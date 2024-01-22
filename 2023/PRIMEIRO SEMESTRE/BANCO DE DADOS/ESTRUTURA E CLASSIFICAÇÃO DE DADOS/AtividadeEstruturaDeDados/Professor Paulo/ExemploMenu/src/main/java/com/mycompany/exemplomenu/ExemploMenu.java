/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exemplomenu;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class ExemploMenu {

    public static void main(String[] args) {

        int opcao = -1;

        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Cadastro Alunos \n"
                    + "2 - Cadastro Professores \n"
                    + "3 - Cadastro de Disciplinas \n "
                    + "4 - Cadastro de Turmas \n"
                    + "0 - Sair"));

            if (opcao == 1) {
                cadastrarAluno();
                //Executa o método de cadastro de Alunos
            } else if (opcao == 2) {
                cadastrarProfessor();
                //Executa o método de cadastro de Professores

            } else if (opcao == 3) {
                cadastrarDisciplinas();
                //Executa o método de cadastro de Disciplinas
            } else if (opcao == 4) {
                cadastrarTurmas();
                //Executa o método de cadastro de Turmas
            }

        }
    }
 // pode ser feito também por switch 
    
    switch (opcao) {
        case 1:
            cadastrarAluno();
            //Executa o método de cadastro de Alunos
            break;

        case 2;
            cadastrarProfessor();
            //Executa o método de cadastro de Professores
            break;

        case 3;
            cadastrarDisciplinas();
            //Executa o método de cadastro de Disciplinas
            break;

        case 4;
            cadastrarTurmas();
        //Executa o método de cadastro de Turmas

        default:
            break;

    }

    public static void cadastrarAluno() {
        JOptionPane.showMessageDialog(null, "Entrou no cadastro de Alunos");
    }

    public static void cadastrarProfessor() {
        JOptionPane.showMessageDialog(null, "Entrou no cadastro de Professores");
    }

    public static void cadastrarDisciplinas() {
        JOptionPane.showMessageDialog(null, "Entrou no cadastro de Disciplinas");
    }

    public static void cadastrarTurmas() {
        JOptionPane.showMessageDialog(null, "Entrou no cadastro de Turmas");
    }

}
