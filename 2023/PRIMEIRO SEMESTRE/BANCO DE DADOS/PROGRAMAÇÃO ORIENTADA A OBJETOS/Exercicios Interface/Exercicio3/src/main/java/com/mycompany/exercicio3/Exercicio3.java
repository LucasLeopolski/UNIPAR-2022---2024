/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio3;

/**
 *Crie uma interface chamada Armazenavel com dois métodos: salvar() 
 * e carregar(). Em seguida, implemente essa interface em uma 
 * classe chamada ArquivoCache que salva e carrega dados de 
 * um arquivo no sistema de arquivos
 * @author Lucas Leopolski 
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Armazenavel carregarArquivos = new ArquivoCache(); 
        Armazenavel salvarArquivos = new ArquivoCache();
        
        
        carregarArquivos.carregar();
        salvarArquivos.salvar();
    }
}
