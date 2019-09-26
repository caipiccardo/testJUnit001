
package modelo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestRestar {
   @Test
    public void testRestar(){
       
        System.out.println("restar");
        Calculadora instance = new Calculadora(8,2);
        assertTrue(instance.restar()==6);

        
    }
}
