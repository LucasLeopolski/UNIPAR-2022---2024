/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculadora;

/**
 * 1. Calculadora Simples Exercício: Crie um programa que leia dois números
 * inteiros e exiba a soma, subtração, multiplicação e divisão (se o divisor não
 * for zero) desses números.
 *
 * @author Usuário
 */
import java.util.Scanner;

public class CALCULADORA {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double num1 = 0, num2 = 0;
        double multiplicacao, divisao = 0, soma, subtracao;

        System.out.println("Informe o Primeiro número: ");
        num1 = ler.nextDouble();
        System.out.println("Informe o Segundo número: ");
        num2 = ler.nextDouble();

        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;

        if (Double.isInfinite(divisao)) {
            System.out.println("erro");
        }
        if (num2 != 0) {
            divisao = num1 / num2;
        } else {
            System.out.print("Divisão por zero não permitida. ");
        }

        System.out.println("Soma: " + soma + " Subtracao: " + subtracao + " Multiplicacao: " + multiplicacao + " Divisao: " + divisao);
    }
}
