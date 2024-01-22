/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.listaexerciciosn8;

import java.util.Scanner;

/**
 * 8 - Crie uma classe chamada "Funcionario" com atributos privados, como "nome"
 * e "salario". Utilize encapsulamento para permitir o acesso a esses atributos
 * por meio de métodos getters e setters.
 *
 * @author lucas
 */
public class ListaExerciciosN8 {

    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);

        String nomeFuncionario;
        float salario;
        Funcionario funcionario = new Funcionario();

        System.out.println("INFORME O NOME DO FUNCIONÁRIO: ");
        nomeFuncionario = Ler.nextLine();

        System.out.println("INFORME O SALARIO DO FUNCIONÁRIO: ");
        salario = Ler.nextFloat();

        funcionario.setNome(nomeFuncionario);
        funcionario.setSlario(salario);

        System.out.println("NOME: " + funcionario.getNome());

        System.out.println("SALARIO: " + funcionario.getSalario());

    }
}
