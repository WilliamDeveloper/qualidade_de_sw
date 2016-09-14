package br.com.calculadora;



import br.com.calculadora.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculadoraTest {

    private Calculadora calculadora;
    
    
    @Before
    public void inicializa(){
        calculadora = new Calculadora();
    }
   
    @Test
    public void testaSeDoisMaisDoisIgualAquatro(){        
        //fail("Não foi implementado sei la");
        assertEquals(4, calculadora.soma(2,2));        
    }
    
        @Test
    public void testaSeDoisMaisDoisIgualACinco(){
        assertEquals(5, calculadora.soma(2,2));        
    }

}
