/*
Considere a interface abaixo e desenvolva um aplicativo que calcule o IR de uma pessoa:
Calculando a renda bruta anual a base de cálculo e o imposto devido. As regras são: Se a
renda anual for menor que R$ 18.00000 o imposto a pagar é 0. Para renda entre R$
18.00001 e 27.00000 a alíquota é de 15% sobre o excedente. Acima de R$ 27.00000 o
imposto é de R$ 1.35000 MAIS a alíquota de 275% sobre o excedente. Para cada
dependente pode-se abater 30000 da base de cálculo. Além disso pode-se lançar
deduções (despesas médicas estudo etc )
Renda Bruta = 3.00000 x 12
Dependentes = 2 x 30000 x 12
Base de Cálculo = 36.00000 - 7.20000 - 5.00000 = 23.80000
Imposto = 15% sobre 5.80000

*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculoimpostoderenda;

/**
 *
 * @author Usuário
 */
public class CalculoImpostoDeRenda {

    public static void main(String[] args) {
        new FrameImpostoRenda().setVisible(true);
    }
}
