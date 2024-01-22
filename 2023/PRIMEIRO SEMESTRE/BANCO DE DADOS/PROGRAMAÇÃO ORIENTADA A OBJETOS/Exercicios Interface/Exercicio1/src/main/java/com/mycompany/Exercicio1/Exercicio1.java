/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Exercicio1;

/**
 *Crie uma interface chamada Desenhavel com um método desenhar() 
 * que não retorna nada. Em seguida, implemente essa interface
 * m três classes diferentes: Circulo, Retangulo e Triangulo. 
 * Cada classe deve implementar o método desenhar() para exibir o 
 * nome da forma geométrica correspondente.
 * 
 * @author LUCAS LEOPOLSKI
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Desenhavel desenhandoCirculo = new Circulo();
        Desenhavel desenhandoTriangulo = new Triangulo(); 
        Desenhavel desenhandoRetangulo= new Retangulo();
        
        desenhandoCirculo.desenhar();
        desenhandoTriangulo.desenhar();
        desenhandoRetangulo.desenhar();
    }
}
