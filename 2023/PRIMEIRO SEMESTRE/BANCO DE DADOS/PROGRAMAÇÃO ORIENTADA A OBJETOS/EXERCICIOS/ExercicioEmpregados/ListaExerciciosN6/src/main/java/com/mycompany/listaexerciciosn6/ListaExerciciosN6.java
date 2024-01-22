/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaexerciciosn6;

/**
 * 6 - Crie uma classe chamada "Pessoa" com atributos privados, como "nome" e "idade".
 * Utilize encapsulamento para permitir o acesso a esses atributos por meio de métodos getters e setters.
 *
 * @author lucas
 */
public class ListaExerciciosN6 {

    public static void main(String[] args) {
        String nome = "Um nome";
        int idade= 20; 
        
        Pessoa pessoas = new Pessoa();
        
        pessoas.setNome(nome);
        pessoas.setIdade(idade);
        
        System.out.println("NOME: "+pessoas.getNome());
        System.out.println("IDADE: "+pessoas.getIdade());
                
        
    }
}
