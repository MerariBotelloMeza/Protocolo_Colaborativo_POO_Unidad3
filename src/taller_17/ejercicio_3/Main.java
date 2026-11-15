package taller_17.ejercicio_3;

public class Main {

    public void main(String[] args) {
        /*Ejercicio 3:*/
        System.out.println("\nEjercicio 3:\n");
        Transporte transporte = new Transporte();
        Transporte bicicleta = new Bicicleta();
        Transporte coche = new Coche();

        transporte.moverse();
        bicicleta.moverse();
        coche.moverse();

    }

}