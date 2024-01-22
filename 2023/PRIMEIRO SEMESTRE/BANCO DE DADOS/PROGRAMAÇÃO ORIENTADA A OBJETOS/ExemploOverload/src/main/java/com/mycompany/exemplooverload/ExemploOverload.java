/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplooverload;

/**
 *
 * @author lucas
 */
public class ExemploOverload {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora ();
        int resultado1 = calc.somar(2,3);
        double resultado2 = calc.somar(2.5, 3.5);
        int resultado3 = calc.somar(2, 3, 4);
        
        // PODE MUDAR PARA DEFINIR OVERLOAD
        // quantidade de parametros, tipo dos parametros, ordem dos parametros, nome parametros ou retorno do método 
    }
}

//OVERLOAD:
// QUANDO REDEFINO O METODO;  O METODO TEM O MESMO NOME MAS MUDA UMA CARACTERISTICA E A AÇÃO DO METODO MUDA

