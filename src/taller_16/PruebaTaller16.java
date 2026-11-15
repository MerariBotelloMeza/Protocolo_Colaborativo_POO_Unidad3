package taller_16;

import taller_16.ejercicio_1.AplicarDescuento;
import taller_16.ejercicio_1.Descuento;
import taller_16.ejercicio_1.Descuento10porciento;
import taller_16.ejercicio_1.Descuento20porciento;

public class PruebaTaller16 {

    public static void main(String[] args) {

        System.out.println("\nInicio del programa\n");

        /*Ejercicio 1:*/
        System.out.println("\nEjercicio 1:\n");
        AplicarDescuento aplicarDescuento1 = new AplicarDescuento();
        Descuento10porciento descuento10porciento = new Descuento10porciento();
        Descuento20porciento descuento20porciento = new Descuento20porciento();

        aplicarDescuento1.aplicarDescuento(descuento10porciento,0.1);
        aplicarDescuento1.aplicarDescuento(descuento20porciento,0.2);

    }

}
