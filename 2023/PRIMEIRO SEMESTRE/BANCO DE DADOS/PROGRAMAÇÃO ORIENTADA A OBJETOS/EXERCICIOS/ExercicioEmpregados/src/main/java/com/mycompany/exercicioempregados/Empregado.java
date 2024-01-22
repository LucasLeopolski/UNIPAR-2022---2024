/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioempregados;

/**
 *
 * @author lucas
 */
public class Empregado {
    
    private String nome = " ANA"; 
    protected float salario = 1400.50f; 
    
    public Empregado(){}

    public Empregado(String nome, float salario) {
        this.nome = nome; 
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empregado(" + "nome=" + nome + ", salario" + salario + ')';
    }
    
        
    
}
