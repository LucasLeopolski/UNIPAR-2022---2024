/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaexercicicosn10;

/**
 *10 - Crie uma classe chamada "Veiculo" com atributos privados, como "marca" e "ano".
 * Utilize encapsulamento para permitir o acesso a esses atributos por meio de métodos getters e setters. 
 * Em seguida, crie uma classe chamada "Carro" que herda da classe "Veiculo" e possui um atributo privado "cor". 
 * Utilize encapsulamento para permitir o acesso ao atributo "cor" por meio de métodos getters e setters.
 * @author lucas
 */
public class ListaExercicicosN10 {

    public static void main(String[] args) {
        String cor = "Preto";
        int ano = 2008;
        
        Carro carros = new Carro (); 
        
        carros.setCor(cor);
        carros.setAno(ano);
        
        System.out.println("COR: "+carros.getCor());
        System.out.println("ANO: "+carros.getAno());
        
    }
}
