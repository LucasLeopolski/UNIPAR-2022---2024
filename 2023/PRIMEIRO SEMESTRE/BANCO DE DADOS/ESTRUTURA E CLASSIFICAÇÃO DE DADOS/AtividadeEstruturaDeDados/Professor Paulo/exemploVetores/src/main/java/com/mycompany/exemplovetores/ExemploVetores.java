/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplovetores;

import javax.swing.JOptionPane; // biblioteca para abrir uma tela solictando os dados para o usuário 

/**
 *
 * @author lucas
 */
public class ExemploVetores {

    public static void main(String[] args) { // metodo estanciado quando inicia a aplicaçaõ java - TODO PROJETO DEVE TER  ( não pode ter duas classes main no mesmo projeto)
        
        String[] vetorNomes = new String [5];// o que define que é um vetor são os cochetes
        
        vetorNomes [0] = "Juca";  // psassando valores para os indices dos vetores - indice 0
        vetorNomes [1] = "José";  // indice 1 
        
        for(int i =0 ; i < vetorNomes.length; i++){ // length retorna o tamanho do vetor
        String nome = JOptionPane.showInputDialog("Informe um nome: "); //JOptionPane nome da biblioteca; showInputDialog é o tipo dedo que eu quero que entre 
        vetorNomes[i] = nome; 
        
        }
        String mensagem = "";
        for (int i = 0; i < vetorNomes.length; i++) {
            mensagem += "Posição: ["+i+"] => "+vetorNomes[i]+"\n";    // += sisgnifica que está concatenando com a variável
        }
        
        JOptionPane.showMessageDialog(null, mensagem); // esta biblioteca serva para colocar a telinha por sima da aplicação 
        
    }
}
