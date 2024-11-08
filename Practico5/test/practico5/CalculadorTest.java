package practico5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import static org.junit.Assert.*;

public class CalculadorTest {
    private static Calculador calculador;

    @Rule
    public TestName testName = new TestName();  //nombro el test

    public CalculadorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        calculador = new Calculador();
        System.out.println("Welcome to the test,dog ,hug!");
    }

    @Before
    public void setUp() {
        String methodName = testName.getMethodName();
        System.out.println("Testing metodo: " + methodName);
    }

    @After
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finalizo el testeo");
    }

    @Test
    public void testSumar() {
        double resultado = calculador.Sumar(2.7, 3.2);
        assertEquals(5.9, resultado, 0.001);
    }

    @Test
    public void testRestar() {
        double resultado = calculador.restar(2.7, 3.2);
        assertEquals(-0.5, resultado, 0.001);
    }

    @Test
    public void testMultiplicar() {
        double resultado = calculador.multiplicar(2.7, 3.2);
        assertEquals(8.64, resultado, 0.001);
    }

    @Test
    public void testDividir() {
        double resultado = calculador.divicion(2.7, 3.2);
        assertEquals(0.84375, resultado, 0.001);
    }
}
