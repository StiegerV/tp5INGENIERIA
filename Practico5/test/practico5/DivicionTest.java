/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DivicionTest {
    private static Calculador calculador;

    public DivicionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        calculador = new Calculador();
        System.out.println("Test para divisiones");
    }

    @Test(expected = ArithmeticException.class)
    public void testDivicionPorCero() {
        calculador.divicion(3.8, 0);
    }

    @AfterClass
    public static void tearDownClass() {
    }
}
