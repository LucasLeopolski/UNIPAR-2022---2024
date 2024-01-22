/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenacaobolha;

/**
 *
 * @author lucas
 */
public class OrdenacaoBolha {

    public static void main(String[] args) {
        int[] vetorNumeros = {45, 20, 33, 40, 50, 2, 15, 88, 8};
        boolean houveTroca = true;
        
        while (houveTroca){
            houveTroca = false; 
            
            for(int i=0; i<vetorNumeros.length-1; i++ ){
                if(vetorNumeros[i] > vetorNumeros[i+1]){
                int aux = vetorNumeros[i];
                vetorNumeros[i] = vetorNumeros[i+1];
                vetorNumeros[i+1]= aux;
                houveTroca = true; 
                
                }
            
            }
        
        }
        for(int i=0; i < vetorNumeros.length; i++){
            System.out.println("Posicao ["+i+"] = "+vetorNumeros[i]);
        }
    }
}
