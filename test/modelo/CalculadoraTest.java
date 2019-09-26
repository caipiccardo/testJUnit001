
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kame
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

    @Test
    public void testSumar(){
        
        System.out.println("Sumar");
        Calculadora instance = new Calculadora(8,2);
        assertTrue(instance.sumar()==10);
//        int expResult = 10;
//        int result = instance.sumar();
//        assertEquals(expResult, result);
        
    }
   
    @Test
    public void testRestar(){
       
        System.out.println("restar");
        Calculadora instance = new Calculadora(8,2);
        assertTrue(instance.restar()==6);
//        int expResult = 6;
//        int result = instance.restar();
//        assertEquals(expResult, result);
        
    }
    @Test
    public void testMultiplicar(){
      
        System.out.println("Multiplicar");
        Calculadora instance = new Calculadora(8,2);
        assertTrue(instance.multiplicar()==16);
//        int expResult = 16;
//        int result = instance.multiplicar();
//        assertEquals(expResult, result);
       
    }
    @Test
 public void testDividir(){
    
        System.out.println("Dividir");
        Calculadora instance = new Calculadora(8,2);
        assertTrue(instance.dividir()==4);
//        int expResult = 4;
//        int result = instance.dividir();
//        assertEquals(expResult, result);
        
}
    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
