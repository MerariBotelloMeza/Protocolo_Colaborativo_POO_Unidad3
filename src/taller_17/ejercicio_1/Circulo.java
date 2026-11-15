package taller_17.ejercicio_1;

public class Circulo extends Figura {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        area = Math.PI * radio * radio;
        System.out.println("El area del circulo es: "+area);
        return area;
    }

}
