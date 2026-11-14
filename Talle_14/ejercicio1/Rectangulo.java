package Talle_14.ejercicio1;

public class Rectangulo extends Figura {

    double base;
    double altura;

    public Rectangulo (double base, double altura ){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea(){
        double area= base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }
}
