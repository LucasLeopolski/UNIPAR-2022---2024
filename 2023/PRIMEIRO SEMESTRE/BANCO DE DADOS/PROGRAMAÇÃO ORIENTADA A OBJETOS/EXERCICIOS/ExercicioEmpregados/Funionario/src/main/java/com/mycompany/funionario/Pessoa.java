/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funionario;
import java.util.Scanner; 

/**
 *
 * @author lucas
 */
public class Pessoa {
    public String nome; 
    public int anoNascimento, anoAtual;
    public int idade; 
   
    
    public void calcularIdade(){
       
       Scanner ler = new Scanner(System.in);
        System.out.println("Informe o ano de nascimento:  "); //para pegar a data em numero usar o site timestamp.online
        anoNascimento = ler.nextInt();
        System.out.println("Informe o ano atual: ");
        anoAtual= ler.nextInt();
        
        idade  = anoAtual - anoNascimento; 
        System.out.println("\nSua idade é: "+idade+" anos");
    }
    
}

