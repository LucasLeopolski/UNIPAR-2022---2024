/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Empregados;

/**
 *) A classe Empregado deve possuir dois atributos, nome e salario. Salario deve
ser do tipo protected. Crie os métodos get e set para classes e o método toString.
b) As classes Gerente deve herdar da classe Empregado. Crie os métodos get e set
para a classe e o método toString. O método toString da classe Gerente deve
incluir a informação do departamento, além dos dados da superclasse. O
construtor da classe deve receber por parâmetro, além as informações da
superclasse, a informação do departamento.
c) A classe Vendedor deve herdar também da classe Empregado. Deve possuir
ainda um método denominado calcularSalario. Esse método deve retornar
um valor do tipo float, correspondente ao valor do salário acrescido do
respectivo percentual de comissão. O construtor da classe deve receber por
parâmetro, além as informações da superclasse, a informação do percentual de
comissão do vendedor. O método toString da classe deve apresentar as
informações de nome do empregado, salário sem comissão, salario com
comissão e percentual de comissão.
d) Crie uma classe para testar objetos das classes implementadas.
 * @author lucas
 */
public class ExercicioEmpregados {

    public static void main(String[] args) {
        Empregado e1 = new Empregado(); 
       
        System.out.println(e1.toString());
       
    }
}
