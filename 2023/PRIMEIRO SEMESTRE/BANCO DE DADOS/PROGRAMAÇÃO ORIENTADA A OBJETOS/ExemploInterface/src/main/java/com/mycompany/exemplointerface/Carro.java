/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplointerface;

/**
 *
 * @author lucas
 */
public class Carro implements Veiculo {
    //implementação dos métodos da interface
  
    public void acelerar(){
        System.out.println("Carro acelerando...");
    }
    
    public void frear(){
    
        System.out.println("Carro freando");
    }
}
