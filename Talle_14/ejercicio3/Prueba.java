package Talle_14.ejercicio3;

public class Prueba {
    public static void main(String[] args) {

        // Uso incorrecto del polimorfismo

        //Animal animal = new Pajaro();
        //animal.hacerSonido();
       //animal.cantar();

        /*
        * Se presenta un error de compilación porque la referencia animal
        * es de tipo Animal y esta clase no tiene declarado el metodo cantar().unque
        * el objeto creado es un Pajaro, Java solamente permite acceder directamente
        * a los métodos que están definidos en el tipo de referencia.*/

        // la manera correcta
        Pajaro pajaro = new Pajaro();
        pajaro.cantar();

        // prueba del punto 2
        Animal animal = new Animal();
        Animal pajaro1 = new Pajaro();

        animal.comer();
        pajaro1.comer();
    }
}
