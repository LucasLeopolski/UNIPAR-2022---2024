/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empregados;

/**
 *
 * @author lucas
 */
public class Gerente extends Empregado{
    private String departamento; 
    
    
    public Gerente() {
        
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

 
    
    @Override
    public String toString() {
        return "DEPARTAMENTO: "+departamento +"\nNOME: "+ super.getNome()+ "SALARIO: R$"+ super.getSalario();
    }
    
}
