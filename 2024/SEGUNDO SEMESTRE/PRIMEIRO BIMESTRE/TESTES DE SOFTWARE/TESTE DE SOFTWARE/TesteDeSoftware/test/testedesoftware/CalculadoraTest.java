/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testedesoftware;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author Usuário
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of somar method, of class Calculadora.
     */
//    @Test
//    public void testSomar1() {
//        System.out.println("somar");
//        int a = 0;
//        int b = 0;
//        Calculadora instance = new Calculadora();
//        int expResult = 0;
//        int result = instance.somar(a, b);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//        
//        
//    };;
    
    @Test
    public void testSomar(){
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(2, 3);
        assertEquals(5, resultado, "A soma de 2 + 3 deve ser 5");
        }
    
    @Test
     public void testSubtrair(){
        Calculadora calc = new Calculadora();
        int resultado = calc.subtrair(2, 2);
        assertEquals(0, resultado, "A subtração de 2 - 2  deve ser 0");
        }
     
     @Test
      public void testMultiplicacao(){
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicar(2, 3);
        assertEquals(6, resultado, "A multiplicação de 2 * 3 deve ser 6");
        }
      
      
      @Test
       public void testDividir(){
        Calculadora calc = new Calculadora();
        double resultado = calc.dividir(4.0, 2.0);
        assertEquals(2.0, resultado, "A divisão de 4.0 / 2.0 deve ser 2.0");
        }
    }
    
   

    

