/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio2;

/**
 * Crie uma interface chamada Ordenavel com um método ordenar() que recebe um
 * array de inteiros e o ordena em ordem crescente. Em seguida, implemente essa
 * interface em uma classe chamada BubbleSort que implementa o algoritmo de
 * ordenação Bubble Sort.
 *
 * @author Lucas Leopolski
 */
public class Exercicio2 {

    public static void main(String[] args) {

        int numeros[] = {40, 20, 10, 30, 80};
        
        Ordenavel iniciador = new BubbleSort();
        
        iniciador.ordenar(numeros);
    }
}
