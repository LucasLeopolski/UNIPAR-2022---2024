/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalhogerenciamentobiblioteca;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Usuário
 */
public class TrabalhoGerenciamentoBiblioteca {

    public static void main(String[] args) {
        Controller.clienteArray = new ArrayList<>();
        Controller.livrosArray = new ArrayList<>();
        
        new FrameMenu().setVisible(true);
      
    }
}
