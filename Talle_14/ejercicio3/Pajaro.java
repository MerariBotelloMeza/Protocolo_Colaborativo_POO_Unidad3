package Talle_14.ejercicio3;

public class Pajaro extends Animal {

    public void cantar(){
        System.out.println("los pajaritos canta");
    }

    @Override
    public void comer() {
        System.out.println("El pajaro está comiendo");
    }
}
