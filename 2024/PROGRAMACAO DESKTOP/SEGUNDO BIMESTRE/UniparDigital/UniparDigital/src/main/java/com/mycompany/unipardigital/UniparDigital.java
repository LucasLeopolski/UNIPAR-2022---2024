    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unipardigital;

import javax.swing.JFrame;
import view.ViewCadastroAluno;
import view.ViewPrincipal;

/**
 *
 * @author Usuário
 */
public class UniparDigital {

    public static void main(String[] args) {
        ViewPrincipal view = new ViewPrincipal();
        view.setExtendedState(JFrame.MAXIMIZED_BOTH); // VAI MAXIMISAR A TELA QUANDO ABRIAR
        view.setVisible(true);
    }
}
