/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

/**
 *
 * @author Usuário
 */
public class BubbleSort implements Ordenavel {
    
    @Override
    public void ordenar(int [] numeros){
    
    boolean troca = true;

        while (troca) {
            troca = false;

            for (int i = 0; i < numeros.length-1; i++) {
                if(numeros[i] > numeros [i+1]){
                    int aux = numeros [i];
                    numeros[i] = numeros [i+1];
                    numeros[i+1] = aux; 
                    troca = true; 
                }

            }

        }
        for(int i=0; i < numeros.length; i++){
            System.out.println("Posição: ["+i+"] = "+numeros[i]);
        }

    
    }
    
}
