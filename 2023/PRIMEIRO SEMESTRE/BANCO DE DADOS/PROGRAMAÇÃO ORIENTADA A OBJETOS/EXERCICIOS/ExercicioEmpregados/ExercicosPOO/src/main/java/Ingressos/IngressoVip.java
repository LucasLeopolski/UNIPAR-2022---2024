/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ingressos;

/**
 *
 * @author lucas
 */
public class IngressoVip extends Ingressos {
    
    private float valorAdicional = 5.5f; 
    
    public IngressoVip(float aValor) {
        super(aValor);
    }
    
    public IngressoVip(){}

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
        return super.toString()+" Ingresso VIP: R$ "+ (super.getValor() + valorAdicional); 
    }
    
    
    
    }
    

