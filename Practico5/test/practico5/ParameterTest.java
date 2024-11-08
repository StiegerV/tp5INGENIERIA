package practico5;

import java.util.Arrays;
import java.util.Collection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterTest {
    private static Calculador calculador;
    private double nUno;
    private double nDos;
    private double expected;

    public ParameterTest(double nUno, double nDos, double expected) {
        this.nUno = nUno;
        this.nDos = nDos;
        this.expected = expected;
    }

    @BeforeClass
    public static void setUpClass() {
        calculador = new Calculador();
        System.out.println("Pruebas ParameterTest");
    }

    @Parameters
    public static Collection<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][] {
            {8, 7, 15}, {2, 0, 2}, {10, -1, 9} //cambiamos la expectativa del numero por la expectativa correcta
                
        });
    }

    @Test
    public void testSuma() {
        double resultado = calculador.Sumar(nUno, nDos);
        assertEquals(expected, resultado, 0.001);
    }

    @AfterClass
    public static void tearDownClass() {
    }
}
