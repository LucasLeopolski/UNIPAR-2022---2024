/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemploinsert;

/**
 *
 * @author lucas
 */
public class ExemploInsert {

    public static void main(String[] args) {
        
     int [] vetorNumeros = {30, 20, 10, 40};
    int chave; // criando elemento 
    
    int j; // vai ser o indice do segundo for - foi criado forá pois será usado fora do for
    
    for(int i = 1; i< vetorNumeros.length; i++ ){ 
    chave = vetorNumeros[i];
    
    for(j = i -1; j >= 0 && vetorNumeros[j] > chave; j--){
        
        vetorNumeros[j+1] = vetorNumeros[j];
        
    }
    vetorNumeros[j+1] = chave; 
    
    }
    
            }
}

