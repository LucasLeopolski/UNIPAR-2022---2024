/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplopolimorfismo;

/**
 *
 * @author lucas
 */
public class Circulo extends Forma{
   public void desenhar(){                              //OVERRIDE
      System.out.println("Desenhando circulo");       //    |           AQUI ESTAMOS FAZERNDO UM OVERLOAD DO OVERRIDE ( PARA FAZER O OVERLOAD PEGO 
   }                                                    //    V                                                         O MESMO METODO DO OVERRIDE E ADICIONO                                                                                                  
                                                        //                                                              OS PARAMETROS(INT TAMANHO)E CONCATENO)
        public void desenhar(int tamanho){              //OVERLOAD                                                      O PARAMETRO TAMANHO NA SAIDA DE DADOS)
      System.out.println("Desenhando circulo"+tamanho);
   }
      
    }
    
