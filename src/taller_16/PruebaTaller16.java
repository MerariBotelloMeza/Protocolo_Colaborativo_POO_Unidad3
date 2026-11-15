package taller_16;

import taller_16.ejercicio_1.*;

public class PruebaTaller16 {

    public static void main(String[] args) {

        System.out.println("\nInicio del programa\n");

        /*Ejercicio 1:*/
        System.out.println("\nEjercicio 1:\n");
        AplicarDescuento gestor = new AplicarDescuento();
        double precio = 1000000; //Variable de valor base para aplicar el descuento
        Descuento descuento10 = new Descuento10porciento();//Descuento del 10% al valor de precio
        Descuento descuento20 = new Descuento20porciento();//Descuento del 20% al valor de precio
        Descuento descuentoFijo = new DescuentoFijo(150000);//Valor fijo de descuento

        System.out.println("Precio base: $" + precio);
        System.out.println("Precio con descuento del 10%: $" +gestor.aplicarDescuento(descuento10, precio));
        System.out.println("Precio con descuento del 20%: $" +gestor.aplicarDescuento(descuento20, precio));
        System.out.println("Precio con descuento fijo de $150.000: $"+gestor.aplicarDescuento(descuentoFijo, precio));

    }

}
