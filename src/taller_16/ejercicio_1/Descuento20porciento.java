package taller_16.ejercicio_1;

public class Descuento20porciento extends Descuento {

    @Override
    public double calcularDescuento(double precio) {
        return precio * 0.20;
    }
}
