/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciooverride;

/**
 *
 * @author lucas
 */
public class ExercicioOverride {

    public static void main(String[] args) {
     Animal animal1 = new Cachorro(); 
        animal1.emitirSom();
        animal1.mover();
        
        Animal animal2 = new Gato();
        animal2.emitirSom();
        animal2.mover();
        
    }
    
}
