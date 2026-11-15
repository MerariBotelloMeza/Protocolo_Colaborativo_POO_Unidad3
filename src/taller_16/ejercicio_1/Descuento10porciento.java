package taller_16.ejercicio_1;

public class Descuento10porciento extends Descuento {

    @Override
    public double calcularDescuento(double precio) {
        return precio * 0.10;
    }

}
