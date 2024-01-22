/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplointerface;

/**
 *
 * @author lucas
 */
public class ExemploInterface {

    public static void main(String[] args) {
        Veiculo veiculo1 = new Carro(); //passando a classe Carro
        Veiculo veiculo2 = new Moto();  //passando a classe Moto
        Veiculo veiculo3 = new Animal(); //passando a classe Animal
        
        
        veiculo1.acelerar(); // imprimindo a classe Carro com o metodo acelerar 
        veiculo2.acelerar(); // imprimindo a classe Carro com o metodo acelerar 
        veiculo3.frear(); // imprimindo a classe Animal com o metodo frear 
        
    }
}
