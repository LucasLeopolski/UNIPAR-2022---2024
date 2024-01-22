/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 *Crie uma classe chamada Ingresso que possua um atributo valor e um método
toString que retorne à informação do valor do ingresso.
a) Crie uma classe IngressoVIP, que herda de Ingresso e possui um atributo
valor Adicional. O método toString da classe IngressoVIP deve considerar
que o valor do ingresso é o valor da superclasse somado ao valor Adicional
do IngressoVIP.
b) Crie uma classe para testar os objetos das classes Ingresso e IngressoVIP.
 *
//*/
package Ingressos;

/**
 *
 * @author lucas
 */
public class ExercicoIngressos {

    public static void main(String[] args) {
        Ingressos ingressoBasico  =new Ingressos(); 
        IngressoVip ingVip = new IngressoVip(); 
       
        
      //  System.out.println(ingressoBasico.toString());
        
        System.out.println(ingVip.toString());
       
    }
}
