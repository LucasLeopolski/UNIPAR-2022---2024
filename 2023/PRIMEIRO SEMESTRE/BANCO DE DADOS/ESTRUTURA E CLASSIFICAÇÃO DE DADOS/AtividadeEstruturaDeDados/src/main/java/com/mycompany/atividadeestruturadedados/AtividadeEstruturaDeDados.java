/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadeestruturadedados;
import java.util.List; 
import java.util.ArrayList;
/**
 *
 * @author lucas
 */
public class AtividadeEstruturaDeDados {

    public static void main(String[] args) {
       
           //está criando uma lista do tipo string
        List<String> lista = new ArrayList<String>();
        lista.add("elemento1");
        lista.add("elemento2");
        lista.add("elemento3");
        System.out.println(lista); //está imprimindo a lista com o conteudo lado a lado 
        
       for(String itensLista: lista)  //o for do tipo string criou um controlador que vai percorrer a lista
       System.out.println(itensLista);// está imprimindo os itens da lista um em cima do outro
            
      
        // criando uma lista de números 
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        
        for(int i = 0; i < numeros.size(); i++){ //metodo size retorna o tamanho da lista
        System.out.println(numeros.get(i));}
    }
}
