package practico5;

public class Practico5 {
    public static void main(String[] args) {
        Calculador calculador = new Calculador();
        double nUno = 2.7;
        double nDos = 3.2;
        System.out.println("Suma: " + calculador.Sumar(nUno, nDos));
        System.out.println("Resta: " + calculador.restar(nUno, nDos));
        System.out.println("Multiplicación: " + calculador.multiplicar(nUno, nDos));
        try {
            System.out.println("División: " + calculador.divicion(nUno, nDos));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
