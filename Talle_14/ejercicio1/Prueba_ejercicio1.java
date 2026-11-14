package Talle_14.ejercicio1;

public class Prueba_ejercicio1 {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(4, 6);

        System.out.println("Área del círculo:");
        circulo.calcularArea();;

        System.out.println("\nÁrea del rectángulo:");
        rectangulo.calcularArea();;
    }
}
