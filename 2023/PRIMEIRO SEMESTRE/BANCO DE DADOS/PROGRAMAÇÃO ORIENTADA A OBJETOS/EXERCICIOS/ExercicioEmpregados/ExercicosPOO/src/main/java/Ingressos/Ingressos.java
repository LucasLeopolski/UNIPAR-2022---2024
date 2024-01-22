/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ingressos;

/**
 * @author lucas
 */
public class Ingressos {
    private float valor= 30.50f; 
    
    public  Ingressos(){
  
    }

    public Ingressos(float aValor) {
        this.valor = aValor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    public String toString() {
        return "Ingresso: "+valor; 
    }
    
    
    
}
