/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciooverride;

/**
 *
 * @author lucas
 */
public class Gato extends Animal {
    
@Override
     public void emitirSom(){
    
        System.out.println("O cachorro miou");
    }
   @Override 
   public void mover(){
       System.out.println("O gato se moveu");
   }
}

