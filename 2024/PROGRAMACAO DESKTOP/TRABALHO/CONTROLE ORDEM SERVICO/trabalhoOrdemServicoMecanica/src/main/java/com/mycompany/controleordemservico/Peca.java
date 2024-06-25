/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controleordemservico;

/**
 *
 * @author Usuário
 */
public class Peca {
    
    private String peca;
    private double valor;
    private int quantidade;

    public Peca(String peca, double valor, int quantidade) {
        this.peca = peca;
        this.valor = valor;
        this.quantidade = quantidade;
    }
    
    public Peca(){}

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
}
