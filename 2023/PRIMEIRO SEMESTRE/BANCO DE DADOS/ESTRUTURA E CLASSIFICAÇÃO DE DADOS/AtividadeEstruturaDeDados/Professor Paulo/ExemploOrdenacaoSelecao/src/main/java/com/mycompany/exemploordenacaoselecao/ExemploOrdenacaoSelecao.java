/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exemploordenacaoselecao;

/**
 *
 * @author lucas
 */
public class ExemploOrdenacaoSelecao {

    public static void main(String[] args) {
        int[] vetorNumeros = {45, 20, 33, 40, 50, 2, 15, 88, 8}; // vetor sempre com laço de repetição 

        for (int i = 0; i < vetorNumeros.length - 1; i++) { // i igual a 0 ; i menor que o tamanho do vetor -1
            int posicaoMenor = i;

            for (int j = i + 1; j < vetorNumeros.length; j++) {
                
                if(vetorNumeros[j]< vetorNumeros[posicaoMenor]){
                posicaoMenor = j;
                
                
                }

            }
            
            if(posicaoMenor != i){
            int aux = vetorNumeros[i];
            vetorNumeros[i] = vetorNumeros[posicaoMenor];
            vetorNumeros[posicaoMenor] = aux;
            
            }
        }
        
        for(int i=0; i < vetorNumeros.length; i++){
            System.out.println("Posição ["+i+"] = "+vetorNumeros[i]);
    
    }
    }
}
