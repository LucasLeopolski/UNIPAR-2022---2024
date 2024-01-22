/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplopesquisalinear;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class ExemploPesquisaLinear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int chave = Integer.parseInt(
                JOptionPane.showInputDialog("Informe o número a ser pesquisado "));
        
        int posicao = pesquisaLinear(chave, vetor);
        if(posicao >= 0){
             System.out.println("O Elemento "+chave+" está localizado na posição: "+posicao);
        
        }
        
        System.out.println("O Elemento "+chave+" não foi encontrado na sua lista");
    }

    /**
     * *
     *
     * @param chave: Elemento a ser pesquisado
     * @param vet: vetor onde será pesquisado o elemento
     * @return retorna a posição do elemento pesquisado ou -1 se não encontar
     */

    public static int pesquisaLinear(int chave, int[] vet) {

        for (int i = 0; i < vet.length; i++) {

            if (chave == vet[i]) {
                return i;
            }
        }
        return -1;

    }

}
