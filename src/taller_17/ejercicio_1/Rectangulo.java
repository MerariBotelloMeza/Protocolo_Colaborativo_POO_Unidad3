package taller_17.ejercicio_1;

public class Rectangulo extends Figura {
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        area = base * altura;
        System.out.println("El area del rectangulo es: "+area);
        return area;
    }

}
