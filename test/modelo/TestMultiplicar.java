
package modelo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class TestMultiplicar {
        @Test
    public void testMultiplicar(){
      
        System.out.println("Multiplicar");
        Calculadora instance = new Calculadora(8,2);
        assertTrue(instance.multiplicar()==16);

       
    }
}
