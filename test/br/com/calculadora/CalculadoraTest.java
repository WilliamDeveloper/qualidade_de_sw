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
        assertEquals(4, calculadora.doSomar(2,2));        
    }
    /*
    @Test
    public void testaSeDoisMaisDoisIgualACinco(){
        assertEquals(5, calculadora.doSomar(2,2));        
    }
    */
    @Test
    public void testaDoisMultiplicadoPorOitoIgualADeZesseis(){
        assertEquals(16, calculadora.doMultiplicar(2,8));        
    }

    @Test
    public void testaOitoDivididoPorDoisIgualQuatro(){
        assertEquals(4, calculadora.doDividir(8,2));        
    }
    
    @Test
    public void testaOitoMenosTresIgualCinco(){
        assertEquals(5, calculadora.doSubtrair(8,3));        
    }
    
    @Test
    public void testaRaizQuadradaDeOitentaEUmIgualNove(){
        assertEquals(9, calculadora.doRaiz(81,2));        
    }
    
    @Test
    public void testaTresElevadoATresIgualVinteESete(){
        assertEquals(27, calculadora.doPotencia(3,3));        
    }
}
