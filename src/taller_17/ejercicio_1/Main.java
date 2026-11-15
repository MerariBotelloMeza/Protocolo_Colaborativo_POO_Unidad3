package taller_17.ejercicio_1;

import java.awt.*;

public class Main {


    public static void main(String[] args) {
        /*Ejercicio 1:*/
        System.out.println("\nEjercicio 1:\n");

        Figura circulo = new Circulo(12);
        Figura rectangulo = new Rectangulo(8,13);

        circulo.calcularArea();
        rectangulo.calcularArea();

    }
}
