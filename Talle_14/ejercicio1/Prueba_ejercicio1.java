package Talle_14.ejercicio1;

public class Prueba_ejercicio1 {
    public static void main(String[] args) {

        Figura figura1 = new Circulo(5);
        Figura figura2 = new Rectangulo(4, 6);

        System.out.println("Área del círculo:");
        figura1.calcularArea();;

        System.out.println("\nÁrea del rectángulo:");
        figura2.calcularArea();;
    }
}
