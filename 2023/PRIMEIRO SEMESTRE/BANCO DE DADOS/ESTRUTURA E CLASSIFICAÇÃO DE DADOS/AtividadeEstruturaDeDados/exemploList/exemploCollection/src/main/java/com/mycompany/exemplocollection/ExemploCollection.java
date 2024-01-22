/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exemplocollection;

import java.util.HashSet; // quando imprimir na tela os valores não serão ordenados; 
import java.util.Set; 
import java.util.TreeSet;// vai  imprimir os valores ordenados - ordem alfabética (Todos que começão com maiuscula depois todos que começão com minúscula)

/**
 *
 * @author lucas
 */
public class ExemploCollection {

    public static void main(String[] args) {
        Set<String> grupo1, grupo2;
        grupo1 = new HashSet<String>();//objeto que está implementando o Set
        grupo2 = new TreeSet<String>();//objeto que está implementando o Set
        String text1, text2, text3, text4, text5, text6;

        text1 = "Maria";
        text2 = "João"; //vai imprimir na tela as duas variaveis que contem o nome joão pois o sistema 
        text3 = "joão"; // entende que são diferentes valores por um começão com maiuscula e outro com minuscula. 
        text4 = "Lucas";
        text5 = "Lucas";// Aqui vai oimprimir apenas 1 dos valores, pois o sistema  entende que os valores estão duplicados
        text6 = "Natalia";
        
        grupo1.add(text1); grupo2.add(text1); // está adcionando a String no metodo Set
        grupo1.add(text2); grupo2.add(text2);
        grupo1.add(text3); grupo2.add(text3);  // sempre vai colocar a mesma String nos dois métodos
        grupo1.add(text4); grupo2.add(text4);
        grupo1.add(text5); grupo2.add(text5);
        grupo1.add(text6); grupo2.add(text6);
        System.out.println("Imprimindo HashSet:");
        for(String nome : grupo1){ //Está criando uma String do tipo nome que vai percorrer o grupo 1, e cada um dos valores encontrados serão armazenados dentro de nome
            System.out.print(nome+ ", ");
            
        }
        System.out.println("\n\nImprimindo Treeset:");
        for(String nome : grupo2){
        System.out.print(nome+", ");}
    }
}
