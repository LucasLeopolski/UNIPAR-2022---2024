/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplopesquisabinaria;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class ExemploPesquisaBinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int chave = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o número a ser pesquisado "));
    }
    
    public static int pesquisaBinaria(int chave, int[]vet){
    int esquerda, meio, direita;
    esquerda = 0; 
    direita = vet.length -1; 
    
    while (esquerda <= direita ){
    meio = (esquerda + direita) /2; 
    if(chave == vet [meio]){
    return meio; 
    }
    
    if (chave > vet [meio]){
    esquerda = meio +1; 
    
    }else{
        direita = meio -1; 
    }
    
    }
    
    return -1; 
    }
    
}
