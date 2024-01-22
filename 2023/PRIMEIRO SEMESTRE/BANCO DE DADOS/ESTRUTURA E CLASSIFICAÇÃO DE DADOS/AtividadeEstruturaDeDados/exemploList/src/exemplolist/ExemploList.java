/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplolist;
import java.util.ArrayList; 
import java.util.List; 
/**
 *
 * @author lucas
 */
public class ExemploList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();
        int i =0; 
        while (i< 10){
        Usuario atual = new Usuario("Nome: "+i, "Sobrenome "+i);
        usuarios.add(atual);
        i++;
        }
        System.out.println(usuarios.get(0).getFirstName());
        System.out.println(usuarios.get(0).getLastName());

    }
    
    
}
