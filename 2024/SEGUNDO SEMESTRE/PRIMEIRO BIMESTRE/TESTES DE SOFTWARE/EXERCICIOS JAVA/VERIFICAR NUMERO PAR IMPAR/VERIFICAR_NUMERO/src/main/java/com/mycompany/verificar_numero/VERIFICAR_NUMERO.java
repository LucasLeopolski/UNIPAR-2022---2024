    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     */

    package com.mycompany.verificar_numero;

    import java.util.Scanner;

    /**
     *2. Verificador de Número Par ou Ímpar
    Exercício: Crie um programa que determine se um número digitado pelo usuário é par ou
    ímpar.
     * @author Usuário
     */
    public class VERIFICAR_NUMERO {
        public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            int num ; 

            System.out.println("Informe um número: ");
            num = ler.nextInt();

             
            if( num % 2 == 0){
                System.out.println("Numero Par! ");
            }
            else{
                System.out.println("Numero Impar!");}
        }
    }
