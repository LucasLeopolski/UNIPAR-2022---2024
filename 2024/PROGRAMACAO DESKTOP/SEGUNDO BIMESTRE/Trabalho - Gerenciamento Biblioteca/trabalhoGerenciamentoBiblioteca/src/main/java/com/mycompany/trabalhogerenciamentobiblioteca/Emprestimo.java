/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalhogerenciamentobiblioteca;

/**
 *
 * @author Usuário
 */
public class Emprestimo {
    
public Cliente NomeCliente;
   public Livro DescLivro;
   public int quantidade;
   public int diasDevolver;

   public Emprestimo(){}
   
   
    public Cliente getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(Cliente NomeCliente) {
        this.NomeCliente = NomeCliente;
    }

    public Livro getDescLivro() {
        return DescLivro;
    }

    public void setDescLivro(Livro DescLivro) {
        this.DescLivro = DescLivro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getDiasDevolver() {
        return diasDevolver;
    }

    public void setDiasDevolver(int diasDevolver) {
        this.diasDevolver = diasDevolver;
    }
}

