/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercico1;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author lucas
 */
public class Exercico1 {
    //*****EXERCICIO 1*****
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Boa noite!");
        System.out.println(lista);
        System.out.println("*********************************************");
        
        // *****EXERCICIO 2*****
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        for (int i =0; i< numeros.size(); i++){
            System.out.println(numeros.get(i));
            
        }
        System.out.println("*********************************************");
        //***** EXERCICIO 3*****
        
        ArrayList<Integer> numInt = new ArrayList<>();
        numInt.add(1);
        numInt.add(2);
        numInt.add(3);
        numInt.add(4);
        numInt.add(5);
        numInt.add(6);
        
        
        for(int a =0; a < numInt.size(); a++){
            if(numInt.get(a) %2==0){
                
            System.out.println("Números removidos foram:"+numInt.get(a));
            numInt.remove(a);
        }
        } 
    }
}
