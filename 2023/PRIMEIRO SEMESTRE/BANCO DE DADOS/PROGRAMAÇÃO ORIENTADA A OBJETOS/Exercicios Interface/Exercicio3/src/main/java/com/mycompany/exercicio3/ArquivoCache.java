/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio3;

/**
 *
 * @author Usuário
 */
public class ArquivoCache implements Armazenavel {
    
    @Override
   public void carregar(){
   
        System.out.println("Está carregando os arquivos");
   }

    @Override
    public void salvar() {
        
        System.out.println("Está salvando os arquivos");
    }
    
}
