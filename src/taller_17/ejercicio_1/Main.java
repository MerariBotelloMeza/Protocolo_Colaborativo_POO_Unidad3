package taller_17.ejercicio_1;

public class Main {


    public static void main(String[] args) {
        /*Ejercicio 1:*/
        System.out.println("\nEjercicio 1:\n");

        Figura circulo = new Circulo(12);
        System.out.println("El area del circulo es: " + circulo.calcularArea());

        Figura rectangulo = new Rectangulo(8,13);
        System.out.println("El area rectangulo es: " + rectangulo.calcularArea());

    }
}
