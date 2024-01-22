/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaexerciciocn7;

/**
 * 7 - Crie uma classe chamada "Aluno" que herda da classe "Pessoa" e possui um atributo privado "matricula".
 * Utilize encapsulamento para permitir o acesso ao atributo "matricula" por meio de métodos getters e setters.
 *
 * @author lucas
 */
public class ListaExerciciocN7 {

    public static void main(String[] args) {
        String matricula = "999"; 
        
        Aluno alunos = new Aluno(); 
        
        alunos.setMatricula(matricula);
        
        System.out.println("MATRICULA: "+alunos.getMatricula());
        
        
        
    }
}
