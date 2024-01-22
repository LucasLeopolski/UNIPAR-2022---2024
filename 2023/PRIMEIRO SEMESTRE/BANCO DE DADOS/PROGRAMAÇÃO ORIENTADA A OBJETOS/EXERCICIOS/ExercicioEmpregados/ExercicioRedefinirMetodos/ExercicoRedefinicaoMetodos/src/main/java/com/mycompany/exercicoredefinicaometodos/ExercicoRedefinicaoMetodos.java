/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicoredefinicaometodos;

/**
 *
 * @author lucas
 */
public class ExercicoRedefinicaoMetodos {

    public static void main(String[] args) {
        Animal animal1 = new Animal ();
        animal1.fazerBarulho(); // imprime o animal está fazndo barulho 
        
        Cachorro cachorro = new Cachorro();
        animal1.fazerBarulho(); // imprime o cachorro está latindo
        
        Gato gato = new Gato();
        animal1.fazerBarulho(); // imprime o gato está miando
    }
}

// é recomendado que siga o modelo do exemplo, pois aqui criamos tres classes para tres objestos uma animal outra cachorro e gato, já no exemplo
//passa todos com unico objeto. 