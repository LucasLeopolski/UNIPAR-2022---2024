/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.redefinicaometodo;

/**
 *
 * @author lucas
 */
public class RedefinicaoMetodo {

    public static void main(String[] args) {
        Animal animal = new Cachorro(); 
        animal.emitirSom(); // imprime "o cachorro latiu"
        animal = new Elefante(); // como não foi passado o metodo dentro da classe elefante ele vai herdar o que tem no metodo emitir som da classe animal (animal não identificado, som indefinido)
        animal.emitirSom();
        animal = new Gato(); 
        animal.emitirSom(); //imprime "o gato miou"
           
      
    }
}




// 