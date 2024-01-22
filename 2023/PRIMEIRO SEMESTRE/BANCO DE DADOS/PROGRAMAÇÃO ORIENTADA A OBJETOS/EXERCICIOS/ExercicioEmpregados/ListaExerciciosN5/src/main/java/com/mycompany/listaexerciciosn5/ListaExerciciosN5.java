/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaexerciciosn5;

import java.util.Scanner;

/**5 - Crie uma classe chamada "Gerente" que herda da classe "Funcionario" 
 * e possui um atributo privado "bonus". Utilize encapsulamento para permitir o 
 * acesso ao atributo "bonus" por meio de métodos getters e setters.
 *
 * @author lucas
 */
public class ListaExerciciosN5 {

    public static void main(String[] args) {
        float bonus; 
        
        Scanner Ler = new Scanner(System.in);
        
        Gerente gerentes = new Gerente(); 
        
        
        System.out.println("Informe o bonus: "); 
        gerentes.setBonus(bonus=Ler.nextFloat());
        System.out.println("==========================================");
        System.out.println("BONUS : "+gerentes.getBonus());
        
    }
}
